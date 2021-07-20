package unidade2;

import java.util.Locale;
import java.util.Scanner;

/*
*
* Escreva um programa para gerar a seguinte série abaixo para os 50 primeiros termos.
*
*        x(1)   x(2)   x(3)   x(4)   x(5)
* e(x) = ____ + ____ + ____ + ____ + ____ + ...
*         1      2      3      4      5
*
*
* */

public class AplicacaoExpoente {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in).useLocale(Locale.US);

        double e = 0;

        System.out.println("Digite o valor de X");
        double x = sc.nextDouble();

        for(int y = 1; y <= 50; y++)
            e = e + Math.pow(x, y) / y;

        System.out.printf("O valor e(x)=%.2f", e);
    }
}
