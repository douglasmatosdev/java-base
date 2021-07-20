package unidade2;

import java.util.Locale;
import java.util.Scanner;

/*
*   Escreva um programa para gerar os 20 primeiros termos da série de
* Fibonacci, sendo que F(n) = F(n-1) + F(n-2) e F(1) = F(2) = 1.
* Também calule a sua média.
*
* */

public class AplicacaoFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int anterior1 = 1;
        int anterior2 = 1;
        int calculado = anterior1 + anterior2;
        int soma = anterior1 + anterior2 + calculado;

        System.out.print(anterior1 + ", " + anterior2 + ", " + calculado);

        for (int i = 4; i <= 20; i++) {
            anterior1 = anterior2;
            anterior2 = calculado;
            calculado = anterior1 + anterior2;
            soma = soma + calculado;

            System.out.print(calculado + ", ");
        }

        double media = soma / 20;

        System.out.println("Média = " + media);

    }
}
