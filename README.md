# PyLike — linguagem baseada em Python

Repositório com a gramática ANTLR e os arquivos gerados em Python.

## Visão geral

Este projeto contém uma gramática ANTLR chamada `PyLike` que descreve uma linguagem inspirada em Python (com criação de funções, estruturas condicionais, laços de repetição, input, operadores, literais, chamadas de função, atribuições e blocos delimitados por `{ }`).

Para facilitar experimentação com a árvore sintática em Python foram incluidos os arquivos gerados pelo ANTLR.

## Estrutura do repositório

- `PyLike.g4` — arquivo de gramática ANTLR (fonte).
- `PyLikeLexer.py`, `PyLikeParser.py`, `PyLikeListener.py`, `*.tokens` — arquivos gerados pelo ANTLR para Python.
- `antlr-4.13.1-complete.jar` (Java 21+), `antlr-4.5.1-complete.jar` (Java 8) — jars do ANTLR incluídos (existem múltiplas versões para diferentes versões do java).

## Requisitos

- Java 8+ (para executar o JAR do ANTLR)
- Python 3.7+ (testado com CPython)
- pacote `antlr4-python3-runtime` compatível com a versão do runtime usada para gerar os arquivos (instale via pip).

Instalação do runtime Python (exemplo):

```bash
pip install antlr4-python3-runtime
```

No Windows (cmd.exe) use o mesmo comando no prompt.

## Regenerando os arquivos a partir da gramática

Se quiser regenerar o lexer/parser/listener a partir de `PyLike.g4`, execute o JAR do ANTLR. Exemplo usando a versão 4.13.1 incluída (ajuste a versão se preferir):

No Windows (cmd.exe):

```cmd
cd /d "c:\Users\Lucas Taveira\Desktop\Programacao\Compiladores\compiladores"
java -jar antlr-4.13.1-complete.jar -Dlanguage=Python3 PyLike.g4
```

Isso vai gerar/atualizar arquivos como `PyLikeLexer.py`, `PyLikeParser.py`, `PyLikeListener.py` e arquivos `.tokens`.

Observação: alguns arquivos já foram gerados com ANTLR 4.5.1 — se você regenerar com outra versão, pode haver pequenas diferenças no código gerado. Use a mesma versão do runtime Python para evitar incompatibilidades.

## Exemplo mínimo de uso em Python

Abaixo um exemplo simples de como usar os arquivos gerados para parsear uma string de código PyLike e imprimir a árvore.

```python
from antlr4 import InputStream, CommonTokenStream
from PyLikeLexer import PyLikeLexer
from PyLikeParser import PyLikeParser

code = 'print("Olá, PyLike")'
input_stream = InputStream(code)
lexer = PyLikeLexer(input_stream)
tokens = CommonTokenStream(lexer)
parser = PyLikeParser(tokens)
tree = parser.programa()

print(tree.toStringTree(recog=parser))
```