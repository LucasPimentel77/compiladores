from antlr4 import InputStream, CommonTokenStream
from PyLikeLexer import PyLikeLexer
from PyLikeParser import PyLikeParser
from criar_dot import antlr_tree_to_dot

code = 'print("Olá, PyLike")'
input_stream = InputStream(code)
lexer = PyLikeLexer(input_stream)
tokens = CommonTokenStream(lexer)
parser = PyLikeParser(tokens)
tree = parser.programa()

dot_str = antlr_tree_to_dot(tree, parser.ruleNames)

with open("output.dot", "w") as f:
    f.write(dot_str)
