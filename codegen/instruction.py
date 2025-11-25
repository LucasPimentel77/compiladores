# instruction.py

class IRInstruction:
    def __init__(self, op, dest=None, arg1=None, arg2=None):
        self.op = op
        self.dest = dest
        self.arg1 = arg1
        self.arg2 = arg2

    def __repr__(self):
        return f"IR({self.op!r}, {self.dest!r}, {self.arg1!r}, {self.arg2!r})"


class IRFunction:
    def __init__(self, name, params):
        self.name = name
        self.params = params
        self.instructions = []

    def emit(self, instr: IRInstruction):
        self.instructions.append(instr)
    