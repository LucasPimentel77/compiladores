# Generated from grammar/PyLike.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,44,263,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,1,0,5,0,60,8,0,10,0,12,0,63,9,0,1,0,1,0,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,76,8,1,1,2,1,2,3,2,80,8,2,1,
        3,1,3,5,3,84,8,3,10,3,12,3,87,9,3,1,3,1,3,1,4,1,4,1,4,1,4,3,4,95,
        8,4,1,4,1,4,1,4,1,5,1,5,1,5,5,5,103,8,5,10,5,12,5,106,9,5,1,6,1,
        6,1,6,1,6,1,7,1,7,1,8,1,8,1,8,1,8,1,8,5,8,119,8,8,10,8,12,8,122,
        9,8,1,8,1,8,1,9,1,9,1,9,3,9,129,8,9,1,9,1,9,1,10,1,10,1,10,1,10,
        1,10,1,10,1,10,5,10,140,8,10,10,10,12,10,143,9,10,1,10,1,10,3,10,
        147,8,10,1,11,1,11,1,11,1,11,1,11,3,11,154,8,11,1,12,1,12,1,12,1,
        12,1,13,1,13,1,13,1,13,1,13,1,13,1,14,1,14,3,14,168,8,14,1,15,1,
        15,1,15,3,15,173,8,15,1,15,1,15,1,15,1,16,1,16,3,16,180,8,16,1,17,
        1,17,1,18,1,18,1,18,5,18,187,8,18,10,18,12,18,190,9,18,1,19,1,19,
        1,19,5,19,195,8,19,10,19,12,19,198,9,19,1,20,1,20,1,20,5,20,203,
        8,20,10,20,12,20,206,9,20,1,21,1,21,1,21,5,21,211,8,21,10,21,12,
        21,214,9,21,1,22,1,22,1,22,5,22,219,8,22,10,22,12,22,222,9,22,1,
        23,1,23,1,23,5,23,227,8,23,10,23,12,23,230,9,23,1,24,1,24,1,24,3,
        24,235,8,24,1,25,1,25,1,25,1,25,1,25,1,25,1,25,3,25,244,8,25,1,26,
        1,26,1,26,3,26,249,8,26,1,26,1,26,1,27,1,27,1,27,5,27,256,8,27,10,
        27,12,27,259,9,27,1,28,1,28,1,28,0,0,29,0,2,4,6,8,10,12,14,16,18,
        20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,0,6,1,0,
        17,18,1,0,19,22,1,0,25,26,1,0,27,29,2,0,13,13,26,26,2,0,14,16,38,
        39,266,0,61,1,0,0,0,2,75,1,0,0,0,4,79,1,0,0,0,6,81,1,0,0,0,8,90,
        1,0,0,0,10,99,1,0,0,0,12,107,1,0,0,0,14,111,1,0,0,0,16,113,1,0,0,
        0,18,125,1,0,0,0,20,132,1,0,0,0,22,153,1,0,0,0,24,155,1,0,0,0,26,
        159,1,0,0,0,28,165,1,0,0,0,30,169,1,0,0,0,32,179,1,0,0,0,34,181,
        1,0,0,0,36,183,1,0,0,0,38,191,1,0,0,0,40,199,1,0,0,0,42,207,1,0,
        0,0,44,215,1,0,0,0,46,223,1,0,0,0,48,234,1,0,0,0,50,243,1,0,0,0,
        52,245,1,0,0,0,54,252,1,0,0,0,56,260,1,0,0,0,58,60,3,2,1,0,59,58,
        1,0,0,0,60,63,1,0,0,0,61,59,1,0,0,0,61,62,1,0,0,0,62,64,1,0,0,0,
        63,61,1,0,0,0,64,65,5,0,0,1,65,1,1,0,0,0,66,76,3,8,4,0,67,76,3,4,
        2,0,68,76,3,20,10,0,69,76,3,24,12,0,70,76,3,26,13,0,71,76,3,28,14,
        0,72,76,3,30,15,0,73,76,3,34,17,0,74,76,3,6,3,0,75,66,1,0,0,0,75,
        67,1,0,0,0,75,68,1,0,0,0,75,69,1,0,0,0,75,70,1,0,0,0,75,71,1,0,0,
        0,75,72,1,0,0,0,75,73,1,0,0,0,75,74,1,0,0,0,76,3,1,0,0,0,77,80,3,
        16,8,0,78,80,3,18,9,0,79,77,1,0,0,0,79,78,1,0,0,0,80,5,1,0,0,0,81,
        85,5,33,0,0,82,84,3,2,1,0,83,82,1,0,0,0,84,87,1,0,0,0,85,83,1,0,
        0,0,85,86,1,0,0,0,86,88,1,0,0,0,87,85,1,0,0,0,88,89,5,34,0,0,89,
        7,1,0,0,0,90,91,5,1,0,0,91,92,5,40,0,0,92,94,5,31,0,0,93,95,3,10,
        5,0,94,93,1,0,0,0,94,95,1,0,0,0,95,96,1,0,0,0,96,97,5,32,0,0,97,
        98,3,6,3,0,98,9,1,0,0,0,99,104,3,12,6,0,100,101,5,30,0,0,101,103,
        3,12,6,0,102,100,1,0,0,0,103,106,1,0,0,0,104,102,1,0,0,0,104,105,
        1,0,0,0,105,11,1,0,0,0,106,104,1,0,0,0,107,108,5,40,0,0,108,109,
        5,24,0,0,109,110,3,14,7,0,110,13,1,0,0,0,111,112,5,40,0,0,112,15,
        1,0,0,0,113,114,5,9,0,0,114,115,5,31,0,0,115,120,3,34,17,0,116,117,
        5,30,0,0,117,119,3,34,17,0,118,116,1,0,0,0,119,122,1,0,0,0,120,118,
        1,0,0,0,120,121,1,0,0,0,121,123,1,0,0,0,122,120,1,0,0,0,123,124,
        5,32,0,0,124,17,1,0,0,0,125,126,5,10,0,0,126,128,5,31,0,0,127,129,
        3,34,17,0,128,127,1,0,0,0,128,129,1,0,0,0,129,130,1,0,0,0,130,131,
        5,32,0,0,131,19,1,0,0,0,132,133,5,2,0,0,133,134,3,22,11,0,134,141,
        3,6,3,0,135,136,5,3,0,0,136,137,3,22,11,0,137,138,3,6,3,0,138,140,
        1,0,0,0,139,135,1,0,0,0,140,143,1,0,0,0,141,139,1,0,0,0,141,142,
        1,0,0,0,142,146,1,0,0,0,143,141,1,0,0,0,144,145,5,4,0,0,145,147,
        3,6,3,0,146,144,1,0,0,0,146,147,1,0,0,0,147,21,1,0,0,0,148,149,5,
        31,0,0,149,150,3,34,17,0,150,151,5,32,0,0,151,154,1,0,0,0,152,154,
        3,34,17,0,153,148,1,0,0,0,153,152,1,0,0,0,154,23,1,0,0,0,155,156,
        5,5,0,0,156,157,3,22,11,0,157,158,3,6,3,0,158,25,1,0,0,0,159,160,
        5,6,0,0,160,161,5,40,0,0,161,162,5,7,0,0,162,163,3,34,17,0,163,164,
        3,6,3,0,164,27,1,0,0,0,165,167,5,8,0,0,166,168,3,34,17,0,167,166,
        1,0,0,0,167,168,1,0,0,0,168,29,1,0,0,0,169,172,5,40,0,0,170,171,
        5,24,0,0,171,173,3,14,7,0,172,170,1,0,0,0,172,173,1,0,0,0,173,174,
        1,0,0,0,174,175,5,23,0,0,175,176,3,32,16,0,176,31,1,0,0,0,177,180,
        3,34,17,0,178,180,3,4,2,0,179,177,1,0,0,0,179,178,1,0,0,0,180,33,
        1,0,0,0,181,182,3,36,18,0,182,35,1,0,0,0,183,188,3,38,19,0,184,185,
        5,12,0,0,185,187,3,38,19,0,186,184,1,0,0,0,187,190,1,0,0,0,188,186,
        1,0,0,0,188,189,1,0,0,0,189,37,1,0,0,0,190,188,1,0,0,0,191,196,3,
        40,20,0,192,193,5,11,0,0,193,195,3,40,20,0,194,192,1,0,0,0,195,198,
        1,0,0,0,196,194,1,0,0,0,196,197,1,0,0,0,197,39,1,0,0,0,198,196,1,
        0,0,0,199,204,3,42,21,0,200,201,7,0,0,0,201,203,3,42,21,0,202,200,
        1,0,0,0,203,206,1,0,0,0,204,202,1,0,0,0,204,205,1,0,0,0,205,41,1,
        0,0,0,206,204,1,0,0,0,207,212,3,44,22,0,208,209,7,1,0,0,209,211,
        3,44,22,0,210,208,1,0,0,0,211,214,1,0,0,0,212,210,1,0,0,0,212,213,
        1,0,0,0,213,43,1,0,0,0,214,212,1,0,0,0,215,220,3,46,23,0,216,217,
        7,2,0,0,217,219,3,46,23,0,218,216,1,0,0,0,219,222,1,0,0,0,220,218,
        1,0,0,0,220,221,1,0,0,0,221,45,1,0,0,0,222,220,1,0,0,0,223,228,3,
        48,24,0,224,225,7,3,0,0,225,227,3,48,24,0,226,224,1,0,0,0,227,230,
        1,0,0,0,228,226,1,0,0,0,228,229,1,0,0,0,229,47,1,0,0,0,230,228,1,
        0,0,0,231,232,7,4,0,0,232,235,3,48,24,0,233,235,3,50,25,0,234,231,
        1,0,0,0,234,233,1,0,0,0,235,49,1,0,0,0,236,244,3,56,28,0,237,244,
        5,40,0,0,238,244,3,52,26,0,239,240,5,31,0,0,240,241,3,34,17,0,241,
        242,5,32,0,0,242,244,1,0,0,0,243,236,1,0,0,0,243,237,1,0,0,0,243,
        238,1,0,0,0,243,239,1,0,0,0,244,51,1,0,0,0,245,246,5,40,0,0,246,
        248,5,31,0,0,247,249,3,54,27,0,248,247,1,0,0,0,248,249,1,0,0,0,249,
        250,1,0,0,0,250,251,5,32,0,0,251,53,1,0,0,0,252,257,3,34,17,0,253,
        254,5,30,0,0,254,256,3,34,17,0,255,253,1,0,0,0,256,259,1,0,0,0,257,
        255,1,0,0,0,257,258,1,0,0,0,258,55,1,0,0,0,259,257,1,0,0,0,260,261,
        7,5,0,0,261,57,1,0,0,0,24,61,75,79,85,94,104,120,128,141,146,153,
        167,172,179,188,196,204,212,220,228,234,243,248,257
    ]

class PyLikeParser ( Parser ):

    grammarFileName = "PyLike.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'def'", "'if'", "'elif'", "'else'", "'while'", 
                     "'for'", "'in'", "'return'", "'print'", "'input'", 
                     "'and'", "'or'", "'not'", "'True'", "'False'", "'None'", 
                     "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'='", 
                     "':'", "'+'", "'-'", "'*'", "'/'", "'%'", "','", "'('", 
                     "')'", "'{'", "'}'", "'['", "']'", "'.'" ]

    symbolicNames = [ "<INVALID>", "DEF", "IF", "ELIF", "ELSE", "WHILE", 
                      "FOR", "IN", "RETURN", "PRINT", "INPUT", "AND", "OR", 
                      "NOT", "TRUE", "FALSE", "NONE", "EQ", "NEQ", "LTE", 
                      "GTE", "LT", "GT", "ASSIGN", "COLON", "PLUS", "MINUS", 
                      "MUL", "DIV", "MOD", "COMMA", "LPAREN", "RPAREN", 
                      "LBRACE", "RBRACE", "LBRACK", "RBRACK", "DOT", "NUMBER", 
                      "STRING", "ID", "LINE_COMMENT", "LINE_COMMENT2", "COMMENT", 
                      "WS" ]

    RULE_programa = 0
    RULE_declaracao = 1
    RULE_comandos = 2
    RULE_bloco = 3
    RULE_declaracaoFuncao = 4
    RULE_listaParametros = 5
    RULE_parametro = 6
    RULE_tipo = 7
    RULE_escreva = 8
    RULE_leia = 9
    RULE_declaracaoSe = 10
    RULE_condicao = 11
    RULE_declaracaoEnquanto = 12
    RULE_declaracaoPara = 13
    RULE_declaracaoRetorno = 14
    RULE_atribuicao = 15
    RULE_atribuivel = 16
    RULE_expressao = 17
    RULE_logicoOu = 18
    RULE_logicoE = 19
    RULE_igualdade = 20
    RULE_comparacao = 21
    RULE_adicao = 22
    RULE_multiplicacao = 23
    RULE_unario = 24
    RULE_primario = 25
    RULE_chamadaFuncao = 26
    RULE_listaArgumentos = 27
    RULE_literal = 28

    ruleNames =  [ "programa", "declaracao", "comandos", "bloco", "declaracaoFuncao", 
                   "listaParametros", "parametro", "tipo", "escreva", "leia", 
                   "declaracaoSe", "condicao", "declaracaoEnquanto", "declaracaoPara", 
                   "declaracaoRetorno", "atribuicao", "atribuivel", "expressao", 
                   "logicoOu", "logicoE", "igualdade", "comparacao", "adicao", 
                   "multiplicacao", "unario", "primario", "chamadaFuncao", 
                   "listaArgumentos", "literal" ]

    EOF = Token.EOF
    DEF=1
    IF=2
    ELIF=3
    ELSE=4
    WHILE=5
    FOR=6
    IN=7
    RETURN=8
    PRINT=9
    INPUT=10
    AND=11
    OR=12
    NOT=13
    TRUE=14
    FALSE=15
    NONE=16
    EQ=17
    NEQ=18
    LTE=19
    GTE=20
    LT=21
    GT=22
    ASSIGN=23
    COLON=24
    PLUS=25
    MINUS=26
    MUL=27
    DIV=28
    MOD=29
    COMMA=30
    LPAREN=31
    RPAREN=32
    LBRACE=33
    RBRACE=34
    LBRACK=35
    RBRACK=36
    DOT=37
    NUMBER=38
    STRING=39
    ID=40
    LINE_COMMENT=41
    LINE_COMMENT2=42
    COMMENT=43
    WS=44

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(PyLikeParser.EOF, 0)

        def declaracao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.DeclaracaoContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.DeclaracaoContext,i)


        def getRuleIndex(self):
            return PyLikeParser.RULE_programa

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrograma" ):
                return visitor.visitPrograma(self)
            else:
                return visitor.visitChildren(self)




    def programa(self):

        localctx = PyLikeParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 61
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1934950000486) != 0):
                self.state = 58
                self.declaracao()
                self.state = 63
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 64
            self.match(PyLikeParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaracaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def declaracaoFuncao(self):
            return self.getTypedRuleContext(PyLikeParser.DeclaracaoFuncaoContext,0)


        def comandos(self):
            return self.getTypedRuleContext(PyLikeParser.ComandosContext,0)


        def declaracaoSe(self):
            return self.getTypedRuleContext(PyLikeParser.DeclaracaoSeContext,0)


        def declaracaoEnquanto(self):
            return self.getTypedRuleContext(PyLikeParser.DeclaracaoEnquantoContext,0)


        def declaracaoPara(self):
            return self.getTypedRuleContext(PyLikeParser.DeclaracaoParaContext,0)


        def declaracaoRetorno(self):
            return self.getTypedRuleContext(PyLikeParser.DeclaracaoRetornoContext,0)


        def atribuicao(self):
            return self.getTypedRuleContext(PyLikeParser.AtribuicaoContext,0)


        def expressao(self):
            return self.getTypedRuleContext(PyLikeParser.ExpressaoContext,0)


        def bloco(self):
            return self.getTypedRuleContext(PyLikeParser.BlocoContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_declaracao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracao" ):
                return visitor.visitDeclaracao(self)
            else:
                return visitor.visitChildren(self)




    def declaracao(self):

        localctx = PyLikeParser.DeclaracaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_declaracao)
        try:
            self.state = 75
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 66
                self.declaracaoFuncao()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 67
                self.comandos()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 68
                self.declaracaoSe()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 69
                self.declaracaoEnquanto()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 70
                self.declaracaoPara()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 71
                self.declaracaoRetorno()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 72
                self.atribuicao()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 73
                self.expressao()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 74
                self.bloco()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComandosContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def escreva(self):
            return self.getTypedRuleContext(PyLikeParser.EscrevaContext,0)


        def leia(self):
            return self.getTypedRuleContext(PyLikeParser.LeiaContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_comandos

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComandos" ):
                return visitor.visitComandos(self)
            else:
                return visitor.visitChildren(self)




    def comandos(self):

        localctx = PyLikeParser.ComandosContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_comandos)
        try:
            self.state = 79
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [9]:
                self.enterOuterAlt(localctx, 1)
                self.state = 77
                self.escreva()
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 2)
                self.state = 78
                self.leia()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlocoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LBRACE(self):
            return self.getToken(PyLikeParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(PyLikeParser.RBRACE, 0)

        def declaracao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.DeclaracaoContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.DeclaracaoContext,i)


        def getRuleIndex(self):
            return PyLikeParser.RULE_bloco

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBloco" ):
                return visitor.visitBloco(self)
            else:
                return visitor.visitChildren(self)




    def bloco(self):

        localctx = PyLikeParser.BlocoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_bloco)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            self.match(PyLikeParser.LBRACE)
            self.state = 85
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1934950000486) != 0):
                self.state = 82
                self.declaracao()
                self.state = 87
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 88
            self.match(PyLikeParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaracaoFuncaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DEF(self):
            return self.getToken(PyLikeParser.DEF, 0)

        def ID(self):
            return self.getToken(PyLikeParser.ID, 0)

        def LPAREN(self):
            return self.getToken(PyLikeParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(PyLikeParser.RPAREN, 0)

        def bloco(self):
            return self.getTypedRuleContext(PyLikeParser.BlocoContext,0)


        def listaParametros(self):
            return self.getTypedRuleContext(PyLikeParser.ListaParametrosContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_declaracaoFuncao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracaoFuncao" ):
                return visitor.visitDeclaracaoFuncao(self)
            else:
                return visitor.visitChildren(self)




    def declaracaoFuncao(self):

        localctx = PyLikeParser.DeclaracaoFuncaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_declaracaoFuncao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.match(PyLikeParser.DEF)
            self.state = 91
            self.match(PyLikeParser.ID)
            self.state = 92
            self.match(PyLikeParser.LPAREN)
            self.state = 94
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==40:
                self.state = 93
                self.listaParametros()


            self.state = 96
            self.match(PyLikeParser.RPAREN)
            self.state = 97
            self.bloco()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ListaParametrosContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def parametro(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.ParametroContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.ParametroContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.COMMA)
            else:
                return self.getToken(PyLikeParser.COMMA, i)

        def getRuleIndex(self):
            return PyLikeParser.RULE_listaParametros

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitListaParametros" ):
                return visitor.visitListaParametros(self)
            else:
                return visitor.visitChildren(self)




    def listaParametros(self):

        localctx = PyLikeParser.ListaParametrosContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_listaParametros)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 99
            self.parametro()
            self.state = 104
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 100
                self.match(PyLikeParser.COMMA)
                self.state = 101
                self.parametro()
                self.state = 106
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametroContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(PyLikeParser.ID, 0)

        def COLON(self):
            return self.getToken(PyLikeParser.COLON, 0)

        def tipo(self):
            return self.getTypedRuleContext(PyLikeParser.TipoContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_parametro

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParametro" ):
                return visitor.visitParametro(self)
            else:
                return visitor.visitChildren(self)




    def parametro(self):

        localctx = PyLikeParser.ParametroContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_parametro)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 107
            self.match(PyLikeParser.ID)
            self.state = 108
            self.match(PyLikeParser.COLON)
            self.state = 109
            self.tipo()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(PyLikeParser.ID, 0)

        def getRuleIndex(self):
            return PyLikeParser.RULE_tipo

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTipo" ):
                return visitor.visitTipo(self)
            else:
                return visitor.visitChildren(self)




    def tipo(self):

        localctx = PyLikeParser.TipoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_tipo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 111
            self.match(PyLikeParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EscrevaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PRINT(self):
            return self.getToken(PyLikeParser.PRINT, 0)

        def LPAREN(self):
            return self.getToken(PyLikeParser.LPAREN, 0)

        def expressao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.ExpressaoContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.ExpressaoContext,i)


        def RPAREN(self):
            return self.getToken(PyLikeParser.RPAREN, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.COMMA)
            else:
                return self.getToken(PyLikeParser.COMMA, i)

        def getRuleIndex(self):
            return PyLikeParser.RULE_escreva

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEscreva" ):
                return visitor.visitEscreva(self)
            else:
                return visitor.visitChildren(self)




    def escreva(self):

        localctx = PyLikeParser.EscrevaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_escreva)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 113
            self.match(PyLikeParser.PRINT)
            self.state = 114
            self.match(PyLikeParser.LPAREN)
            self.state = 115
            self.expressao()
            self.state = 120
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 116
                self.match(PyLikeParser.COMMA)
                self.state = 117
                self.expressao()
                self.state = 122
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 123
            self.match(PyLikeParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LeiaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INPUT(self):
            return self.getToken(PyLikeParser.INPUT, 0)

        def LPAREN(self):
            return self.getToken(PyLikeParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(PyLikeParser.RPAREN, 0)

        def expressao(self):
            return self.getTypedRuleContext(PyLikeParser.ExpressaoContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_leia

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLeia" ):
                return visitor.visitLeia(self)
            else:
                return visitor.visitChildren(self)




    def leia(self):

        localctx = PyLikeParser.LeiaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_leia)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 125
            self.match(PyLikeParser.INPUT)
            self.state = 126
            self.match(PyLikeParser.LPAREN)
            self.state = 128
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 1926360064000) != 0):
                self.state = 127
                self.expressao()


            self.state = 130
            self.match(PyLikeParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaracaoSeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(PyLikeParser.IF, 0)

        def condicao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.CondicaoContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.CondicaoContext,i)


        def bloco(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.BlocoContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.BlocoContext,i)


        def ELIF(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.ELIF)
            else:
                return self.getToken(PyLikeParser.ELIF, i)

        def ELSE(self):
            return self.getToken(PyLikeParser.ELSE, 0)

        def getRuleIndex(self):
            return PyLikeParser.RULE_declaracaoSe

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracaoSe" ):
                return visitor.visitDeclaracaoSe(self)
            else:
                return visitor.visitChildren(self)




    def declaracaoSe(self):

        localctx = PyLikeParser.DeclaracaoSeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_declaracaoSe)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 132
            self.match(PyLikeParser.IF)
            self.state = 133
            self.condicao()
            self.state = 134
            self.bloco()
            self.state = 141
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==3:
                self.state = 135
                self.match(PyLikeParser.ELIF)
                self.state = 136
                self.condicao()
                self.state = 137
                self.bloco()
                self.state = 143
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 146
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==4:
                self.state = 144
                self.match(PyLikeParser.ELSE)
                self.state = 145
                self.bloco()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LPAREN(self):
            return self.getToken(PyLikeParser.LPAREN, 0)

        def expressao(self):
            return self.getTypedRuleContext(PyLikeParser.ExpressaoContext,0)


        def RPAREN(self):
            return self.getToken(PyLikeParser.RPAREN, 0)

        def getRuleIndex(self):
            return PyLikeParser.RULE_condicao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondicao" ):
                return visitor.visitCondicao(self)
            else:
                return visitor.visitChildren(self)




    def condicao(self):

        localctx = PyLikeParser.CondicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_condicao)
        try:
            self.state = 153
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 148
                self.match(PyLikeParser.LPAREN)
                self.state = 149
                self.expressao()
                self.state = 150
                self.match(PyLikeParser.RPAREN)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 152
                self.expressao()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaracaoEnquantoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(PyLikeParser.WHILE, 0)

        def condicao(self):
            return self.getTypedRuleContext(PyLikeParser.CondicaoContext,0)


        def bloco(self):
            return self.getTypedRuleContext(PyLikeParser.BlocoContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_declaracaoEnquanto

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracaoEnquanto" ):
                return visitor.visitDeclaracaoEnquanto(self)
            else:
                return visitor.visitChildren(self)




    def declaracaoEnquanto(self):

        localctx = PyLikeParser.DeclaracaoEnquantoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_declaracaoEnquanto)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 155
            self.match(PyLikeParser.WHILE)
            self.state = 156
            self.condicao()
            self.state = 157
            self.bloco()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaracaoParaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(PyLikeParser.FOR, 0)

        def ID(self):
            return self.getToken(PyLikeParser.ID, 0)

        def IN(self):
            return self.getToken(PyLikeParser.IN, 0)

        def expressao(self):
            return self.getTypedRuleContext(PyLikeParser.ExpressaoContext,0)


        def bloco(self):
            return self.getTypedRuleContext(PyLikeParser.BlocoContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_declaracaoPara

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracaoPara" ):
                return visitor.visitDeclaracaoPara(self)
            else:
                return visitor.visitChildren(self)




    def declaracaoPara(self):

        localctx = PyLikeParser.DeclaracaoParaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_declaracaoPara)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 159
            self.match(PyLikeParser.FOR)
            self.state = 160
            self.match(PyLikeParser.ID)
            self.state = 161
            self.match(PyLikeParser.IN)
            self.state = 162
            self.expressao()
            self.state = 163
            self.bloco()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaracaoRetornoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RETURN(self):
            return self.getToken(PyLikeParser.RETURN, 0)

        def expressao(self):
            return self.getTypedRuleContext(PyLikeParser.ExpressaoContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_declaracaoRetorno

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeclaracaoRetorno" ):
                return visitor.visitDeclaracaoRetorno(self)
            else:
                return visitor.visitChildren(self)




    def declaracaoRetorno(self):

        localctx = PyLikeParser.DeclaracaoRetornoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_declaracaoRetorno)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 165
            self.match(PyLikeParser.RETURN)
            self.state = 167
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
            if la_ == 1:
                self.state = 166
                self.expressao()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AtribuicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(PyLikeParser.ID, 0)

        def ASSIGN(self):
            return self.getToken(PyLikeParser.ASSIGN, 0)

        def atribuivel(self):
            return self.getTypedRuleContext(PyLikeParser.AtribuivelContext,0)


        def COLON(self):
            return self.getToken(PyLikeParser.COLON, 0)

        def tipo(self):
            return self.getTypedRuleContext(PyLikeParser.TipoContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_atribuicao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAtribuicao" ):
                return visitor.visitAtribuicao(self)
            else:
                return visitor.visitChildren(self)




    def atribuicao(self):

        localctx = PyLikeParser.AtribuicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_atribuicao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 169
            self.match(PyLikeParser.ID)
            self.state = 172
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==24:
                self.state = 170
                self.match(PyLikeParser.COLON)
                self.state = 171
                self.tipo()


            self.state = 174
            self.match(PyLikeParser.ASSIGN)
            self.state = 175
            self.atribuivel()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AtribuivelContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressao(self):
            return self.getTypedRuleContext(PyLikeParser.ExpressaoContext,0)


        def comandos(self):
            return self.getTypedRuleContext(PyLikeParser.ComandosContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_atribuivel

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAtribuivel" ):
                return visitor.visitAtribuivel(self)
            else:
                return visitor.visitChildren(self)




    def atribuivel(self):

        localctx = PyLikeParser.AtribuivelContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_atribuivel)
        try:
            self.state = 179
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13, 14, 15, 16, 26, 31, 38, 39, 40]:
                self.enterOuterAlt(localctx, 1)
                self.state = 177
                self.expressao()
                pass
            elif token in [9, 10]:
                self.enterOuterAlt(localctx, 2)
                self.state = 178
                self.comandos()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def logicoOu(self):
            return self.getTypedRuleContext(PyLikeParser.LogicoOuContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_expressao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressao" ):
                return visitor.visitExpressao(self)
            else:
                return visitor.visitChildren(self)




    def expressao(self):

        localctx = PyLikeParser.ExpressaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_expressao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 181
            self.logicoOu()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LogicoOuContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def logicoE(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.LogicoEContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.LogicoEContext,i)


        def OR(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.OR)
            else:
                return self.getToken(PyLikeParser.OR, i)

        def getRuleIndex(self):
            return PyLikeParser.RULE_logicoOu

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLogicoOu" ):
                return visitor.visitLogicoOu(self)
            else:
                return visitor.visitChildren(self)




    def logicoOu(self):

        localctx = PyLikeParser.LogicoOuContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_logicoOu)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 183
            self.logicoE()
            self.state = 188
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==12:
                self.state = 184
                self.match(PyLikeParser.OR)
                self.state = 185
                self.logicoE()
                self.state = 190
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LogicoEContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def igualdade(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.IgualdadeContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.IgualdadeContext,i)


        def AND(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.AND)
            else:
                return self.getToken(PyLikeParser.AND, i)

        def getRuleIndex(self):
            return PyLikeParser.RULE_logicoE

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLogicoE" ):
                return visitor.visitLogicoE(self)
            else:
                return visitor.visitChildren(self)




    def logicoE(self):

        localctx = PyLikeParser.LogicoEContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_logicoE)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 191
            self.igualdade()
            self.state = 196
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==11:
                self.state = 192
                self.match(PyLikeParser.AND)
                self.state = 193
                self.igualdade()
                self.state = 198
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IgualdadeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def comparacao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.ComparacaoContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.ComparacaoContext,i)


        def EQ(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.EQ)
            else:
                return self.getToken(PyLikeParser.EQ, i)

        def NEQ(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.NEQ)
            else:
                return self.getToken(PyLikeParser.NEQ, i)

        def getRuleIndex(self):
            return PyLikeParser.RULE_igualdade

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIgualdade" ):
                return visitor.visitIgualdade(self)
            else:
                return visitor.visitChildren(self)




    def igualdade(self):

        localctx = PyLikeParser.IgualdadeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_igualdade)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 199
            self.comparacao()
            self.state = 204
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==17 or _la==18:
                self.state = 200
                _la = self._input.LA(1)
                if not(_la==17 or _la==18):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 201
                self.comparacao()
                self.state = 206
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComparacaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def adicao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.AdicaoContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.AdicaoContext,i)


        def LT(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.LT)
            else:
                return self.getToken(PyLikeParser.LT, i)

        def LTE(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.LTE)
            else:
                return self.getToken(PyLikeParser.LTE, i)

        def GT(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.GT)
            else:
                return self.getToken(PyLikeParser.GT, i)

        def GTE(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.GTE)
            else:
                return self.getToken(PyLikeParser.GTE, i)

        def getRuleIndex(self):
            return PyLikeParser.RULE_comparacao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComparacao" ):
                return visitor.visitComparacao(self)
            else:
                return visitor.visitChildren(self)




    def comparacao(self):

        localctx = PyLikeParser.ComparacaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_comparacao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 207
            self.adicao()
            self.state = 212
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 7864320) != 0):
                self.state = 208
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 7864320) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 209
                self.adicao()
                self.state = 214
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AdicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def multiplicacao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.MultiplicacaoContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.MultiplicacaoContext,i)


        def PLUS(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.PLUS)
            else:
                return self.getToken(PyLikeParser.PLUS, i)

        def MINUS(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.MINUS)
            else:
                return self.getToken(PyLikeParser.MINUS, i)

        def getRuleIndex(self):
            return PyLikeParser.RULE_adicao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdicao" ):
                return visitor.visitAdicao(self)
            else:
                return visitor.visitChildren(self)




    def adicao(self):

        localctx = PyLikeParser.AdicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_adicao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 215
            self.multiplicacao()
            self.state = 220
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,18,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 216
                    _la = self._input.LA(1)
                    if not(_la==25 or _la==26):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 217
                    self.multiplicacao() 
                self.state = 222
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,18,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MultiplicacaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def unario(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.UnarioContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.UnarioContext,i)


        def MUL(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.MUL)
            else:
                return self.getToken(PyLikeParser.MUL, i)

        def DIV(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.DIV)
            else:
                return self.getToken(PyLikeParser.DIV, i)

        def MOD(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.MOD)
            else:
                return self.getToken(PyLikeParser.MOD, i)

        def getRuleIndex(self):
            return PyLikeParser.RULE_multiplicacao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMultiplicacao" ):
                return visitor.visitMultiplicacao(self)
            else:
                return visitor.visitChildren(self)




    def multiplicacao(self):

        localctx = PyLikeParser.MultiplicacaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_multiplicacao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 223
            self.unario()
            self.state = 228
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 939524096) != 0):
                self.state = 224
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 939524096) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 225
                self.unario()
                self.state = 230
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class UnarioContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def unario(self):
            return self.getTypedRuleContext(PyLikeParser.UnarioContext,0)


        def NOT(self):
            return self.getToken(PyLikeParser.NOT, 0)

        def MINUS(self):
            return self.getToken(PyLikeParser.MINUS, 0)

        def primario(self):
            return self.getTypedRuleContext(PyLikeParser.PrimarioContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_unario

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUnario" ):
                return visitor.visitUnario(self)
            else:
                return visitor.visitChildren(self)




    def unario(self):

        localctx = PyLikeParser.UnarioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_unario)
        self._la = 0 # Token type
        try:
            self.state = 234
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13, 26]:
                self.enterOuterAlt(localctx, 1)
                self.state = 231
                _la = self._input.LA(1)
                if not(_la==13 or _la==26):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 232
                self.unario()
                pass
            elif token in [14, 15, 16, 31, 38, 39, 40]:
                self.enterOuterAlt(localctx, 2)
                self.state = 233
                self.primario()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PrimarioContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def literal(self):
            return self.getTypedRuleContext(PyLikeParser.LiteralContext,0)


        def ID(self):
            return self.getToken(PyLikeParser.ID, 0)

        def chamadaFuncao(self):
            return self.getTypedRuleContext(PyLikeParser.ChamadaFuncaoContext,0)


        def LPAREN(self):
            return self.getToken(PyLikeParser.LPAREN, 0)

        def expressao(self):
            return self.getTypedRuleContext(PyLikeParser.ExpressaoContext,0)


        def RPAREN(self):
            return self.getToken(PyLikeParser.RPAREN, 0)

        def getRuleIndex(self):
            return PyLikeParser.RULE_primario

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrimario" ):
                return visitor.visitPrimario(self)
            else:
                return visitor.visitChildren(self)




    def primario(self):

        localctx = PyLikeParser.PrimarioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_primario)
        try:
            self.state = 243
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,21,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 236
                self.literal()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 237
                self.match(PyLikeParser.ID)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 238
                self.chamadaFuncao()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 239
                self.match(PyLikeParser.LPAREN)
                self.state = 240
                self.expressao()
                self.state = 241
                self.match(PyLikeParser.RPAREN)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ChamadaFuncaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(PyLikeParser.ID, 0)

        def LPAREN(self):
            return self.getToken(PyLikeParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(PyLikeParser.RPAREN, 0)

        def listaArgumentos(self):
            return self.getTypedRuleContext(PyLikeParser.ListaArgumentosContext,0)


        def getRuleIndex(self):
            return PyLikeParser.RULE_chamadaFuncao

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitChamadaFuncao" ):
                return visitor.visitChamadaFuncao(self)
            else:
                return visitor.visitChildren(self)




    def chamadaFuncao(self):

        localctx = PyLikeParser.ChamadaFuncaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_chamadaFuncao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 245
            self.match(PyLikeParser.ID)
            self.state = 246
            self.match(PyLikeParser.LPAREN)
            self.state = 248
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 1926360064000) != 0):
                self.state = 247
                self.listaArgumentos()


            self.state = 250
            self.match(PyLikeParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ListaArgumentosContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(PyLikeParser.ExpressaoContext)
            else:
                return self.getTypedRuleContext(PyLikeParser.ExpressaoContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(PyLikeParser.COMMA)
            else:
                return self.getToken(PyLikeParser.COMMA, i)

        def getRuleIndex(self):
            return PyLikeParser.RULE_listaArgumentos

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitListaArgumentos" ):
                return visitor.visitListaArgumentos(self)
            else:
                return visitor.visitChildren(self)




    def listaArgumentos(self):

        localctx = PyLikeParser.ListaArgumentosContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_listaArgumentos)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 252
            self.expressao()
            self.state = 257
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==30:
                self.state = 253
                self.match(PyLikeParser.COMMA)
                self.state = 254
                self.expressao()
                self.state = 259
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LiteralContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(PyLikeParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(PyLikeParser.STRING, 0)

        def TRUE(self):
            return self.getToken(PyLikeParser.TRUE, 0)

        def FALSE(self):
            return self.getToken(PyLikeParser.FALSE, 0)

        def NONE(self):
            return self.getToken(PyLikeParser.NONE, 0)

        def getRuleIndex(self):
            return PyLikeParser.RULE_literal

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLiteral" ):
                return visitor.visitLiteral(self)
            else:
                return visitor.visitChildren(self)




    def literal(self):

        localctx = PyLikeParser.LiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_literal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 260
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 824633835520) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





