package unidade2;

import java.util.Locale;
import java.util.Scanner;

public class Operadores2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor 1: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o valor 2: ");
        int numero2 = sc.nextInt();

        System.out.println("O valor 1 é maior que o valor 2: " + (numero1 > numero2));
        System.out.println("O valor 1 é igual ao valor 2: " + (numero1 == numero2));
        System.out.println("O valor 1 é menor que o valor 2: " + (numero1 < numero2));

    }
}
