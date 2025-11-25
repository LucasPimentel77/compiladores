// Generated from c:/Users/User/Desktop/ENC/2025.2/compiladores/grammar/PyLike.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PyLikeParser}.
 */
public interface PyLikeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PyLikeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PyLikeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(PyLikeParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(PyLikeParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(PyLikeParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(PyLikeParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(PyLikeParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(PyLikeParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(PyLikeParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(PyLikeParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(PyLikeParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(PyLikeParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(PyLikeParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(PyLikeParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PyLikeParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PyLikeParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#escreva}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(PyLikeParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#escreva}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(PyLikeParser.EscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#leia}.
	 * @param ctx the parse tree
	 */
	void enterLeia(PyLikeParser.LeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#leia}.
	 * @param ctx the parse tree
	 */
	void exitLeia(PyLikeParser.LeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#declaracaoSe}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoSe(PyLikeParser.DeclaracaoSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#declaracaoSe}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoSe(PyLikeParser.DeclaracaoSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(PyLikeParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(PyLikeParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#declaracaoEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoEnquanto(PyLikeParser.DeclaracaoEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#declaracaoEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoEnquanto(PyLikeParser.DeclaracaoEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#declaracaoPara}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoPara(PyLikeParser.DeclaracaoParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#declaracaoPara}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoPara(PyLikeParser.DeclaracaoParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#declaracaoRetorno}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoRetorno(PyLikeParser.DeclaracaoRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#declaracaoRetorno}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoRetorno(PyLikeParser.DeclaracaoRetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(PyLikeParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(PyLikeParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#atribuivel}.
	 * @param ctx the parse tree
	 */
	void enterAtribuivel(PyLikeParser.AtribuivelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#atribuivel}.
	 * @param ctx the parse tree
	 */
	void exitAtribuivel(PyLikeParser.AtribuivelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(PyLikeParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(PyLikeParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#logicoOu}.
	 * @param ctx the parse tree
	 */
	void enterLogicoOu(PyLikeParser.LogicoOuContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#logicoOu}.
	 * @param ctx the parse tree
	 */
	void exitLogicoOu(PyLikeParser.LogicoOuContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#logicoE}.
	 * @param ctx the parse tree
	 */
	void enterLogicoE(PyLikeParser.LogicoEContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#logicoE}.
	 * @param ctx the parse tree
	 */
	void exitLogicoE(PyLikeParser.LogicoEContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#igualdade}.
	 * @param ctx the parse tree
	 */
	void enterIgualdade(PyLikeParser.IgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#igualdade}.
	 * @param ctx the parse tree
	 */
	void exitIgualdade(PyLikeParser.IgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(PyLikeParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(PyLikeParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#adicao}.
	 * @param ctx the parse tree
	 */
	void enterAdicao(PyLikeParser.AdicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#adicao}.
	 * @param ctx the parse tree
	 */
	void exitAdicao(PyLikeParser.AdicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacao(PyLikeParser.MultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacao(PyLikeParser.MultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#unario}.
	 * @param ctx the parse tree
	 */
	void enterUnario(PyLikeParser.UnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#unario}.
	 * @param ctx the parse tree
	 */
	void exitUnario(PyLikeParser.UnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#primario}.
	 * @param ctx the parse tree
	 */
	void enterPrimario(PyLikeParser.PrimarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#primario}.
	 * @param ctx the parse tree
	 */
	void exitPrimario(PyLikeParser.PrimarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(PyLikeParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(PyLikeParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentos(PyLikeParser.ListaArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentos(PyLikeParser.ListaArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyLikeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PyLikeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyLikeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PyLikeParser.LiteralContext ctx);
}