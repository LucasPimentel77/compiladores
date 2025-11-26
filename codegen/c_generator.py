import json
from antlr4 import TerminalNode
from generated.PyLikeParser import PyLikeParser
from generated.PyLikeVisitor import PyLikeVisitor


class CCodeGenerator(PyLikeVisitor):
    def __init__(self):
        self._reset()

    def _reset(self):
        self.includes = ["#include <stdio.h>", "#include <stdlib.h>"]
        self.functions = []
        self.main_statements = []
        self.current_statements = self.main_statements
        self.scope_vars = []
        self._indent_level = 0

    def generate(self, tree):
        self._reset()
        self._enter_scope()
        self.visit(tree)
        self._exit_scope()
        return self._build_program()

    def _build_program(self):
        sections = []
        sections.extend(self.includes)
        sections.append("")
        if self.functions:
            sections.extend(self.functions)
            sections.append("")
        sections.append("int main(void) {")
        sections.extend(self.main_statements)
        sections.append("    return 0;")
        sections.append("}")
        return "\n".join(sections)

    def _emit(self, line):
        indent = "    " * max(self._indent_level, 0)
        self.current_statements.append(f"{indent}{line}")

    def _enter_scope(self):
        self.scope_vars.append(set())

    def _exit_scope(self):
        if self.scope_vars:
            self.scope_vars.pop()

    def _declare(self, name):
        if self.scope_vars:
            self.scope_vars[-1].add(name)

    def _is_declared(self, name):
        return any(name in scope for scope in reversed(self.scope_vars))

    def visitPrograma(self, ctx: PyLikeParser.ProgramaContext):
        for declaration in ctx.declaracao():
            self.visit(declaration)

    def visitDeclaracao(self, ctx: PyLikeParser.DeclaracaoContext):
        if ctx.declaracaoFuncao():
            self.visit(ctx.declaracaoFuncao())
            return
        if ctx.comandos():
            self.visit(ctx.comandos())
            return
        if ctx.declaracaoSe():
            self.visit(ctx.declaracaoSe())
            return
        if ctx.declaracaoEnquanto():
            self.visit(ctx.declaracaoEnquanto())
            return
        if ctx.declaracaoPara():
            self.visit(ctx.declaracaoPara())
            return
        if ctx.declaracaoRetorno():
            self.visit(ctx.declaracaoRetorno())
            return
        if ctx.atribuicao():
            self.visit(ctx.atribuicao())
            return
        if ctx.expressao():
            code, _ = self.visit(ctx.expressao())
            self._emit(f"{code};")
            return
        if ctx.bloco():
            self.visit(ctx.bloco())

    def visitComandos(self, ctx: PyLikeParser.ComandosContext):
        if ctx.escreva():
            self.visit(ctx.escreva())
        if ctx.leia():
            self.visit(ctx.leia())

    def visitEscreva(self, ctx: PyLikeParser.EscrevaContext):
        for expressao in ctx.expressao():
            value_code, value_type = self.visit(expressao)
            if value_type == "string":
                self._emit(f'printf("%s", {value_code});')
            elif value_type == "bool":
                self._emit(f'printf("%s", {value_code} ? "True" : "False");')
            else:
                self._emit(f'printf("%g", {value_code});')
        self._emit('printf("\\n");')

    def visitLeia(self, ctx: PyLikeParser.LeiaContext):
        # TODO: Implement input handling. Return placeholder so generator stays functional.
        return "0", "number"

    def visitDeclaracaoFuncao(self, ctx: PyLikeParser.DeclaracaoFuncaoContext):
        name = ctx.ID().getText()
        parameters = []
        if ctx.listaParametros():
            for parametro in ctx.listaParametros().parametro():
                parameters.append(parametro.ID().getText())

        previous_statements = self.current_statements
        function_body = []
        self.current_statements = function_body
        old_indent = self._indent_level
        self._indent_level = 0
        self._enter_scope()
        for parameter in parameters:
            self._declare(parameter)
        self.visit(ctx.bloco())
        self._exit_scope()
        self._indent_level = old_indent
        self.current_statements = previous_statements

        signature = (
            f"double {name}({', '.join('double ' + p for p in parameters)})"
            if parameters
            else f"double {name}(void)"
        )
        self.functions.append(signature)
        self.functions.extend(function_body)
        self.functions.append("")

    def visitBloco(self, ctx: PyLikeParser.BlocoContext):
        self._emit("{")
        self._indent_level += 1
        self._enter_scope()
        for declaration in ctx.declaracao():
            self.visit(declaration)
        self._exit_scope()
        self._indent_level -= 1
        self._emit("}")

    def visitDeclaracaoSe(self, ctx: PyLikeParser.DeclaracaoSeContext):
        conditions = ctx.condicao()
        blocks = ctx.bloco()
        for index, condition in enumerate(conditions):
            keyword = "if" if index == 0 else "else if"
            condition_code, _ = self.visit(condition)
            self._emit(f"{keyword} ({condition_code})")
            self.visit(blocks[index])
        if ctx.ELSE():
            self._emit("else")
            self.visit(blocks[len(conditions)])

    def visitCondicao(self, ctx: PyLikeParser.CondicaoContext):
        return self.visit(ctx.expressao())

    def visitDeclaracaoEnquanto(self, ctx: PyLikeParser.DeclaracaoEnquantoContext):
        condition_code, _ = self.visit(ctx.condicao())
        self._emit(f"while ({condition_code})")
        self.visit(ctx.bloco())

    def visitDeclaracaoPara(self, ctx: PyLikeParser.DeclaracaoParaContext):
        iterator = ctx.ID().getText()
        limit_code, _ = self.visit(ctx.expressao())
        self._emit(
            f"for (double {iterator} = 0; {iterator} < {limit_code}; {iterator} += 1)"
        )
        self.visit(ctx.bloco())

    def visitDeclaracaoRetorno(self, ctx: PyLikeParser.DeclaracaoRetornoContext):
        if ctx.expressao():
            value_code, _ = self.visit(ctx.expressao())
            self._emit(f"return {value_code};")
        else:
            self._emit("return 0;")

    def visitAtribuicao(self, ctx: PyLikeParser.AtribuicaoContext):
        name = ctx.ID().getText()
        value_code, _ = self.visit(ctx.atribuivel())
        declaration = "" if self._is_declared(name) else "double "
        if not self._is_declared(name):
            self._declare(name)
        self._emit(f"{declaration}{name} = {value_code};")

    def visitAtribuivel(self, ctx: PyLikeParser.AtribuivelContext):
        if ctx.expressao():
            return self.visit(ctx.expressao())
        if ctx.comandos():
            self.visit(ctx.comandos())
        return "0", "number"

    def visitExpressao(self, ctx: PyLikeParser.ExpressaoContext):
        return self.visit(ctx.logicoOu())

    def visitLogicoOu(self, ctx: PyLikeParser.LogicoOuContext):
        return self._binary(ctx, {"or": "||"}, "bool")

    def visitLogicoE(self, ctx: PyLikeParser.LogicoEContext):
        return self._binary(ctx, {"and": "&&"}, "bool")

    def visitIgualdade(self, ctx: PyLikeParser.IgualdadeContext):
        return self._binary(ctx, {"==": "==", "!=": "!="}, "bool")

    def visitComparacao(self, ctx: PyLikeParser.ComparacaoContext):
        return self._binary(ctx, {"<": "<", "<=": "<=", ">": ">", ">=": ">="}, "bool")

    def visitAdicao(self, ctx: PyLikeParser.AdicaoContext):
        return self._binary(ctx, {"+": "+", "-": "-"}, "number")

    def visitMultiplicacao(self, ctx: PyLikeParser.MultiplicacaoContext):
        return self._binary(ctx, {"*": "*", "/": "/", "%": "%"}, "number")

    def _binary(self, ctx, operators, fallback_type='number'):
        parts = []
        has_operator = False
        last_type = None
        for child in ctx.children:
            if isinstance(child, TerminalNode):
                text = child.getText()
                if text in operators:
                    has_operator = True
                    parts.append(f" {operators[text]} ")
                else:
                    parts.append(text)
            else:
                child_code, child_type = self.visit(child)
                parts.append(child_code)
                last_type = child_type
        result_type = fallback_type if has_operator else (last_type or fallback_type)
        return ''.join(parts), result_type

    def visitUnario(self, ctx: PyLikeParser.UnarioContext):
        if ctx.primario():
            return self.visit(ctx.primario())
        operator = ctx.getChild(0).getText()
        operand_code, operand_type = self.visit(ctx.unario())
        if operator == "not":
            return f"!({operand_code})", "bool"
        if operator == "-":
            return f"-({operand_code})", "number"
        return operand_code, operand_type

    def visitPrimario(self, ctx: PyLikeParser.PrimarioContext):
        if ctx.literal():
            return self.visit(ctx.literal())
        if ctx.ID():
            return ctx.ID().getText(), "number"
        if ctx.chamadaFuncao():
            return self.visit(ctx.chamadaFuncao())
        if ctx.expressao():
            return self.visit(ctx.expressao())
        return "0", "number"

    def visitLiteral(self, ctx: PyLikeParser.LiteralContext):
        if ctx.NUMBER():
            return ctx.NUMBER().getText(), "number"
        if ctx.STRING():
            return json.dumps(ctx.STRING().getText()), "string"
        if ctx.TRUE():
            return "1", "bool"
        if ctx.FALSE():
            return "0", "bool"
        return "0", "number"

    def visitChamadaFuncao(self, ctx: PyLikeParser.ChamadaFuncaoContext):
        name = ctx.ID().getText()
        args = []
        if ctx.listaArgumentos():
            for argument in ctx.listaArgumentos().expressao():
                argument_code, _ = self.visit(argument)
                args.append(argument_code)
        return f"{name}({', '.join(args)})", "number"
