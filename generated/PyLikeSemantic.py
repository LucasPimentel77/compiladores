from antlr4 import TerminalNode
from generated.PyLikeParser import PyLikeParser
from generated.PyLikeVisitor import PyLikeVisitor

BUILTIN_SYMBOLS = {
    "number": "function",
    "float": "function",
    "int": "function",
    "str": "function",
    "input": "function",
    "print": "function",
}


class Symbol:
    def __init__(self, name, kind, type_=None, params=None):
        # name: nome do símbolo (identificador)
        # kind: define se é variável ou função.
        # type_: tipo do símbolo (NUMBER, STRING, etc.)
        # params: lista de parâmetros (para funções)
        # return_type: tipo de retorno (para funções)

        self.name = name
        self.kind = kind
        self.type_ = type_
        self.params = params or []
        self.return_type = None


class Scope:
    def __init__(self, parent=None):
        # parent: escopo pai (None se for o escopo global)
        self.parent = parent
        self.symbols = {}

    def define(self, symbol: Symbol):
        # verifica se o símbolo já está definido no escopo atual
        if symbol.name in self.symbols:
            raise Exception(f"Simbolo {symbol.name} já definido neste escopo")
        # adiciona um símbolo ao escopo atual
        self.symbols[symbol.name] = symbol

    def resolve(self, name: str):
        # procura um símbolo no escopo atual e, se não encontrar, no escopo pai
        symbol = self.symbols.get(name)
        if symbol is not None:
            return symbol

        # procura no escopo pai recursivamente
        if self.parent is not None:
            return self.parent.resolve(name)

        return None


class SemanticAnalyzer(PyLikeVisitor):
    def __init__(self):
        # inicializa o analisador semântico com o escopo global
        # precisa ser global para que todas as funções e variáveis sejam acessíveis
        # em qualquer lugar do programa
        self.global_scope = Scope()  # escopo global
        self.current_scope = self.global_scope  # escopo atual (inicia no global)
        self.errors = []  # lista de erros semânticos encontrados
        self.current_function = (
            None  # rastreia a função atual para verificação de retorno
        )
        self.current_type_return_type = None  # rastreia o tipo de retorno esperado
        self._register_builtins()

    def _register_builtins(self):
        for name, kind in BUILTIN_SYMBOLS.items():
            if self.global_scope.resolve(name) is None:
                self.global_scope.define(Symbol(name, kind, type_=None))

    def visitPrograma(self, ctx: PyLikeParser.ProgramaContext):
        # visita todas as declarações no programa
        for declaration in ctx.declaracao():
            self.visit(declaration)
        return self.errors

    def visitDeclaracaoFuncao(self, ctx: PyLikeParser.DeclaracaoFuncaoContext):
        name = ctx.ID().getText()
        params = []

        # coleta os parâmetros da função
        if ctx.listaParametros():
            for parametro in ctx.listaParametros().parametro():
                param_name = parametro.ID().getText()
                param_type = parametro.tipo().getText()
                params.append(Symbol(param_name, "variable", param_type))

        # verifica se a função já existe
        existing = self.current_scope.resolve(name)
        if existing and existing.kind == "function":
            self.errors.append(f"Erro semântico: Função '{name}' já definida.")
            return

        # cria símbolo da função
        # type_ aqui representa o tipo de retorno (inicialmente desconhecido)
        function_symbol = Symbol(name=name, kind="function", type_=None, params=params)
        self.current_scope.define(function_symbol)

        # cria novo escopo para o corpo da função
        previous_scope = self.current_scope
        self.current_scope = Scope(parent=previous_scope)

        # adiciona os parâmetros ao escopo da função
        for param in params:
            self.current_scope.define(Symbol(param.name, "variable", param.type_))

        previous_function = self.current_function
        self.current_function = name

        # visita o corpo da função
        self.visit(ctx.bloco())

        # restaura o escopo e função anteriores
        self.current_scope = previous_scope
        self.current_function = previous_function

    def visitAtribuicao(self, ctx: PyLikeParser.AtribuicaoContext):
        variable_name = ctx.ID().getText()
        # visita o lado direito da atribuição
        right_side = ctx.atribuivel()

        # pega os IDs usados no lado direito da atribuição
        usados = self.colectIDs(right_side)

        # verifica cada um deles
        for name in usados:
            symbol = self.current_scope.resolve(name)
            if symbol is None:
                self.errors.append(f"Erro semantico: Variável '{name}' não declarada.")
                return

        # verifica se a variável que tá recebendo o valor já foi declarada
        symbol = self.current_scope.resolve(variable_name)
        if symbol is None:
            self.current_scope.define(Symbol(variable_name, "variable", type_=None))

        self.visit(right_side)

    def colectIDs(self, ctx):
        # coleta todos os identificadores usados em um contexto
        encontrados = set()  # conjunto para evitar duplicatas

        # visita recursiva dos nós
        def visit_node(node):
            if node is None:
                return
            # verifica se o nó é um TerminalNode (folha)
            if isinstance(node, TerminalNode):
                # verifica se o terminal é um identificador
                token = node.getSymbol()
                if token.type == PyLikeParser.ID:
                    encontrados.add(token.text)
                return
            # visita os filhos do nó
            for child in node.getChildren():
                visit_node(child)

        visit_node(ctx)
        return encontrados

    def visitPrimario(self, ctx: PyLikeParser.PrimarioContext):
        # Caso seja um literal (número, string, booleano)
        if ctx.literal():
            return self.visit(ctx.literal())

        # Caso seja um identificador puro (x, y, etc.)
        if ctx.ID():
            return self.visitIdentificador(ctx)

        # Chamada de função já tem visitor próprio
        if ctx.chamadaFuncao():
            return self.visitChamadaFuncao(ctx.chamadaFuncao())

        # Expressao já tem visitor próprio
        if ctx.expressao():
            return self.visitExpressao(ctx.expressao())

        # Retorna None se nenhum dos casos acima for atendido
        return None

    def visitIdentificador(self, ctx):
        name = ctx.ID().getText()
        symbol = self.current_scope.resolve(name)

        # verifica se a variavel foi declarada, caso não tiver sido manda uma mensagem de erro
        if symbol is None:
            self.errors.append(f"Erro semantico: Variável '{name}' não declarada.")
            return

        # retorna o tipo da variável
        return symbol.type_

    def visitChamadaFuncao(self, ctx: PyLikeParser.ChamadaFuncaoContext):
        name = ctx.ID().getText()
        symbol = self.current_scope.resolve(name)

        # verifica se a função está definida
        if not symbol or symbol.kind != "function":
            self.errors.append(f"Erro semântico: Função '{name}' não definida.")
            return None

        # coleta os tipos reais dos argumentos passados na chamada
        actual_types = []
        if ctx.listaArgumentos():
            for expressao in ctx.listaArgumentos().expressao():
                argument_type = self.visit(expressao)
                actual_types.append(argument_type)

        # coleta os tipos esperados dos parâmetros da função
        expected_types = []
        for param in symbol.params:
            expected_types.append(param.type_)

        # verifica o número de parametros
        if len(actual_types) != len(expected_types):
            self.errors.append(
                f"Erro semântico: Função '{name}' espera {len(expected_types)} argumentos, mas {len(actual_types)} foram fornecidos."
            )
            return symbol.type_

        # verifica os tipos dos argumentos
        for index in range(len(actual_types)):
            # pega os tipos esperado e obtido
            got = actual_types[index]
            expected = expected_types[index]

            if got is None:
                continue  # erro já foi emitido

            if expected is not None and got != expected:
                self.errors.append(
                    f"Erro semântico: Argumento {index+1} da função '{name}' "
                    f"espera tipo '{expected}', mas recebeu '{got}'."
                )

        return symbol.type_

    def visitExpressao(self, ctx):
        # visita a expressão em cascata
        return self.visitChildren(ctx)

    def visitLogicoE(self, ctx: PyLikeParser.LogicoEContext):
        igualdades = ctx.igualdade()
        if not igualdades:
            return None

        if len(igualdades) == 1:
            return self.visit(igualdades[0])

        left_type = self.visit(igualdades[0])
        if left_type is None:
            return None

        if left_type != "bool":
            self.errors.append(
                "Erro semântico: Operador 'and' exige operandos booleanos."
            )
            return None

        for igualdade in igualdades[1:]:
            right_type = self.visit(igualdade)
            if right_type is None:
                return None

            if right_type != "bool":
                self.errors.append(
                    "Erro semântico: Operador 'and' exige operandos booleanos."
                )
                return None

        return "bool"

    def visitLogicoOu(self, ctx: PyLikeParser.LogicoOuContext):
        logicos_e = ctx.logicoE()
        if not logicos_e:
            return None

        if len(logicos_e) == 1:
            return self.visit(logicos_e[0])

        left_type = self.visit(logicos_e[0])
        if left_type is None:
            return None

        if left_type != "bool":
            self.errors.append(
                "Erro semântico: Operador 'or' exige operandos booleanos."
            )
            return None

        for logico_e in logicos_e[1:]:
            right_type = self.visit(logico_e)
            if right_type is None:
                return None

            if right_type != "bool":
                self.errors.append(
                    "Erro semântico: Operador 'or' exige operandos booleanos."
                )
                return None

        return "bool"

    def visitDeclaracaoRetorno(self, ctx: PyLikeParser.DeclaracaoRetornoContext):
        # verifica se o retorno está dentro de uma função
        if self.current_function is None:
            self.errors.append("Erro semântico: 'return' fora de uma função.")
        # visita a expressão de retorno
        if ctx.expressao():
            self.visit(ctx.expressao())

    def visitBloco(self, ctx: PyLikeParser.BlocoContext):
        # cria um novo escopo para o bloco
        previous_scope = self.current_scope
        self.current_scope = Scope(parent=previous_scope)

        for declaracao in ctx.declaracao():
            self.visit(declaracao)

        self.current_scope = previous_scope

    def visitLiteral(self, ctx: PyLikeParser.LiteralContext):
        # visita o literal (número, string, booleano)
        if ctx.NUMBER():
            return "number"
        if ctx.STRING():
            return "string"
        if ctx.TRUE() or ctx.FALSE():
            return "bool"
        if ctx.NONE():
            return "none"

    def visitUnario(self, ctx: PyLikeParser.UnarioContext):
        # serve para saber se é primario
        if ctx.primario():
            return self.visit(ctx.primario())

        # trata operadores unários
        operand = ctx.getChild(0).getText()
        operand_type = self.visit(ctx.unario())
        if operand_type is None:
            return None

        if operand == "not":
            if operand_type != "bool":
                self.errors.append(
                    "Erro semântico: Operador 'not' exige operando booleano."
                )
                return None
            return "bool"

        if operand == "-":
            if operand_type != "number":
                self.errors.append(
                    "Erro semântico: Operador unário '-' exige operando numérico."
                )
                return None
            return "number"

        return None

    def visitAdicao(self, ctx: PyLikeParser.AdicaoContext):
        multiplicacoes = ctx.multiplicacao()
        if not multiplicacoes:
            return None

        # começa pelo primeiro termo e valida cada operando subsequente
        left_type = self.visit(multiplicacoes[0])
        if left_type is None:
            return None

        for multiplicacao in multiplicacoes[1:]:
            right_type = self.visit(multiplicacao)
            if right_type is None:
                return None

            if left_type != "number" or right_type != "number":
                self.errors.append(
                    "Erro semântico: Operação de adição/subtração requer operandos do tipo 'number'."
                )
                return None

            # o resultado intermediário é sempre number se os operandos forem válidos
            left_type = "number"

        return "number"

    def visitMultiplicacao(self, ctx: PyLikeParser.MultiplicacaoContext):
        # visita os unários na multiplicação
        unarios = ctx.unario()
        if not unarios:
            return None

        # começa pelo primeiro termo e valida cada operando subsequente
        left_type = self.visit(unarios[0])
        if left_type is None:
            return None

        for unario in unarios[1:]:
            right_type = self.visit(unario)
            if right_type is None:
                return None

            if left_type != "number" or right_type != "number":
                self.errors.append(
                    "Erro semântico: Operadores de multiplicação, divisão e módulo requerem números."
                )
                return None

            left_type = "number"

        return "number"

    def visitComparacao(self, ctx: PyLikeParser.ComparacaoContext):
        # visita os adições na comparação
        adicoes = ctx.adicao()
        if not adicoes:
            return None

        # começa pelo primeiro termo e valida cada operando subsequente
        left_type = self.visit(adicoes[0])
        if left_type is None:
            return None

        for adicao in adicoes[1:]:
            right_type = self.visit(adicao)
            if right_type is None:
                return None

            if left_type != right_type:
                self.errors.append(
                    "Erro semântico: Operadores de comparação requerem operandos do mesmo tipo."
                )
                return None

            left_type = right_type

        if len(adicoes) == 1:
            return left_type

        return "bool"

    def visitIgualdade(self, ctx: PyLikeParser.IgualdadeContext):
        # visita os comparações na igualdade
        comparacoes = ctx.comparacao()
        if not comparacoes:
            return None

        # começa pelo primeiro termo e valida cada operando subsequente
        left_type = self.visit(comparacoes[0])
        if left_type is None:
            return None

        for comparacao in comparacoes[1:]:
            right_type = self.visit(comparacao)
            if right_type is None:
                return None

            if left_type != right_type:
                self.errors.append(
                    "Erro semântico: Operadores de igualdade requerem operandos do mesmo tipo."
                )
                return None

            left_type = right_type

        if len(comparacoes) == 1:
            return left_type

        return "bool"

    def visitLeia(self, ctx: PyLikeParser.LeiaContext):
        # Leia não é necessáriamente uma expressão que retorna um valor
        return

    def visitEscreva(self, ctx: PyLikeParser.EscrevaContext):
        # visita a expressão dentro do escreva
        for expressao in ctx.expressao():
            _ = self.visit(expressao)
            if _ is None:
                continue
        return

    def visitDeclaracaoPara(self, ctx: PyLikeParser.DeclaracaoParaContext):
        iteration_expression = ctx.expressao()
        iteration_type = self.visit(iteration_expression)
        if iteration_type is None:
            return

        previous_scope = self.current_scope
        self.current_scope = Scope(parent=previous_scope)

        loop_var_name = ctx.ID().getText()
        self.current_scope.define(Symbol(loop_var_name, "variable", type_=None))

        self.visit(ctx.bloco())

        self.current_scope = previous_scope

    def visitDeclaracao(self, ctx: PyLikeParser.DeclaracaoContext):
        # delega para o child correto
        return self.visitChildren(ctx)

    def visitComandos(self, ctx: PyLikeParser.ComandosContext):
        # delega para o child correto
        return self.visitChildren(ctx)

    def visitListaParametros(self, ctx: PyLikeParser.ListaParametrosContext):
        # delega para o child correto
        return self.visitChildren(ctx)

    def visitParametro(self, ctx: PyLikeParser.ParametroContext):
        # delega para o child correto
        return self.visitChildren(ctx)

    def visitTipo(self, ctx: PyLikeParser.TipoContext):
        # delega para o child correto
        return self.visitChildren(ctx)

    def visitListaArgumentos(self, ctx: PyLikeParser.ListaArgumentosContext):
        # delega para o child correto
        return self.visitChildren(ctx)

    # por padrão se chegamos em um nó sem visitor específico, visitamos os filhos
    def visitChildren(self, node):
        # fallback para visitar os filhos
        return super().visitChildren(node)
