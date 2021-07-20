package unidade3.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {

    static int totalCarros = 0;

    public static void main(String[] args) {

        Carro carro1 = new Carro(); // 1 objeto carro
        carro1.idCarro = 1;
        carro1.modelo = "gol";
        carro1.placa = "jdk-0001";
        carro1.cor = "azul";
        carro1.ano = 2013;
        carro1.valorDiaria = 99.90f;
        carro1.fabricante = "volkswagen";

        totalCarros = totalCarros + 1; // SisalucarApp.totalCarros = SisalucarApp.totalCarros + 1;

//        Carro carro2 = new Carro(); // 2 objeto carro

        Cliente cliente1 = new Cliente();
        cliente1.idCliente = 1;
        cliente1.cpf = "123456789-90";
        cliente1.nome = "Joanna Matos";
        cliente1.cnh = "xyz00001";

        // Cliente cliente2 = new Cliente();
        SisalucarApp sisalucar = new SisalucarApp();
        sisalucar.realizarLocacao(carro1.idCarro, cliente1.idCliente, carro1.valorDiaria);
        gerarRelatorioLocacao(carro1, LocalDate.now(), LocalDate.now().plusDays(5));
    }


    public void realizarLocacao(long idCarro, long idCliente, float valordiaria) {
        Locacao locacao = new Locacao();
        locacao.idCarro = idCarro;
        locacao.idCliente = idCliente;
        locacao.idLocacao = 1;
        locacao.datainicial = LocalDate.now();
        locacao.datafinal = LocalDate.now().plusDays(2);
        locacao.valorLocacao = valordiaria;
    }

    public static void gerarRelatorioLocacao(Carro carro, LocalDate ...datas) { // exemplo de varargs
        float totalFaturado = carro.valorDiaria;
    }
}
