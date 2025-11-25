# code_generator.py

from codegen.instruction import IRInstruction, IRFunction

class CodeGenerator:
    def __init__(self):
        self.output = []

    def emit(self, line):
        self.output.append(line)

    def generate(self, ir):
        """Recebe o IR (um dict) e gera código final."""
        self.output = []

        # Globais
        for instr in ir["global"]:
            self.emit(self.translate(instr))

        # Funções
        for func_name, func in ir["functions"].items():
            self.emit(f"\n# function {func_name}")
            for instr in func.instructions:
                self.emit(self.translate(instr))

        return "\n".join(self.output)

    # ------------------------
    #  TRADUTOR DE IR → PYTHON
    # ------------------------
    def translate(self, instr: IRInstruction):
        op = instr.op

        if op == "ASSIGN":
            return f"{instr.dest} = {instr.arg1}"

        elif op == "ADD":
            return f"{instr.dest} = {instr.arg1} + {instr.arg2}"

        elif op == "SUB":
            return f"{instr.dest} = {instr.arg1} - {instr.arg2}"

        elif op == "MUL":
            return f"{instr.dest} = {instr.arg1} * {instr.arg2}"

        elif op == "DIV":
            return f"{instr.dest} = {instr.arg1} / {instr.arg2}"

        elif op == "LABEL":
            return f"{instr.dest}:"

        elif op == "GOTO":
            return f"goto {instr.arg1}"

        elif op == "IF_FALSE_GOTO":
            return f"if not {instr.arg1}: goto {instr.arg2}"

        elif op == "RET":
            return f"return {instr.arg1}"

        elif op == "CALL":
            dest = instr.dest or ""
            func = instr.arg1
            num_args = instr.arg2
            return f"{dest} = CALL {func} {num_args}"

        # Caso não reconheça
        return f"# ??? {instr}"
