from antlr4 import InputStream, CommonTokenStream
from generated.PyLikeLexer import PyLikeLexer
from generated.PyLikeErrorListener import collectingErrorListener
from generated.PyLikeParser import PyLikeParser
from tools.criar_dot import antlr_tree_to_dot
from generated.PyLikeSemantic import SemanticAnalyzer
from graphviz import Source

NOME_DO_ARQUIVO = "classificacao_triangulo"

try:
    with open(f"tests/{NOME_DO_ARQUIVO}.txt", "r", encoding="utf-8") as file:
        conteudo = file.read()
except FileNotFoundError:
    conteudo = 'print("Olá, PyLike")'

code = conteudo
input_stream = InputStream(code)
lexer = PyLikeLexer(input_stream)
tokens = CommonTokenStream(lexer)
parser = PyLikeParser(tokens)

parser.removeErrorListeners()
error_listener = collectingErrorListener()
parser.addErrorListener(error_listener)

tree = parser.programa()

if error_listener.has_errors():
    print("Erros sintáticos:\n", error_listener.format_errors())
    raise SystemExit(1)  # para o sistema se houver erros sintáticos

dot_str = antlr_tree_to_dot(tree, parser.ruleNames)

# transforma o dot gerado em um arquivo SVG
nome_arquivo_saida = f"output/{NOME_DO_ARQUIVO}"
src = Source(dot_str, filename=nome_arquivo_saida, format="svg")
src.render(filename=nome_arquivo_saida, view=False, cleanup=True)

# Análise semântica
analyzer = SemanticAnalyzer()
analyzer.visit(tree)

if hasattr(analyzer, "errors") and analyzer.errors:
    print("Erros semânticos:")
    for err in analyzer.errors:
        print("- ", err)
    raise SystemExit(2)
else:
    print("Análise semântica concluída com sucesso: nenhum erro encontrado.")
