package unidade2;

import javax.swing.*;

public class CalculoFaturamentoTrimestral {

    public static void main(String[] args) {

        double faturamento_janeiro;
        double faturamento_fevereiro;
        double faturamento_marco;

        faturamento_janeiro = Double.parseDouble(JOptionPane.showInputDialog("Informe o faturamento de janeiro."));
        faturamento_fevereiro = Double.parseDouble(JOptionPane.showInputDialog("Informe o faturamento de fevereiro."));
        faturamento_marco = Double.parseDouble(JOptionPane.showInputDialog("Informe o faturamento de março."));

        double faturamento_trimestral = faturamento_janeiro + faturamento_fevereiro + faturamento_marco;

        JOptionPane.showMessageDialog(null, "O faturamento trimestral foi de : R$ " + faturamento_trimestral);
    }
}
