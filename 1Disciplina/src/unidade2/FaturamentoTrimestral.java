package unidade2;

import javax.swing.*;

public class FaturamentoTrimestral {

    public static void main(String[] args) {

        int vendas_janeiro = 15_000;
        int vendas_fevereiro = 23_000;
        int vendas_março = 17_000;

        int faturamento_trimestral = vendas_janeiro + vendas_fevereiro + vendas_março;

        JOptionPane.showMessageDialog(null, "O faturamento trimestral foi de : R$ " + faturamento_trimestral);
    }
}
