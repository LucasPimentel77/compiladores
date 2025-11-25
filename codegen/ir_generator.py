# ir_generator.py

from generated.PyLikeVisitor import PyLikeVisitor
from generated.PyLikeParser import PyLikeParser
from codegen.instruction import IRInstruction, IRFunction


class IRGenerator(PyLikeVisitor):
    def __init__(self):
        super().__init__()
        self.functions = {}
        self.current_func = None
        self.global_instructions = []
        self.temp_count = 0
        self.label_count = 0

    def generate(self, tree):
        return self.visit(tree)

    def new_temp(self):
        t = f"t{self.temp_count}"
        self.temp_count += 1
        return t

    def new_label(self):
        l = f"L{self.label_count}"
        self.label_count += 1
        return l

    def emit(self, op, dest=None, arg1=None, arg2=None):
        instr = IRInstruction(op, dest, arg1, arg2)
        if self.current_func:
            self.current_func.emit(instr)
        else:
            self.global_instructions.append(instr)
        return instr

    def visitPrograma(self, ctx: PyLikeParser.ProgramaContext):
        for d in ctx.declaracao():
            self.visit(d)
        return {
            'functions': self.functions,
            'global': self.global_instructions
        }

    def visitDeclaracaoFuncao(self, ctx: PyLikeParser.DeclaracaoFuncaoContext):
        name = ctx.ID().getText()
        params = []
        if ctx.listaParametros():
            for p in ctx.listaParametros().parametro():
                params.append(p.ID().getText())

        func = IRFunction(name, params)
        self.functions[name] = func

        prev = self.current_func
        self.current_func = func
        self.visit(ctx.bloco())
        self.current_func = prev

    def visitBloco(self, ctx: PyLikeParser.BlocoContext):
        for d in ctx.declaracao():
            self.visit(d)

    def visitAtribuicao(self, ctx: PyLikeParser.AtribuicaoContext):
        var_name = ctx.ID().getText()
        rhs = ctx.atribuivel()
        if rhs is None:
            return

        if rhs.expressao():
            val = self.visit(rhs.expressao())
            self.emit('MOV', dest=var_name, arg1=val)
        else:
            self.visit(rhs.comandos())

    def visitEscreva(self, ctx):
        for expr in ctx.expressao():
            val = self.visit(expr)
            self.emit('PRINT', arg1=val)

    def visitLeia(self, ctx):
        prompt = None
        if ctx.expressao():
            prompt = self.visit(ctx.expressao())
        self.emit('INPUT', arg1=prompt)

    def visitDeclaracaoRetorno(self, ctx):
        if ctx.expressao():
            val = self.visit(ctx.expressao())
            self.emit('RETURN', arg1=val)
        else:
            self.emit('RETURN')

    def visitDeclaracaoSe(self, ctx):
        end_label = self.new_label()
        conds = ctx.condicao()
        blocos = ctx.bloco()

        for i, cond in enumerate(conds):
            lbl_else = self.new_label()
            cond_val = self.visit(cond)
            self.emit('IF_FALSE_GOTO', arg1=cond_val, arg2=lbl_else)
            self.visit(blocos[i])
            self.emit('GOTO', arg1=end_label)
            self.emit('LABEL', dest=lbl_else)

        if ctx.ELSE():
            self.visit(blocos[-1])   

        self.emit('LABEL', dest=end_label)

    def visitDeclaracaoEnquanto(self, ctx):
        start = self.new_label()
        end = self.new_label()
        self.emit('LABEL', dest=start)
        cond_val = self.visit(ctx.condicao())
        self.emit('IF_FALSE_GOTO', arg1=cond_val, arg2=end)
        self.visit(ctx.bloco())
        self.emit('GOTO', arg1=start)
        self.emit('LABEL', dest=end)

    def visitDeclaracaoPara(self, ctx):
        loop_var = ctx.ID().getText()
        seq = self.visit(ctx.expressao())
        start = self.new_label()
        end = self.new_label()
        idx = self.new_temp()

        self.emit('ASSIGN_ITER', dest=idx, arg1=seq)
        self.emit('LABEL', dest=start)

        next_val = self.new_temp()
        self.emit('ITER_NEXT', dest=next_val, arg1=idx)
        self.emit('IF_FALSE_GOTO', arg1=next_val, arg2=end)

        self.emit('MOV', dest=loop_var, arg1=next_val)
        self.visit(ctx.bloco())
        self.emit('GOTO', arg1=start)
        self.emit('LABEL', dest=end)

    def visitChamadaFuncao(self, ctx):
        name = ctx.ID().getText()
        args = []

        if ctx.listaArgumentos():
            for e in ctx.listaArgumentos().expressao():
                args.append(self.visit(e))

        for a in args:
            self.emit('ARG', arg1=a)

        ret = self.new_temp()
        self.emit('CALL', dest=ret, arg1=name, arg2=len(args))
        return ret

    def visitAdicao(self, ctx):
        terms = ctx.multiplicacao()
        left = self.visit(terms[0])
        i = 1
        while i < len(terms):
            op = ctx.getChild(2*i-1).getText()
            right = self.visit(terms[i])
            tmp = self.new_temp()
            self.emit(op, dest=tmp, arg1=left, arg2=right)
            left = tmp
            i += 1
        return left

    def visitMultiplicacao(self, ctx):
        terms = ctx.unario()
        left = self.visit(terms[0])
        i = 1
        while i < len(terms):
            op = ctx.getChild(2*i-1).getText()
            right = self.visit(terms[i])
            tmp = self.new_temp()
            self.emit(op, dest=tmp, arg1=left, arg2=right)
            left = tmp
            i += 1
        return left

    def visitComparacao(self, ctx):
        terms = ctx.adicao()
        left = self.visit(terms[0])
        i = 1
        while i < len(terms):
            op = ctx.getChild(2*i-1).getText()
            right = self.visit(terms[i])
            tmp = self.new_temp()
            self.emit(op, dest=tmp, arg1=left, arg2=right)
            left = tmp
            i += 1
        return left

    def visitIgualdade(self, ctx):
        terms = ctx.comparacao()
        left = self.visit(terms[0])
        i = 1
        while i < len(terms):
            op = ctx.getChild(2*i-1).getText()
            right = self.visit(terms[i])
            tmp = self.new_temp()
            self.emit(op, dest=tmp, arg1=left, arg2=right)
            left = tmp
            i += 1
        return left

    def visitLogicoE(self, ctx):
        parts = ctx.igualdade()
        left = self.visit(parts[0])
        i = 1
        while i < len(parts):
            right = self.visit(parts[i])
            tmp = self.new_temp()
            self.emit('and', dest=tmp, arg1=left, arg2=right)
            left = tmp
            i += 1
        return left

    def visitLogicoOu(self, ctx):
        parts = ctx.logicoE()
        left = self.visit(parts[0])
        i = 1
        while i < len(parts):
            right = self.visit(parts[i])
            tmp = self.new_temp()
            self.emit('or', dest=tmp, arg1=left, arg2=right)
            left = tmp
            i += 1
        return left

    def visitUnario(self, ctx):
        if ctx.primario():
            return self.visit(ctx.primario())
        op = ctx.getChild(0).getText()
        val = self.visit(ctx.unario())
        tmp = self.new_temp()
        if op == 'not':
            self.emit('not', dest=tmp, arg1=val)
        else:
            self.emit('u-', dest=tmp, arg1=val)
        return tmp

    def visitPrimario(self, ctx):
        if ctx.literal():
            return self.visit(ctx.literal())
        if ctx.ID():
            return ctx.ID().getText()
        if ctx.chamadaFuncao():
            return self.visit(ctx.chamadaFuncao())
        if ctx.expressao():
            return self.visit(ctx.expressao())
        return None

    def visitLiteral(self, ctx):
        if ctx.NUMBER():
            return ctx.NUMBER().getText()
        if ctx.STRING():
            return ctx.STRING().getText()
        if ctx.TRUE() or ctx.FALSE():
            return ctx.getText()
        if ctx.NONE():
            return 'None'
        return None
