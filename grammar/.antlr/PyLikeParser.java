// Generated from c:/Users/User/Desktop/ENC/2025.2/compiladores/grammar/PyLike.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PyLikeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, IF=2, ELIF=3, ELSE=4, WHILE=5, FOR=6, IN=7, RETURN=8, PRINT=9, 
		INPUT=10, AND=11, OR=12, NOT=13, TRUE=14, FALSE=15, NONE=16, EQ=17, NEQ=18, 
		LTE=19, GTE=20, LT=21, GT=22, ASSIGN=23, COLON=24, PLUS=25, MINUS=26, 
		MUL=27, DIV=28, MOD=29, COMMA=30, LPAREN=31, RPAREN=32, LBRACE=33, RBRACE=34, 
		LBRACK=35, RBRACK=36, DOT=37, NUMBER=38, STRING=39, ID=40, LINE_COMMENT=41, 
		LINE_COMMENT2=42, COMMENT=43, WS=44;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_comandos = 2, RULE_bloco = 3, 
		RULE_declaracaoFuncao = 4, RULE_listaParametros = 5, RULE_parametro = 6, 
		RULE_tipo = 7, RULE_escreva = 8, RULE_leia = 9, RULE_declaracaoSe = 10, 
		RULE_condicao = 11, RULE_declaracaoEnquanto = 12, RULE_declaracaoPara = 13, 
		RULE_declaracaoRetorno = 14, RULE_atribuicao = 15, RULE_atribuivel = 16, 
		RULE_expressao = 17, RULE_logicoOu = 18, RULE_logicoE = 19, RULE_igualdade = 20, 
		RULE_comparacao = 21, RULE_adicao = 22, RULE_multiplicacao = 23, RULE_unario = 24, 
		RULE_primario = 25, RULE_chamadaFuncao = 26, RULE_listaArgumentos = 27, 
		RULE_literal = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "comandos", "bloco", "declaracaoFuncao", "listaParametros", 
			"parametro", "tipo", "escreva", "leia", "declaracaoSe", "condicao", "declaracaoEnquanto", 
			"declaracaoPara", "declaracaoRetorno", "atribuicao", "atribuivel", "expressao", 
			"logicoOu", "logicoE", "igualdade", "comparacao", "adicao", "multiplicacao", 
			"unario", "primario", "chamadaFuncao", "listaArgumentos", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'if'", "'elif'", "'else'", "'while'", "'for'", "'in'", 
			"'return'", "'print'", "'input'", "'and'", "'or'", "'not'", "'True'", 
			"'False'", "'None'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'='", 
			"':'", "'+'", "'-'", "'*'", "'/'", "'%'", "','", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "IF", "ELIF", "ELSE", "WHILE", "FOR", "IN", "RETURN", "PRINT", 
			"INPUT", "AND", "OR", "NOT", "TRUE", "FALSE", "NONE", "EQ", "NEQ", "LTE", 
			"GTE", "LT", "GT", "ASSIGN", "COLON", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"DOT", "NUMBER", "STRING", "ID", "LINE_COMMENT", "LINE_COMMENT2", "COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PyLike.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PyLikeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PyLikeParser.EOF, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1934950000486L) != 0)) {
				{
				{
				setState(58);
				declaracao();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public DeclaracaoSeContext declaracaoSe() {
			return getRuleContext(DeclaracaoSeContext.class,0);
		}
		public DeclaracaoEnquantoContext declaracaoEnquanto() {
			return getRuleContext(DeclaracaoEnquantoContext.class,0);
		}
		public DeclaracaoParaContext declaracaoPara() {
			return getRuleContext(DeclaracaoParaContext.class,0);
		}
		public DeclaracaoRetornoContext declaracaoRetorno() {
			return getRuleContext(DeclaracaoRetornoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				declaracaoFuncao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				comandos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				declaracaoSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				declaracaoEnquanto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				declaracaoPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				declaracaoRetorno();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				atribuicao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				expressao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				bloco();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public EscrevaContext escreva() {
			return getRuleContext(EscrevaContext.class,0);
		}
		public LeiaContext leia() {
			return getRuleContext(LeiaContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comandos);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				escreva();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				leia();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PyLikeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PyLikeParser.RBRACE, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LBRACE);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1934950000486L) != 0)) {
				{
				{
				setState(82);
				declaracao();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PyLikeParser.DEF, 0); }
		public TerminalNode ID() { return getToken(PyLikeParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PyLikeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PyLikeParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitDeclaracaoFuncao(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(DEF);
			setState(91);
			match(ID);
			setState(92);
			match(LPAREN);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(93);
				listaParametros();
				}
			}

			setState(96);
			match(RPAREN);
			setState(97);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyLikeParser.COMMA, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitListaParametros(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			parametro();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(100);
				match(COMMA);
				setState(101);
				parametro();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PyLikeParser.ID, 0); }
		public TerminalNode COLON() { return getToken(PyLikeParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			match(COLON);
			setState(109);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PyLikeParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscrevaContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PyLikeParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(PyLikeParser.LPAREN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PyLikeParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PyLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyLikeParser.COMMA, i);
		}
		public EscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitEscreva(this);
		}
	}

	public final EscrevaContext escreva() throws RecognitionException {
		EscrevaContext _localctx = new EscrevaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(PRINT);
			setState(114);
			match(LPAREN);
			setState(115);
			expressao();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				expressao();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeiaContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(PyLikeParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(PyLikeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PyLikeParser.RPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public LeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitLeia(this);
		}
	}

	public final LeiaContext leia() throws RecognitionException {
		LeiaContext _localctx = new LeiaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_leia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(INPUT);
			setState(126);
			match(LPAREN);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1926360064000L) != 0)) {
				{
				setState(127);
				expressao();
				}
			}

			setState(130);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoSeContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PyLikeParser.IF, 0); }
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PyLikeParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PyLikeParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PyLikeParser.ELSE, 0); }
		public DeclaracaoSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterDeclaracaoSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitDeclaracaoSe(this);
		}
	}

	public final DeclaracaoSeContext declaracaoSe() throws RecognitionException {
		DeclaracaoSeContext _localctx = new DeclaracaoSeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracaoSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IF);
			setState(133);
			condicao();
			setState(134);
			bloco();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(135);
				match(ELIF);
				setState(136);
				condicao();
				setState(137);
				bloco();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(144);
				match(ELSE);
				setState(145);
				bloco();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PyLikeParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PyLikeParser.RPAREN, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicao);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(LPAREN);
				setState(149);
				expressao();
				setState(150);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				expressao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoEnquantoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PyLikeParser.WHILE, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracaoEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterDeclaracaoEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitDeclaracaoEnquanto(this);
		}
	}

	public final DeclaracaoEnquantoContext declaracaoEnquanto() throws RecognitionException {
		DeclaracaoEnquantoContext _localctx = new DeclaracaoEnquantoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracaoEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(WHILE);
			setState(156);
			condicao();
			setState(157);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoParaContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PyLikeParser.FOR, 0); }
		public TerminalNode ID() { return getToken(PyLikeParser.ID, 0); }
		public TerminalNode IN() { return getToken(PyLikeParser.IN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracaoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterDeclaracaoPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitDeclaracaoPara(this);
		}
	}

	public final DeclaracaoParaContext declaracaoPara() throws RecognitionException {
		DeclaracaoParaContext _localctx = new DeclaracaoParaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracaoPara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FOR);
			setState(160);
			match(ID);
			setState(161);
			match(IN);
			setState(162);
			expressao();
			setState(163);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoRetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PyLikeParser.RETURN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterDeclaracaoRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitDeclaracaoRetorno(this);
		}
	}

	public final DeclaracaoRetornoContext declaracaoRetorno() throws RecognitionException {
		DeclaracaoRetornoContext _localctx = new DeclaracaoRetornoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracaoRetorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(RETURN);
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(166);
				expressao();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PyLikeParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PyLikeParser.ASSIGN, 0); }
		public AtribuivelContext atribuivel() {
			return getRuleContext(AtribuivelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PyLikeParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(170);
				match(COLON);
				setState(171);
				tipo();
				}
			}

			setState(174);
			match(ASSIGN);
			setState(175);
			atribuivel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuivelContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public AtribuivelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuivel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterAtribuivel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitAtribuivel(this);
		}
	}

	public final AtribuivelContext atribuivel() throws RecognitionException {
		AtribuivelContext _localctx = new AtribuivelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atribuivel);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case TRUE:
			case FALSE:
			case NONE:
			case MINUS:
			case LPAREN:
			case NUMBER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				expressao();
				}
				break;
			case PRINT:
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				comandos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public LogicoOuContext logicoOu() {
			return getRuleContext(LogicoOuContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			logicoOu();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicoOuContext extends ParserRuleContext {
		public List<LogicoEContext> logicoE() {
			return getRuleContexts(LogicoEContext.class);
		}
		public LogicoEContext logicoE(int i) {
			return getRuleContext(LogicoEContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PyLikeParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PyLikeParser.OR, i);
		}
		public LogicoOuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicoOu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterLogicoOu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitLogicoOu(this);
		}
	}

	public final LogicoOuContext logicoOu() throws RecognitionException {
		LogicoOuContext _localctx = new LogicoOuContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicoOu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			logicoE();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(184);
				match(OR);
				setState(185);
				logicoE();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicoEContext extends ParserRuleContext {
		public List<IgualdadeContext> igualdade() {
			return getRuleContexts(IgualdadeContext.class);
		}
		public IgualdadeContext igualdade(int i) {
			return getRuleContext(IgualdadeContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PyLikeParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PyLikeParser.AND, i);
		}
		public LogicoEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicoE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterLogicoE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitLogicoE(this);
		}
	}

	public final LogicoEContext logicoE() throws RecognitionException {
		LogicoEContext _localctx = new LogicoEContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicoE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			igualdade();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(192);
				match(AND);
				setState(193);
				igualdade();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadeContext extends ParserRuleContext {
		public List<ComparacaoContext> comparacao() {
			return getRuleContexts(ComparacaoContext.class);
		}
		public ComparacaoContext comparacao(int i) {
			return getRuleContext(ComparacaoContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(PyLikeParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(PyLikeParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(PyLikeParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(PyLikeParser.NEQ, i);
		}
		public IgualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterIgualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitIgualdade(this);
		}
	}

	public final IgualdadeContext igualdade() throws RecognitionException {
		IgualdadeContext _localctx = new IgualdadeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_igualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			comparacao();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				comparacao();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacaoContext extends ParserRuleContext {
		public List<AdicaoContext> adicao() {
			return getRuleContexts(AdicaoContext.class);
		}
		public AdicaoContext adicao(int i) {
			return getRuleContext(AdicaoContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(PyLikeParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(PyLikeParser.LT, i);
		}
		public List<TerminalNode> LTE() { return getTokens(PyLikeParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(PyLikeParser.LTE, i);
		}
		public List<TerminalNode> GT() { return getTokens(PyLikeParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(PyLikeParser.GT, i);
		}
		public List<TerminalNode> GTE() { return getTokens(PyLikeParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(PyLikeParser.GTE, i);
		}
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitComparacao(this);
		}
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			adicao();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) {
				{
				{
				setState(208);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				adicao();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdicaoContext extends ParserRuleContext {
		public List<MultiplicacaoContext> multiplicacao() {
			return getRuleContexts(MultiplicacaoContext.class);
		}
		public MultiplicacaoContext multiplicacao(int i) {
			return getRuleContext(MultiplicacaoContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PyLikeParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PyLikeParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PyLikeParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PyLikeParser.MINUS, i);
		}
		public AdicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterAdicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitAdicao(this);
		}
	}

	public final AdicaoContext adicao() throws RecognitionException {
		AdicaoContext _localctx = new AdicaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_adicao);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			multiplicacao();
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(217);
					multiplicacao();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacaoContext extends ParserRuleContext {
		public List<UnarioContext> unario() {
			return getRuleContexts(UnarioContext.class);
		}
		public UnarioContext unario(int i) {
			return getRuleContext(UnarioContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(PyLikeParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(PyLikeParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(PyLikeParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PyLikeParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(PyLikeParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(PyLikeParser.MOD, i);
		}
		public MultiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitMultiplicacao(this);
		}
	}

	public final MultiplicacaoContext multiplicacao() throws RecognitionException {
		MultiplicacaoContext _localctx = new MultiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			unario();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
				{
				{
				setState(224);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(225);
				unario();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnarioContext extends ParserRuleContext {
		public UnarioContext unario() {
			return getRuleContext(UnarioContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PyLikeParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(PyLikeParser.MINUS, 0); }
		public PrimarioContext primario() {
			return getRuleContext(PrimarioContext.class,0);
		}
		public UnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitUnario(this);
		}
	}

	public final UnarioContext unario() throws RecognitionException {
		UnarioContext _localctx = new UnarioContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unario);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				unario();
				}
				break;
			case TRUE:
			case FALSE:
			case NONE:
			case LPAREN:
			case NUMBER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				primario();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(PyLikeParser.ID, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PyLikeParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PyLikeParser.RPAREN, 0); }
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitPrimario(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primario);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				chamadaFuncao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(LPAREN);
				setState(240);
				expressao();
				setState(241);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PyLikeParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PyLikeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PyLikeParser.RPAREN, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitChamadaFuncao(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			match(LPAREN);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1926360064000L) != 0)) {
				{
				setState(247);
				listaArgumentos();
				}
			}

			setState(250);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgumentosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyLikeParser.COMMA, i);
		}
		public ListaArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterListaArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitListaArgumentos(this);
		}
	}

	public final ListaArgumentosContext listaArgumentos() throws RecognitionException {
		ListaArgumentosContext _localctx = new ListaArgumentosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listaArgumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			expressao();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253);
				match(COMMA);
				setState(254);
				expressao();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PyLikeParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(PyLikeParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(PyLikeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PyLikeParser.FALSE, 0); }
		public TerminalNode NONE() { return getToken(PyLikeParser.NONE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyLikeListener ) ((PyLikeListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 824633835520L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u0107\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001L\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0005\u0003T\b\u0003\n\u0003\f\u0003W\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004_\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005g\b\u0005\n\u0005\f\u0005j\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bw\b\b\n\b\f\bz\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0003\t\u0081\b\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u008c\b\n\n\n\f\n\u008f"+
		"\t\n\u0001\n\u0001\n\u0003\n\u0093\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u009a\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00a8\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00ad\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00b4\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00bb\b\u0012\n\u0012\f\u0012\u00be"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00c3\b\u0013"+
		"\n\u0013\f\u0013\u00c6\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00cb\b\u0014\n\u0014\f\u0014\u00ce\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00d3\b\u0015\n\u0015\f\u0015\u00d6\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00db\b\u0016\n\u0016\f\u0016"+
		"\u00de\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00e3\b"+
		"\u0017\n\u0017\f\u0017\u00e6\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00eb\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00f4\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u00f9\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0100\b\u001b\n\u001b"+
		"\f\u001b\u0103\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0000"+
		"\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468\u0000\u0006\u0001\u0000\u0011\u0012\u0001"+
		"\u0000\u0013\u0016\u0001\u0000\u0019\u001a\u0001\u0000\u001b\u001d\u0002"+
		"\u0000\r\r\u001a\u001a\u0002\u0000\u000e\u0010&\'\u010a\u0000=\u0001\u0000"+
		"\u0000\u0000\u0002K\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000"+
		"\u0006Q\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\nc\u0001\u0000"+
		"\u0000\u0000\fk\u0001\u0000\u0000\u0000\u000eo\u0001\u0000\u0000\u0000"+
		"\u0010q\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000\u0000\u0014\u0084"+
		"\u0001\u0000\u0000\u0000\u0016\u0099\u0001\u0000\u0000\u0000\u0018\u009b"+
		"\u0001\u0000\u0000\u0000\u001a\u009f\u0001\u0000\u0000\u0000\u001c\u00a5"+
		"\u0001\u0000\u0000\u0000\u001e\u00a9\u0001\u0000\u0000\u0000 \u00b3\u0001"+
		"\u0000\u0000\u0000\"\u00b5\u0001\u0000\u0000\u0000$\u00b7\u0001\u0000"+
		"\u0000\u0000&\u00bf\u0001\u0000\u0000\u0000(\u00c7\u0001\u0000\u0000\u0000"+
		"*\u00cf\u0001\u0000\u0000\u0000,\u00d7\u0001\u0000\u0000\u0000.\u00df"+
		"\u0001\u0000\u0000\u00000\u00ea\u0001\u0000\u0000\u00002\u00f3\u0001\u0000"+
		"\u0000\u00004\u00f5\u0001\u0000\u0000\u00006\u00fc\u0001\u0000\u0000\u0000"+
		"8\u0104\u0001\u0000\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000"+
		"\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0000\u0000\u0001A\u0001\u0001\u0000\u0000\u0000BL\u0003\b\u0004"+
		"\u0000CL\u0003\u0004\u0002\u0000DL\u0003\u0014\n\u0000EL\u0003\u0018\f"+
		"\u0000FL\u0003\u001a\r\u0000GL\u0003\u001c\u000e\u0000HL\u0003\u001e\u000f"+
		"\u0000IL\u0003\"\u0011\u0000JL\u0003\u0006\u0003\u0000KB\u0001\u0000\u0000"+
		"\u0000KC\u0001\u0000\u0000\u0000KD\u0001\u0000\u0000\u0000KE\u0001\u0000"+
		"\u0000\u0000KF\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000KH\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"L\u0003\u0001\u0000\u0000\u0000MP\u0003\u0010\b\u0000NP\u0003\u0012\t"+
		"\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0005\u0001"+
		"\u0000\u0000\u0000QU\u0005!\u0000\u0000RT\u0003\u0002\u0001\u0000SR\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000XY\u0005\"\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000Z[\u0005\u0001"+
		"\u0000\u0000[\\\u0005(\u0000\u0000\\^\u0005\u001f\u0000\u0000]_\u0003"+
		"\n\u0005\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`a\u0005 \u0000\u0000ab\u0003\u0006\u0003\u0000b\t\u0001"+
		"\u0000\u0000\u0000ch\u0003\f\u0006\u0000de\u0005\u001e\u0000\u0000eg\u0003"+
		"\f\u0006\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u000b\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000kl\u0005(\u0000\u0000lm\u0005\u0018\u0000"+
		"\u0000mn\u0003\u000e\u0007\u0000n\r\u0001\u0000\u0000\u0000op\u0005(\u0000"+
		"\u0000p\u000f\u0001\u0000\u0000\u0000qr\u0005\t\u0000\u0000rs\u0005\u001f"+
		"\u0000\u0000sx\u0003\"\u0011\u0000tu\u0005\u001e\u0000\u0000uw\u0003\""+
		"\u0011\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000{|\u0005 \u0000\u0000|\u0011\u0001\u0000\u0000"+
		"\u0000}~\u0005\n\u0000\u0000~\u0080\u0005\u001f\u0000\u0000\u007f\u0081"+
		"\u0003\"\u0011\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		" \u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0002"+
		"\u0000\u0000\u0085\u0086\u0003\u0016\u000b\u0000\u0086\u008d\u0003\u0006"+
		"\u0003\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088\u0089\u0003\u0016"+
		"\u000b\u0000\u0089\u008a\u0003\u0006\u0003\u0000\u008a\u008c\u0001\u0000"+
		"\u0000\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u0092\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0093\u0003\u0006"+
		"\u0003\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0015\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u001f"+
		"\u0000\u0000\u0095\u0096\u0003\"\u0011\u0000\u0096\u0097\u0005 \u0000"+
		"\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u009a\u0003\"\u0011\u0000"+
		"\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u0017\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0005\u0000\u0000"+
		"\u009c\u009d\u0003\u0016\u000b\u0000\u009d\u009e\u0003\u0006\u0003\u0000"+
		"\u009e\u0019\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0006\u0000\u0000"+
		"\u00a0\u00a1\u0005(\u0000\u0000\u00a1\u00a2\u0005\u0007\u0000\u0000\u00a2"+
		"\u00a3\u0003\"\u0011\u0000\u00a3\u00a4\u0003\u0006\u0003\u0000\u00a4\u001b"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005\b\u0000\u0000\u00a6\u00a8\u0003"+
		"\"\u0011\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u001d\u0001\u0000\u0000\u0000\u00a9\u00ac\u0005(\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0018\u0000\u0000\u00ab\u00ad\u0003\u000e\u0007"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0017\u0000"+
		"\u0000\u00af\u00b0\u0003 \u0010\u0000\u00b0\u001f\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b4\u0003\"\u0011\u0000\u00b2\u00b4\u0003\u0004\u0002\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"!\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003$\u0012\u0000\u00b6#\u0001"+
		"\u0000\u0000\u0000\u00b7\u00bc\u0003&\u0013\u0000\u00b8\u00b9\u0005\f"+
		"\u0000\u0000\u00b9\u00bb\u0003&\u0013\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd%\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c4\u0003(\u0014\u0000\u00c0"+
		"\u00c1\u0005\u000b\u0000\u0000\u00c1\u00c3\u0003(\u0014\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\'\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00cc\u0003"+
		"*\u0015\u0000\u00c8\u00c9\u0007\u0000\u0000\u0000\u00c9\u00cb\u0003*\u0015"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd)\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d4\u0003,\u0016\u0000\u00d0\u00d1\u0007\u0001\u0000\u0000\u00d1"+
		"\u00d3\u0003,\u0016\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5+\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d7\u00dc\u0003.\u0017\u0000\u00d8\u00d9\u0007\u0002"+
		"\u0000\u0000\u00d9\u00db\u0003.\u0017\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd-\u0001\u0000\u0000\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e4\u00030\u0018\u0000\u00e0"+
		"\u00e1\u0007\u0003\u0000\u0000\u00e1\u00e3\u00030\u0018\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5/\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0007"+
		"\u0004\u0000\u0000\u00e8\u00eb\u00030\u0018\u0000\u00e9\u00eb\u00032\u0019"+
		"\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb1\u0001\u0000\u0000\u0000\u00ec\u00f4\u00038\u001c\u0000\u00ed"+
		"\u00f4\u0005(\u0000\u0000\u00ee\u00f4\u00034\u001a\u0000\u00ef\u00f0\u0005"+
		"\u001f\u0000\u0000\u00f0\u00f1\u0003\"\u0011\u0000\u00f1\u00f2\u0005 "+
		"\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f3\u00ed\u0001\u0000\u0000\u0000\u00f3\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f43\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0005(\u0000\u0000\u00f6\u00f8\u0005\u001f\u0000\u0000"+
		"\u00f7\u00f9\u00036\u001b\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005 \u0000\u0000\u00fb5\u0001\u0000\u0000\u0000\u00fc\u0101\u0003"+
		"\"\u0011\u0000\u00fd\u00fe\u0005\u001e\u0000\u0000\u00fe\u0100\u0003\""+
		"\u0011\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u01027\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0007\u0005\u0000\u0000\u01059\u0001\u0000\u0000\u0000"+
		"\u0018=KOU^hx\u0080\u008d\u0092\u0099\u00a7\u00ac\u00b3\u00bc\u00c4\u00cc"+
		"\u00d4\u00dc\u00e4\u00ea\u00f3\u00f8\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}