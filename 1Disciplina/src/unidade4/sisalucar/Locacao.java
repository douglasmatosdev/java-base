package unidade4.sisalucar;

import java.time.LocalDate;

public class Locacao {

    private long idLocacao;
    private long idCliente;
    private long idCarro;
    private float valorLocacao;
    private LocalDate datainicial;
    private LocalDate datafinal;

    public long getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(long idLocacao) {
        this.idLocacao = idLocacao;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(long idCarro) {
        this.idCarro = idCarro;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public LocalDate getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(LocalDate datainicial) {
        this.datainicial = datainicial;
    }

    public LocalDate getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(LocalDate datafinal) {
        this.datafinal = datafinal;
    }

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
