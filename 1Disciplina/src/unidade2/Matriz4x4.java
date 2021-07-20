package unidade2;

/*
*  Escreva uma classe Java para criar uma matriz 4x4 de números inteiros.
*  Em seguida, inicialize esta matriz i informe todos os elementos presentes
*   e quantas vezes o memso aparece na matriz.
*
* */

public class Matriz4x4 {

    public static void main(String[] args) {

        int matriz[][] = new int[4][4];

        for (int x = 0; x <= 3; x++) {
            for(int y = 0; y <= 3; y++) {

                matriz[x][y] = x +y;
            }
        }

        for (int x = 0; x <= 3; x++) {
            for(int y = 0; y <= 3; y++) {

                System.out.print(matriz[x][y]);

            }
            System.out.println("");
        }
    }
}
