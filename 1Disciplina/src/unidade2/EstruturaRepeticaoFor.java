package unidade2;

public class EstruturaRepeticaoFor {

    public static void main(String[] args) {

        for(int x = 0; x < 10; x++) {
            System.out.println("X = " + x);
        }

        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int y: vetor) {
            System.out.println("Y = " + y);
        }
    }
}
