package unidade2;

import java.util.Locale;
import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor 1: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o valor 2: ");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        float divisao = (float)numero1 / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.printf("Divisão : %.3f", divisao);

    }
}
