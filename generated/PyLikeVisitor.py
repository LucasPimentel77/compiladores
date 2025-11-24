# Generated from grammar/PyLike.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .PyLikeParser import PyLikeParser
else:
    from PyLikeParser import PyLikeParser

# This class defines a complete generic visitor for a parse tree produced by PyLikeParser.

class PyLikeVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PyLikeParser#programa.
    def visitPrograma(self, ctx:PyLikeParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#declaracao.
    def visitDeclaracao(self, ctx:PyLikeParser.DeclaracaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#comandos.
    def visitComandos(self, ctx:PyLikeParser.ComandosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#bloco.
    def visitBloco(self, ctx:PyLikeParser.BlocoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#declaracaoFuncao.
    def visitDeclaracaoFuncao(self, ctx:PyLikeParser.DeclaracaoFuncaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#listaParametros.
    def visitListaParametros(self, ctx:PyLikeParser.ListaParametrosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#parametro.
    def visitParametro(self, ctx:PyLikeParser.ParametroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#tipo.
    def visitTipo(self, ctx:PyLikeParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#escreva.
    def visitEscreva(self, ctx:PyLikeParser.EscrevaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#leia.
    def visitLeia(self, ctx:PyLikeParser.LeiaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#declaracaoSe.
    def visitDeclaracaoSe(self, ctx:PyLikeParser.DeclaracaoSeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#condicao.
    def visitCondicao(self, ctx:PyLikeParser.CondicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#declaracaoEnquanto.
    def visitDeclaracaoEnquanto(self, ctx:PyLikeParser.DeclaracaoEnquantoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#declaracaoPara.
    def visitDeclaracaoPara(self, ctx:PyLikeParser.DeclaracaoParaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#declaracaoRetorno.
    def visitDeclaracaoRetorno(self, ctx:PyLikeParser.DeclaracaoRetornoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#atribuicao.
    def visitAtribuicao(self, ctx:PyLikeParser.AtribuicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#atribuivel.
    def visitAtribuivel(self, ctx:PyLikeParser.AtribuivelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#expressao.
    def visitExpressao(self, ctx:PyLikeParser.ExpressaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#logicoOu.
    def visitLogicoOu(self, ctx:PyLikeParser.LogicoOuContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#logicoE.
    def visitLogicoE(self, ctx:PyLikeParser.LogicoEContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#igualdade.
    def visitIgualdade(self, ctx:PyLikeParser.IgualdadeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#comparacao.
    def visitComparacao(self, ctx:PyLikeParser.ComparacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#adicao.
    def visitAdicao(self, ctx:PyLikeParser.AdicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#multiplicacao.
    def visitMultiplicacao(self, ctx:PyLikeParser.MultiplicacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#unario.
    def visitUnario(self, ctx:PyLikeParser.UnarioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#primario.
    def visitPrimario(self, ctx:PyLikeParser.PrimarioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#chamadaFuncao.
    def visitChamadaFuncao(self, ctx:PyLikeParser.ChamadaFuncaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#listaArgumentos.
    def visitListaArgumentos(self, ctx:PyLikeParser.ListaArgumentosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PyLikeParser#literal.
    def visitLiteral(self, ctx:PyLikeParser.LiteralContext):
        return self.visitChildren(ctx)



del PyLikeParser