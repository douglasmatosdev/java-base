package unidade2;

/*
* Construa uma matriz identidade I = 3(apenas os valores diagonais são = 1).
* Todos os outros são 0(zero).
*      _____________
*      | 1 | 0 | 0 |
* I =  | 0 | 1 | 0 |
*      | 0 | 0 | 1 |
*      -------------
*
* */

public class MatrizIdentidade {

    public static void main(String[] args) {

        int matriz[][] = new int[3][3];

        for (int x = 0; x <= 2; x++)
            for (int y = 0; y <= 2; y++) {

                if (x != y)
                    matriz[x][y] = 0;
                else
                    matriz[x][y] = 1;
            }

        for(int x = 0; x <= 2; x ++) {
            System.out.print("| ");

            for(int y = 0; y <= 2; y++) {
                System.out.print(matriz[x][y]);

                System.out.print(" | ");
            }

            System.out.println("");
        }
    }
}
