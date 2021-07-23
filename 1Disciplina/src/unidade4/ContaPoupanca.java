package unidade4;

public class ContaPoupanca extends Conta {

    public void atualiza(double taxa) { // exemplo de anulação
        super.saldo = super.saldo + super.saldo * taxa * 3;
    }
}
