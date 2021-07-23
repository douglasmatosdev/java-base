package unidade4;
/*
*  Polimorfismo
* */
public abstract class Funcionario {

    public abstract void getBonificacao();

    void verificarFuncionario(Funcionario objeto) {

        if(objeto instanceof Diretor)
            System.out.println("Diretor");
        else if(objeto instanceof  Professor)
            System.out.println("Professor");
        else
            System.out.println("Adiministrativo");
    }

    public static void main(String[] args) {

        Funcionario jose = new Funcionario() {
            @Override
            public void getBonificacao() {

            }
        };
        Funcionario antonio = new Professor();
        Funcionario andrea = new Adiministrativo();
        Funcionario pedro = new Diretor();
        jose.verificarFuncionario(jose);
        antonio.verificarFuncionario(antonio);
        andrea.verificarFuncionario(andrea);
        pedro.verificarFuncionario(pedro);

        Funcionario objeto;
        objeto = new Diretor();
        ((Diretor)objeto).departamento = "RH"; // casting


        // Referencia interface recebendo referencia de um objeto
        Professor prof = new Professor();

        Autenticavel aut = prof;

        Cidadao cidad0 = prof;

        Contribuinte contribuinte = prof;
    }

}
