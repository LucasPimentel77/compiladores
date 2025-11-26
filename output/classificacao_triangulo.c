#include <stdio.h>
#include <stdlib.h>

double lados_validos(double a, double b, double c)
{
    if (a <= 0 || b <= 0 || c <= 0)
    {
        return 0;
    }
    if (a + b <= c || a + c <= b || b + c <= a)
    {
        return 0;
    }
    return 1;
}

double classificar_triangulo(double a, double b, double c)
{
    printf("%s", "\"Entrada:\"");
    printf("%g", a);
    printf("%s", "\",\"");
    printf("%g", b);
    printf("%s", "\",\"");
    printf("%g", c);
    printf("%s", "\" \u2192\"");
    printf("\n");
    if (!(lados_validos(a, b, c)))
    {
        printf("%s", "\"Medidas inv\u00e1lidas\"");
        printf("\n");
        return 0;
    }
    if (a == b && b == c)
    {
        printf("%s", "\"Tri\u00e2ngulo equil\u00e1tero v\u00e1lido\"");
        printf("\n");
    }
    else if (a == b || a == c || b == c)
    {
        printf("%s", "\"Tri\u00e2ngulo is\u00f3sceles v\u00e1lido\"");
        printf("\n");
    }
    else
    {
        printf("%s", "\"Tri\u00e2ngulo escaleno v\u00e1lido\"");
        printf("\n");
    }
}


int main(void) {
    classificar_triangulo(3.0, 4.0, 5.0);
    classificar_triangulo(5.0, 3.0, 4.0);
    classificar_triangulo(2.0, 2.0, 2.0);
    classificar_triangulo(2.0, 2.0, 3.0);
    classificar_triangulo(1.0, 1.0, 3.0);
    classificar_triangulo(0.0, 5.0, 5.0);
    classificar_triangulo(-(1.0), 2.0, 2.0);
    return 0;
}