# Generated from PyLike.g4 by ANTLR 4.5.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PyLikeParser import PyLikeParser
else:
    from PyLikeParser import PyLikeParser

# This class defines a complete listener for a parse tree produced by PyLikeParser.
class PyLikeListener(ParseTreeListener):

    # Enter a parse tree produced by PyLikeParser#programa.
    def enterPrograma(self, ctx:PyLikeParser.ProgramaContext):
        pass

    # Exit a parse tree produced by PyLikeParser#programa.
    def exitPrograma(self, ctx:PyLikeParser.ProgramaContext):
        pass


    # Enter a parse tree produced by PyLikeParser#declaracao.
    def enterDeclaracao(self, ctx:PyLikeParser.DeclaracaoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#declaracao.
    def exitDeclaracao(self, ctx:PyLikeParser.DeclaracaoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#comandos.
    def enterComandos(self, ctx:PyLikeParser.ComandosContext):
        pass

    # Exit a parse tree produced by PyLikeParser#comandos.
    def exitComandos(self, ctx:PyLikeParser.ComandosContext):
        pass


    # Enter a parse tree produced by PyLikeParser#bloco.
    def enterBloco(self, ctx:PyLikeParser.BlocoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#bloco.
    def exitBloco(self, ctx:PyLikeParser.BlocoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#declaracaoFuncao.
    def enterDeclaracaoFuncao(self, ctx:PyLikeParser.DeclaracaoFuncaoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#declaracaoFuncao.
    def exitDeclaracaoFuncao(self, ctx:PyLikeParser.DeclaracaoFuncaoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#listaParametros.
    def enterListaParametros(self, ctx:PyLikeParser.ListaParametrosContext):
        pass

    # Exit a parse tree produced by PyLikeParser#listaParametros.
    def exitListaParametros(self, ctx:PyLikeParser.ListaParametrosContext):
        pass


    # Enter a parse tree produced by PyLikeParser#escreva.
    def enterEscreva(self, ctx:PyLikeParser.EscrevaContext):
        pass

    # Exit a parse tree produced by PyLikeParser#escreva.
    def exitEscreva(self, ctx:PyLikeParser.EscrevaContext):
        pass


    # Enter a parse tree produced by PyLikeParser#leia.
    def enterLeia(self, ctx:PyLikeParser.LeiaContext):
        pass

    # Exit a parse tree produced by PyLikeParser#leia.
    def exitLeia(self, ctx:PyLikeParser.LeiaContext):
        pass


    # Enter a parse tree produced by PyLikeParser#declaracaoSe.
    def enterDeclaracaoSe(self, ctx:PyLikeParser.DeclaracaoSeContext):
        pass

    # Exit a parse tree produced by PyLikeParser#declaracaoSe.
    def exitDeclaracaoSe(self, ctx:PyLikeParser.DeclaracaoSeContext):
        pass


    # Enter a parse tree produced by PyLikeParser#condicao.
    def enterCondicao(self, ctx:PyLikeParser.CondicaoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#condicao.
    def exitCondicao(self, ctx:PyLikeParser.CondicaoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#declaracaoEnquanto.
    def enterDeclaracaoEnquanto(self, ctx:PyLikeParser.DeclaracaoEnquantoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#declaracaoEnquanto.
    def exitDeclaracaoEnquanto(self, ctx:PyLikeParser.DeclaracaoEnquantoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#declaracaoPara.
    def enterDeclaracaoPara(self, ctx:PyLikeParser.DeclaracaoParaContext):
        pass

    # Exit a parse tree produced by PyLikeParser#declaracaoPara.
    def exitDeclaracaoPara(self, ctx:PyLikeParser.DeclaracaoParaContext):
        pass


    # Enter a parse tree produced by PyLikeParser#declaracaoRetorno.
    def enterDeclaracaoRetorno(self, ctx:PyLikeParser.DeclaracaoRetornoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#declaracaoRetorno.
    def exitDeclaracaoRetorno(self, ctx:PyLikeParser.DeclaracaoRetornoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#atribuicao.
    def enterAtribuicao(self, ctx:PyLikeParser.AtribuicaoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#atribuicao.
    def exitAtribuicao(self, ctx:PyLikeParser.AtribuicaoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#atribuivel.
    def enterAtribuivel(self, ctx:PyLikeParser.AtribuivelContext):
        pass

    # Exit a parse tree produced by PyLikeParser#atribuivel.
    def exitAtribuivel(self, ctx:PyLikeParser.AtribuivelContext):
        pass


    # Enter a parse tree produced by PyLikeParser#expressao.
    def enterExpressao(self, ctx:PyLikeParser.ExpressaoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#expressao.
    def exitExpressao(self, ctx:PyLikeParser.ExpressaoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#logicoOu.
    def enterLogicoOu(self, ctx:PyLikeParser.LogicoOuContext):
        pass

    # Exit a parse tree produced by PyLikeParser#logicoOu.
    def exitLogicoOu(self, ctx:PyLikeParser.LogicoOuContext):
        pass


    # Enter a parse tree produced by PyLikeParser#logicoE.
    def enterLogicoE(self, ctx:PyLikeParser.LogicoEContext):
        pass

    # Exit a parse tree produced by PyLikeParser#logicoE.
    def exitLogicoE(self, ctx:PyLikeParser.LogicoEContext):
        pass


    # Enter a parse tree produced by PyLikeParser#igualdade.
    def enterIgualdade(self, ctx:PyLikeParser.IgualdadeContext):
        pass

    # Exit a parse tree produced by PyLikeParser#igualdade.
    def exitIgualdade(self, ctx:PyLikeParser.IgualdadeContext):
        pass


    # Enter a parse tree produced by PyLikeParser#comparacao.
    def enterComparacao(self, ctx:PyLikeParser.ComparacaoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#comparacao.
    def exitComparacao(self, ctx:PyLikeParser.ComparacaoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#adicao.
    def enterAdicao(self, ctx:PyLikeParser.AdicaoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#adicao.
    def exitAdicao(self, ctx:PyLikeParser.AdicaoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#multiplicacao.
    def enterMultiplicacao(self, ctx:PyLikeParser.MultiplicacaoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#multiplicacao.
    def exitMultiplicacao(self, ctx:PyLikeParser.MultiplicacaoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#unario.
    def enterUnario(self, ctx:PyLikeParser.UnarioContext):
        pass

    # Exit a parse tree produced by PyLikeParser#unario.
    def exitUnario(self, ctx:PyLikeParser.UnarioContext):
        pass


    # Enter a parse tree produced by PyLikeParser#primario.
    def enterPrimario(self, ctx:PyLikeParser.PrimarioContext):
        pass

    # Exit a parse tree produced by PyLikeParser#primario.
    def exitPrimario(self, ctx:PyLikeParser.PrimarioContext):
        pass


    # Enter a parse tree produced by PyLikeParser#chamadaFuncao.
    def enterChamadaFuncao(self, ctx:PyLikeParser.ChamadaFuncaoContext):
        pass

    # Exit a parse tree produced by PyLikeParser#chamadaFuncao.
    def exitChamadaFuncao(self, ctx:PyLikeParser.ChamadaFuncaoContext):
        pass


    # Enter a parse tree produced by PyLikeParser#listaArgumentos.
    def enterListaArgumentos(self, ctx:PyLikeParser.ListaArgumentosContext):
        pass

    # Exit a parse tree produced by PyLikeParser#listaArgumentos.
    def exitListaArgumentos(self, ctx:PyLikeParser.ListaArgumentosContext):
        pass


    # Enter a parse tree produced by PyLikeParser#literal.
    def enterLiteral(self, ctx:PyLikeParser.LiteralContext):
        pass

    # Exit a parse tree produced by PyLikeParser#literal.
    def exitLiteral(self, ctx:PyLikeParser.LiteralContext):
        pass


