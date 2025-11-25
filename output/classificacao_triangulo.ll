; LLVM IR gerado pelo compilador PyLike
declare i32 @printf(i8*, ...)
@fmt = constant [4 x i8] c"%f\0A\00"

define double @lados_validos() {
entry:
  %t1 = fcmp ole double a, 0
  %t2 = fcmp ole double b, 0
  %t3 = or i1 %t1, %t2
  %t4 = fcmp ole double c, 0
  %t5 = or i1 %t3, %t4
  br i1 None, label %continue_L1, label %L1
continue_L1:
  br label %L0
L1:
L0:
  %t6 = fadd double a, b
  %t7 = fcmp ole double %t6, c
  %t8 = fadd double a, c
  %t9 = fcmp ole double %t8, b
  %t10 = or i1 %t7, %t9
  %t11 = fadd double b, c
  %t12 = fcmp ole double %t11, a
  %t13 = or i1 %t10, %t12
  br i1 None, label %continue_L3, label %L3
continue_L3:
  br label %L2
L3:
L2:
  ret double 0.0
}

define double @classificar_triangulo() {
entry:
  %t14 = fadd double "Entrada: ", a
  %t15 = fadd double %t14, ", "
  %t16 = fadd double %t15, b
  %t17 = fadd double %t16, ", "
  %t18 = fadd double %t17, c
  %t19 = fadd double %t18, " →"
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @fmt, i32 0, i32 0), double %t19)
  %t20 = call double @lados_validos()
  %t21 = xor i1 %t20, true
  br i1 None, label %continue_L5, label %L5
continue_L5:
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @fmt, i32 0, i32 0), double "Medidas inválidas")
  br label %L4
L5:
L4:
  %t22 = fcmp oeq double a, b
  %t23 = fcmp oeq double b, c
  %t24 = and i1 %t22, %t23
  br i1 None, label %continue_L7, label %L7
continue_L7:
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @fmt, i32 0, i32 0), double "Triângulo equilátero válido")
  br label %L6
L7:
  %t25 = fcmp oeq double a, b
  %t26 = fcmp oeq double a, c
  %t27 = or i1 %t25, %t26
  %t28 = fcmp oeq double b, c
  %t29 = or i1 %t27, %t28
  br i1 None, label %continue_L8, label %L8
continue_L8:
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @fmt, i32 0, i32 0), double "Triângulo isósceles válido")
  br label %L6
L8:
  call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @fmt, i32 0, i32 0), double "Triângulo escaleno válido")
L6:
  ret double 0.0
}

define i32 @main() {
entry:
  %t30 = call double @classificar_triangulo()
  %t31 = call double @classificar_triangulo()
  %t32 = call double @classificar_triangulo()
  %t33 = call double @classificar_triangulo()
  %t34 = call double @classificar_triangulo()
  %t35 = call double @classificar_triangulo()
  %t36 = fsub double 0.0, 1.0
  %t37 = call double @classificar_triangulo()
  ret i32 0
}