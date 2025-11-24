from antlr4.error.ErrorListener import ErrorListener


class collectingErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        # Formata a mensagem de erro e a adiciona à lista de erros
        # recognizer: o reconhecedor que detectou o erro
        # offendingSymbol: o símbolo que causou o erro
        # line: a linha onde o erro ocorreu
        # column: a coluna onde o erro ocorreu
        # msg: a mensagem de erro
        # e: a exceção lançada (se houver)
        if offendingSymbol is None:
            error_message = f"Erro de sintaxe na linha {line}, coluna {column}: {msg}"
        else:
            error_message = f"Erro de sintaxe na linha {line}, coluna {column}: {msg}, símbolo errado: {offendingSymbol}"
        self.errors.append(error_message)

    def has_errors(self):
        return len(self.errors) > 0

    def format_errors(self):
        return "\n".join(self.errors)
