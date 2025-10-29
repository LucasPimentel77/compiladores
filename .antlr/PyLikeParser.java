// Generated from c:/Users/Lucas Taveira/Desktop/Programacao/Compiladores/compiladores/PyLike.g4 by ANTLR 4.13.1
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
		LTE=19, GTE=20, LT=21, GT=22, ASSIGN=23, PLUS=24, MINUS=25, MUL=26, DIV=27, 
		MOD=28, COMMA=29, LPAREN=30, RPAREN=31, LBRACE=32, RBRACE=33, LBRACK=34, 
		RBRACK=35, DOT=36, NUMBER=37, STRING=38, ID=39, LINE_COMMENT=40, LINE_COMMENT2=41, 
		COMMENT=42, WS=43;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_comandos = 2, RULE_bloco = 3, 
		RULE_declaracaoFuncao = 4, RULE_listaParametros = 5, RULE_escreva = 6, 
		RULE_leia = 7, RULE_declaracaoSe = 8, RULE_condicao = 9, RULE_declaracaoEnquanto = 10, 
		RULE_declaracaoPara = 11, RULE_declaracaoRetorno = 12, RULE_atribuicao = 13, 
		RULE_atribuivel = 14, RULE_expressao = 15, RULE_logicoOu = 16, RULE_logicoE = 17, 
		RULE_igualdade = 18, RULE_comparacao = 19, RULE_adicao = 20, RULE_multiplicacao = 21, 
		RULE_unario = 22, RULE_primario = 23, RULE_chamadaFuncao = 24, RULE_listaArgumentos = 25, 
		RULE_literal = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "comandos", "bloco", "declaracaoFuncao", "listaParametros", 
			"escreva", "leia", "declaracaoSe", "condicao", "declaracaoEnquanto", 
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
			"'+'", "'-'", "'*'", "'/'", "'%'", "','", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "IF", "ELIF", "ELSE", "WHILE", "FOR", "IN", "RETURN", "PRINT", 
			"INPUT", "AND", "OR", "NOT", "TRUE", "FALSE", "NONE", "EQ", "NEQ", "LTE", 
			"GTE", "LT", "GT", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "COMMA", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "DOT", "NUMBER", 
			"STRING", "ID", "LINE_COMMENT", "LINE_COMMENT2", "COMMENT", "WS"
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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 967475062630L) != 0)) {
				{
				{
				setState(54);
				declaracao();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				declaracaoFuncao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				comandos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				declaracaoSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				declaracaoEnquanto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				declaracaoPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				declaracaoRetorno();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				atribuicao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				expressao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
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
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comandos);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				escreva();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LBRACE);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 967475062630L) != 0)) {
				{
				{
				setState(78);
				declaracao();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(DEF);
			setState(87);
			match(ID);
			setState(88);
			match(LPAREN);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(89);
				listaParametros();
				}
			}

			setState(92);
			match(RPAREN);
			setState(93);
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
		public List<TerminalNode> ID() { return getTokens(PyLikeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PyLikeParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyLikeParser.COMMA, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				match(ID);
				}
				}
				setState(102);
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
	}

	public final EscrevaContext escreva() throws RecognitionException {
		EscrevaContext _localctx = new EscrevaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_escreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(PRINT);
			setState(104);
			match(LPAREN);
			setState(105);
			expressao();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				expressao();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
	}

	public final LeiaContext leia() throws RecognitionException {
		LeiaContext _localctx = new LeiaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_leia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(INPUT);
			setState(116);
			match(LPAREN);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 963180093440L) != 0)) {
				{
				setState(117);
				expressao();
				}
			}

			setState(120);
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
	}

	public final DeclaracaoSeContext declaracaoSe() throws RecognitionException {
		DeclaracaoSeContext _localctx = new DeclaracaoSeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracaoSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IF);
			setState(123);
			condicao();
			setState(124);
			bloco();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(125);
				match(ELIF);
				setState(126);
				condicao();
				setState(127);
				bloco();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(134);
				match(ELSE);
				setState(135);
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
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicao);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(LPAREN);
				setState(139);
				expressao();
				setState(140);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
	}

	public final DeclaracaoEnquantoContext declaracaoEnquanto() throws RecognitionException {
		DeclaracaoEnquantoContext _localctx = new DeclaracaoEnquantoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracaoEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(WHILE);
			setState(146);
			condicao();
			setState(147);
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
	}

	public final DeclaracaoParaContext declaracaoPara() throws RecognitionException {
		DeclaracaoParaContext _localctx = new DeclaracaoParaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracaoPara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(FOR);
			setState(150);
			match(ID);
			setState(151);
			match(IN);
			setState(152);
			expressao();
			setState(153);
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
	}

	public final DeclaracaoRetornoContext declaracaoRetorno() throws RecognitionException {
		DeclaracaoRetornoContext _localctx = new DeclaracaoRetornoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracaoRetorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(RETURN);
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
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
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ID);
			setState(160);
			match(ASSIGN);
			setState(161);
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
	}

	public final AtribuivelContext atribuivel() throws RecognitionException {
		AtribuivelContext _localctx = new AtribuivelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atribuivel);
		try {
			setState(165);
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
				setState(163);
				expressao();
				}
				break;
			case PRINT:
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
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
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
	}

	public final LogicoOuContext logicoOu() throws RecognitionException {
		LogicoOuContext _localctx = new LogicoOuContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicoOu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			logicoE();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(170);
				match(OR);
				setState(171);
				logicoE();
				}
				}
				setState(176);
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
	}

	public final LogicoEContext logicoE() throws RecognitionException {
		LogicoEContext _localctx = new LogicoEContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicoE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			igualdade();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(178);
				match(AND);
				setState(179);
				igualdade();
				}
				}
				setState(184);
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
	}

	public final IgualdadeContext igualdade() throws RecognitionException {
		IgualdadeContext _localctx = new IgualdadeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_igualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			comparacao();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				comparacao();
				}
				}
				setState(192);
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
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			adicao();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) {
				{
				{
				setState(194);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				adicao();
				}
				}
				setState(200);
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
	}

	public final AdicaoContext adicao() throws RecognitionException {
		AdicaoContext _localctx = new AdicaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_adicao);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			multiplicacao();
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(203);
					multiplicacao();
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	}

	public final MultiplicacaoContext multiplicacao() throws RecognitionException {
		MultiplicacaoContext _localctx = new MultiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			unario();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) {
				{
				{
				setState(210);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				unario();
				}
				}
				setState(216);
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
	}

	public final UnarioContext unario() throws RecognitionException {
		UnarioContext _localctx = new UnarioContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unario);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
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
				setState(219);
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
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primario);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				chamadaFuncao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(LPAREN);
				setState(226);
				expressao();
				setState(227);
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
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ID);
			setState(232);
			match(LPAREN);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 963180093440L) != 0)) {
				{
				setState(233);
				listaArgumentos();
				}
			}

			setState(236);
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
	}

	public final ListaArgumentosContext listaArgumentos() throws RecognitionException {
		ListaArgumentosContext _localctx = new ListaArgumentosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listaArgumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			expressao();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(239);
				match(COMMA);
				setState(240);
				expressao();
				}
				}
				setState(245);
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 412316975104L) != 0)) ) {
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
		"\u0004\u0001+\u00f9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003P\b\u0003\n\u0003"+
		"\f\u0003S\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005c\b\u0005\n\u0005"+
		"\f\u0005f\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006m\b\u0006\n\u0006\f\u0006p\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007w\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0082\b\b\n\b\f\b\u0085\t\b\u0001\b\u0001\b\u0003\b\u0089\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0090\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u009e\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u00a6\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ad\b\u0010"+
		"\n\u0010\f\u0010\u00b0\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00b5\b\u0011\n\u0011\f\u0011\u00b8\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00bd\b\u0012\n\u0012\f\u0012\u00c0\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00c5\b\u0013\n\u0013\f\u0013"+
		"\u00c8\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00cd\b"+
		"\u0014\n\u0014\f\u0014\u00d0\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u00d5\b\u0015\n\u0015\f\u0015\u00d8\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00dd\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00e6"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00eb\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u00f2\b\u0019\n\u0019\f\u0019\u00f5\t\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0006\u0001\u0000"+
		"\u0011\u0012\u0001\u0000\u0013\u0016\u0001\u0000\u0018\u0019\u0001\u0000"+
		"\u001a\u001c\u0002\u0000\r\r\u0019\u0019\u0002\u0000\u000e\u0010%&\u00fd"+
		"\u00009\u0001\u0000\u0000\u0000\u0002G\u0001\u0000\u0000\u0000\u0004K"+
		"\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bV\u0001\u0000"+
		"\u0000\u0000\n_\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000e"+
		"s\u0001\u0000\u0000\u0000\u0010z\u0001\u0000\u0000\u0000\u0012\u008f\u0001"+
		"\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u0095\u0001"+
		"\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a\u009f\u0001"+
		"\u0000\u0000\u0000\u001c\u00a5\u0001\u0000\u0000\u0000\u001e\u00a7\u0001"+
		"\u0000\u0000\u0000 \u00a9\u0001\u0000\u0000\u0000\"\u00b1\u0001\u0000"+
		"\u0000\u0000$\u00b9\u0001\u0000\u0000\u0000&\u00c1\u0001\u0000\u0000\u0000"+
		"(\u00c9\u0001\u0000\u0000\u0000*\u00d1\u0001\u0000\u0000\u0000,\u00dc"+
		"\u0001\u0000\u0000\u0000.\u00e5\u0001\u0000\u0000\u00000\u00e7\u0001\u0000"+
		"\u0000\u00002\u00ee\u0001\u0000\u0000\u00004\u00f6\u0001\u0000\u0000\u0000"+
		"68\u0003\u0002\u0001\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0000\u0000\u0001=\u0001"+
		"\u0001\u0000\u0000\u0000>H\u0003\b\u0004\u0000?H\u0003\u0004\u0002\u0000"+
		"@H\u0003\u0010\b\u0000AH\u0003\u0014\n\u0000BH\u0003\u0016\u000b\u0000"+
		"CH\u0003\u0018\f\u0000DH\u0003\u001a\r\u0000EH\u0003\u001e\u000f\u0000"+
		"FH\u0003\u0006\u0003\u0000G>\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000"+
		"\u0000G@\u0001\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000GB\u0001\u0000"+
		"\u0000\u0000GC\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0003\u0001\u0000\u0000"+
		"\u0000IL\u0003\f\u0006\u0000JL\u0003\u000e\u0007\u0000KI\u0001\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000MQ\u0005"+
		" \u0000\u0000NP\u0003\u0002\u0001\u0000ON\u0001\u0000\u0000\u0000PS\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005!\u0000\u0000"+
		"U\u0007\u0001\u0000\u0000\u0000VW\u0005\u0001\u0000\u0000WX\u0005\'\u0000"+
		"\u0000XZ\u0005\u001e\u0000\u0000Y[\u0003\n\u0005\u0000ZY\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005\u001f"+
		"\u0000\u0000]^\u0003\u0006\u0003\u0000^\t\u0001\u0000\u0000\u0000_d\u0005"+
		"\'\u0000\u0000`a\u0005\u001d\u0000\u0000ac\u0005\'\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000e\u000b\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gh\u0005\t\u0000\u0000hi\u0005\u001e\u0000\u0000in\u0003\u001e"+
		"\u000f\u0000jk\u0005\u001d\u0000\u0000km\u0003\u001e\u000f\u0000lj\u0001"+
		"\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000qr\u0005\u001f\u0000\u0000r\r\u0001\u0000\u0000\u0000st\u0005\n"+
		"\u0000\u0000tv\u0005\u001e\u0000\u0000uw\u0003\u001e\u000f\u0000vu\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0005\u001f\u0000\u0000y\u000f\u0001\u0000\u0000\u0000z{\u0005\u0002"+
		"\u0000\u0000{|\u0003\u0012\t\u0000|\u0083\u0003\u0006\u0003\u0000}~\u0005"+
		"\u0003\u0000\u0000~\u007f\u0003\u0012\t\u0000\u007f\u0080\u0003\u0006"+
		"\u0003\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000"+
		"\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0088\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0004\u0000"+
		"\u0000\u0087\u0089\u0003\u0006\u0003\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0011\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\u001e\u0000\u0000\u008b\u008c\u0003\u001e\u000f"+
		"\u0000\u008c\u008d\u0005\u001f\u0000\u0000\u008d\u0090\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0003\u001e\u000f\u0000\u008f\u008a\u0001\u0000\u0000"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0013\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0005\u0000\u0000\u0092\u0093\u0003\u0012\t\u0000"+
		"\u0093\u0094\u0003\u0006\u0003\u0000\u0094\u0015\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0006\u0000\u0000\u0096\u0097\u0005\'\u0000\u0000\u0097"+
		"\u0098\u0005\u0007\u0000\u0000\u0098\u0099\u0003\u001e\u000f\u0000\u0099"+
		"\u009a\u0003\u0006\u0003\u0000\u009a\u0017\u0001\u0000\u0000\u0000\u009b"+
		"\u009d\u0005\b\u0000\u0000\u009c\u009e\u0003\u001e\u000f\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u0019"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\'\u0000\u0000\u00a0\u00a1\u0005"+
		"\u0017\u0000\u0000\u00a1\u00a2\u0003\u001c\u000e\u0000\u00a2\u001b\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u0003\u001e\u000f\u0000\u00a4\u00a6\u0003"+
		"\u0004\u0002\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u001d\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003"+
		" \u0010\u0000\u00a8\u001f\u0001\u0000\u0000\u0000\u00a9\u00ae\u0003\""+
		"\u0011\u0000\u00aa\u00ab\u0005\f\u0000\u0000\u00ab\u00ad\u0003\"\u0011"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af!\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b6\u0003$\u0012\u0000\u00b2\u00b3\u0005\u000b\u0000\u0000\u00b3"+
		"\u00b5\u0003$\u0012\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7#\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00be\u0003&\u0013\u0000\u00ba\u00bb\u0007\u0000"+
		"\u0000\u0000\u00bb\u00bd\u0003&\u0013\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf%\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c6\u0003(\u0014\u0000\u00c2"+
		"\u00c3\u0007\u0001\u0000\u0000\u00c3\u00c5\u0003(\u0014\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\'\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ce\u0003"+
		"*\u0015\u0000\u00ca\u00cb\u0007\u0002\u0000\u0000\u00cb\u00cd\u0003*\u0015"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf)\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d6\u0003,\u0016\u0000\u00d2\u00d3\u0007\u0003\u0000\u0000\u00d3"+
		"\u00d5\u0003,\u0016\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7+\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0007\u0004\u0000\u0000\u00da\u00dd\u0003"+
		",\u0016\u0000\u00db\u00dd\u0003.\u0017\u0000\u00dc\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd-\u0001\u0000\u0000\u0000"+
		"\u00de\u00e6\u00034\u001a\u0000\u00df\u00e6\u0005\'\u0000\u0000\u00e0"+
		"\u00e6\u00030\u0018\u0000\u00e1\u00e2\u0005\u001e\u0000\u0000\u00e2\u00e3"+
		"\u0003\u001e\u000f\u0000\u00e3\u00e4\u0005\u001f\u0000\u0000\u00e4\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e5\u00de\u0001\u0000\u0000\u0000\u00e5\u00df"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e0\u0001\u0000\u0000\u0000\u00e5\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e6/\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"\'\u0000\u0000\u00e8\u00ea\u0005\u001e\u0000\u0000\u00e9\u00eb\u00032"+
		"\u0019\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u001f"+
		"\u0000\u0000\u00ed1\u0001\u0000\u0000\u0000\u00ee\u00f3\u0003\u001e\u000f"+
		"\u0000\u00ef\u00f0\u0005\u001d\u0000\u0000\u00f0\u00f2\u0003\u001e\u000f"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f43\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0007\u0005\u0000\u0000\u00f75\u0001\u0000\u0000\u0000\u0017"+
		"9GKQZdnv\u0083\u0088\u008f\u009d\u00a5\u00ae\u00b6\u00be\u00c6\u00ce\u00d6"+
		"\u00dc\u00e5\u00ea\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}