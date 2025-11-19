from antlr4 import InputStream, CommonTokenStream
from generated import PyLikeLexer
from generated.PyLikeParser import PyLikeParser
from tools.criar_dot import antlr_tree_to_dot

NOME_DO_ARQUIVO = "teste.txt"

try:
    with open(f"../tests/{NOME_DO_ARQUIVO}", "r") as file:
        conteudo = file.read()
except FileNotFoundError:
    conteudo = 'print("Olá, PyLike")'

code = conteudo
input_stream = InputStream(code)
lexer = PyLikeLexer(input_stream)
tokens = CommonTokenStream(lexer)
parser = PyLikeParser(tokens)
tree = parser.programa()

dot_str = antlr_tree_to_dot(tree, parser.ruleNames)

with open(f"../output/{NOME_DO_ARQUIVO}.dot", "w") as f:
    f.write(dot_str)
