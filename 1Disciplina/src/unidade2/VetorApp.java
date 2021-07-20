package unidade2;

public class VetorApp {

    public static void main(String[] args) {


        // vetor de tipos primitivos

        // Fibonacci
        int fibonnaci[] = new int[20];

        fibonnaci[0] = 1;
        fibonnaci[1] = fibonnaci[0];
        fibonnaci[2] = fibonnaci[0] + fibonnaci[1];

        for(int i = 3; i < 20 ; i++)
            fibonnaci[i] = fibonnaci[i - 1] + fibonnaci[i - 2];

        for(int f: fibonnaci)
            System.out.print(f + ", ");

        System.out.println("\n_______________________________________________");

        // Vetor de objetos
        String vetor[] = new String[10];

        vetor[0] = new String("Antônio");
        vetor[1]= new String("Pedro");

        for(String v: vetor)
            System.out.println(v);

        System.out.println("\n_______________________________________________");

        // Matriz

        int matriz[][] = new int[3][3];

        matriz[0][0] = 100;

        for (int[] m: matriz)
            for(int m2: m)
                System.out.println(m2);
    }
}
