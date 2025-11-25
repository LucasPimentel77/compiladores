class LLVMCodeGen:
    def __init__(self):
        self.lines = []
        self.temp_count = 0

    def emit(self, text):
        self.lines.append(text)

    def new_temp(self):
        self.temp_count += 1
        return f"%t{self.temp_count}"

    # ------------------------------
    #   GERA O ARQUIVO FINAL .ll
    # ------------------------------
    def generate(self, ir):
        self.emit("; LLVM IR gerado pelo compilador PyLike")
        self.emit("declare i32 @printf(i8*, ...)")
        self.emit('@fmt = constant [4 x i8] c"%f\\0A\\00"\n')

        # Funções do usuário
        for name, fn in ir["functions"].items():
            self.generate_function(fn)

        # Código global vira o main()
        self.emit("define i32 @main() {")
        self.emit("entry:")

        varmap = {}

        for instr in ir["global"]:
            self.translate(instr, varmap)

        self.emit("  ret i32 0")
        self.emit("}")

        return "\n".join(self.lines)

    # ------------------------------
    #   TRADUTOR DE INSTRUÇÕES IR
    # ------------------------------
    def translate(self, instr, varmap):
        op = instr.op

        # --- Movimentação de valores ---
        if op == "MOV":
            temp = self.new_temp()
            self.emit(f"  {temp} = fadd double 0.0, {instr.arg1}")
            varmap[instr.dest] = temp
            return

        # --- Operações aritméticas ---
        if op in ["+", "-", "*", "/", "%"]:
            t1 = self.load_value(instr.arg1, varmap)
            t2 = self.load_value(instr.arg2, varmap)
            out = self.new_temp()
            if op == "+":
                self.emit(f"  {out} = fadd double {t1}, {t2}")
            elif op == "-":
                self.emit(f"  {out} = fsub double {t1}, {t2}")
            elif op == "*":
                self.emit(f"  {out} = fmul double {t1}, {t2}")
            elif op == "/":
                self.emit(f"  {out} = fdiv double {t1}, {t2}")
            varmap[instr.dest] = out
            return

        # --- Comparações ---
        if op in ["<", "<=", ">", ">=", "==", "!="]:
            t1 = self.load_value(instr.arg1, varmap)
            t2 = self.load_value(instr.arg2, varmap)
            out = self.new_temp()
            cmp_op = {
                "<": "olt",
                "<=": "ole",
                ">": "ogt",
                ">=": "oge",
                "==": "oeq",
                "!=": "one"
            }[op]
            self.emit(f"  {out} = fcmp {cmp_op} double {t1}, {t2}")
            varmap[instr.dest] = out
            return

        # --- Negação ---
        if op == "u-":
            t1 = self.load_value(instr.arg1, varmap)
            out = self.new_temp()
            self.emit(f"  {out} = fsub double 0.0, {t1}")
            varmap[instr.dest] = out
            return

        # --- Lógicos ---
        if op == "and":
            t1 = self.load_value(instr.arg1, varmap)
            t2 = self.load_value(instr.arg2, varmap)
            out = self.new_temp()
            self.emit(f"  {out} = and i1 {t1}, {t2}")
            varmap[instr.dest] = out
            return

        if op == "or":
            t1 = self.load_value(instr.arg1, varmap)
            t2 = self.load_value(instr.arg2, varmap)
            out = self.new_temp()
            self.emit(f"  {out} = or i1 {t1}, {t2}")
            varmap[instr.dest] = out
            return

        if op == "not":
            t = self.load_value(instr.arg1, varmap)
            out = self.new_temp()
            self.emit(f"  {out} = xor i1 {t}, true")
            varmap[instr.dest] = out
            return

        # --- Funções ---
        if op == "ARG":
            pass  # você pode implementar stack de args aqui depois

        if op == "CALL":
            out = self.new_temp()
            self.emit(f"  {out} = call double @{instr.arg1}()")
            varmap[instr.dest] = out
            return

        # --- PRINT ---
        if op == "PRINT":
            t = self.load_value(instr.arg1, varmap)
            self.emit(f"  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @fmt, i32 0, i32 0), double {t})")
            return

        # --- LABEL ---
        if op == "LABEL":
            self.emit(f"{instr.dest}:")
            return

        # --- GOTO ---
        if op == "GOTO":
            self.emit(f"  br label %{instr.arg1}")
            return

        # --- IF_FALSE_GOTO ---
        if op == "IF_FALSE_GOTO":
            cond = self.load_value(instr.arg1, varmap)
            self.emit(f"  br i1 {cond}, label %continue_{instr.arg2}, label %{instr.arg2}")
            self.emit(f"continue_{instr.arg2}:")
            return

    # ------------------------------
    def load_value(self, v, varmap):
        if v in varmap:
            return varmap[v]
        return v

    # ------------------------------
    #     GERA FUNÇÃO DO USUÁRIO
    # ------------------------------
    def generate_function(self, fn):
        self.emit(f"define double @{fn.name}() {{")
        self.emit("entry:")

        varmap = {}

        for instr in fn.instructions:
            self.translate(instr, varmap)

        self.emit("  ret double 0.0")
        self.emit("}\n")
