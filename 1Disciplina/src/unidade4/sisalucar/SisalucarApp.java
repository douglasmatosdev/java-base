package unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {

    static int totalCarros = 0;

    public static void main(String[] args) {

        Carro carro1 = new Carro(); // 1 objeto carro
        carro1.setIdCarro(1);
        carro1.setModelo("gol");
        carro1.setPlaca("jdk-0001");
        carro1.setCor("azul");
        carro1.setAno(2013);
        carro1.setValorDiaria(99.90f);
        carro1.setFabricante("volkswagen");

        totalCarros = totalCarros + 1; // SisalucarApp.totalCarros = SisalucarApp.totalCarros + 1;

//        Carro carro2 = new Carro(); // 2 objeto carro

        Cliente cliente1 = new Cliente();
        cliente1.setIdCliente(1);
        cliente1.setCpf("123456789-90");
        cliente1.setNome("Joanna Matos");
        cliente1.setCnh("xyz00001");

        // Cliente cliente2 = new Cliente();
        SisalucarApp sisalucar = new SisalucarApp();
        sisalucar.realizarLocacao(carro1.getIdCarro(),
                cliente1.getIdCliente(),
                carro1.getValorDiaria());
        gerarRelatorioLocacao(carro1, LocalDate.now(), LocalDate.now().plusDays(5));
    }


    public void realizarLocacao(long idCarro, long idCliente, float valordiaria) {
        Locacao locacao = new Locacao();
        locacao.setIdCarro(idCarro);
        locacao.setIdCliente(idCliente);
        locacao.setIdLocacao(1);
        locacao.setDatainicial(LocalDate.now());
        locacao.setDatafinal(LocalDate.now().plusDays(2));
        locacao.setValorLocacao(valordiaria);
    }

    public static void gerarRelatorioLocacao(Carro carro, LocalDate ...datas) { // exemplo de varargs
        float totalFaturado = carro.getValorDiaria();
    }
}
