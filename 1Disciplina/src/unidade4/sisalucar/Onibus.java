package unidade4.sisalucar;

public class Onibus extends Veiculo {
    public int getPassageiros() { // exemplo de anulação
        return 40;
    }

    public void acelera(int limitVelocidade) { // exemplo de sobrecarga
        System.out.println("Obedeça os limite de veloidade que é: " + limitVelocidade);
    }
}
