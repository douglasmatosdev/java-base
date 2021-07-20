package unidade3;

public class Conta {

    // atributos
    int numero;
    double saldo;
    double limite;
    String nome;

    public boolean sacar(double valor) {
        return false;
    }

    public void depositar(double valor) {

    }

    public void tranferir(Conta destino, double valor) {

    }

    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.tranferir(conta2, 50);
    }
}

