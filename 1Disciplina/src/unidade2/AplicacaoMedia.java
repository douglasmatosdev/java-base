package unidade2;

import java.util.Locale;
import java.util.Scanner;

/*
*  Escreva um programa para calcular a média aritmética, maior e menor
*  valores de um conjunto de valores inteiros.
*
*  - Observação: considere o valor (-1) como finalizador.
*
* */

public class AplicacaoMedia {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um valor: ");

        int valor = sc.nextInt();
        int maior, menor;
        menor = maior = valor;
        double media = 0, soma = 0;
        int numeros = 0;

        while (valor != -1) {
            soma = soma + valor;
            numeros++;

            if (valor > maior) {
                maior = valor;

            } else if (valor < menor) {
                menor = valor;
            }

            System.out.println("Digite um valor: ");
            valor = sc.nextInt();
        }

        media = soma / numeros;

        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        System.out.printf("A Média é : %.2f", media);
    }
}
