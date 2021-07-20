package unidade2;

/*
*  Escrever uma classe Java para calcular o fatorial de um dado número N.
* */

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int valor = sc.nextInt();
        int storeValor = valor;
        int total = 0;
        int fatorial[] = new int[storeValor];


        for (int i = 0; i < storeValor; ++i) {
            fatorial[i] = valor--;
        }

        // Mostrando o resultado
        System.out.print(storeValor + "! = ");
        for (int f: fatorial) {
            total = total + f;

            System.out.print(f);
            if (f != 1)
                System.out.print(" x ");
        }

        System.out.println("\n" + storeValor + "! = " + total);
    }
}
