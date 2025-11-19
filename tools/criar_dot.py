from antlr4.tree.Tree import TerminalNodeImpl


def antlr_tree_to_dot(tree, rule_names):
    """
    Gera uma string em formato DOT (Graphviz)
    a partir de uma árvore sintática do ANTLR.

    Parâmetros:
        tree        -> ParseTree (resultado de parser.regra())
        rule_names  -> parser.ruleNames
    Retorna:
        string DOT (pronta para salvar ou usar no Graphviz)
    """
    lines = ["digraph ParseTree {", 'node [shape=ellipse, fontname="Helvetica"];']

    def walk(node, parent_id=None, counter=[0]):
        this_id = counter[0]
        counter[0] += 1

        # Nome do nó: ou token terminal, ou nome da regra
        if isinstance(node, TerminalNodeImpl):
            label = node.getText()
        else:
            label = rule_names[node.getRuleIndex()]

        label = label.replace('"', '\\"')
        lines.append(f'node{this_id} [label="{label}"];')

        if parent_id is not None:
            lines.append(f"node{parent_id} -> node{this_id};")

        if hasattr(node, "children") and node.children:
            for child in node.children:
                walk(child, this_id)

    walk(tree)
    lines.append("}")
    return "\n".join(lines)
