package unidade4.sisalucar;

public enum Revendedor {

    ABCVEICULOS("101010/0001", "Rua das Perdizes, 1500", "volkswagen"),
    SIMAOVEICULOS("020202/0002", "Av. Morumbi, 2500", "Honda"),
    EMANUELVEICULOS("111111/0003", "A. das Nações, 100", "Toyota");

    String cnpj;
    String endereco;
    String fabricante;

    private Revendedor(String cnpj, String endereco, String fabricante) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.fabricante = fabricante;
    }
}
