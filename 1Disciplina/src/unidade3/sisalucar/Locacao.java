package unidade3.sisalucar;

import java.time.LocalDate;

public class Locacao {

    long idLocacao;
    long idCliente;
    long idCarro;
    float valorLocacao;
    LocalDate datainicial;
    LocalDate datafinal;

    public Locacao(long idLocacao, long idCliente, long idCarro, float valorLocacao, LocalDate datainicial, LocalDate datafinal) {
        super();
        this.idLocacao = idLocacao;
        this.idCliente = idCliente;
        this.idCarro = idCarro;
        this.valorLocacao = valorLocacao;
        this.datainicial = datainicial;
        this.datafinal = datafinal;
    }

    public Locacao() {}
}
