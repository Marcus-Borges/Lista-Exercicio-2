package Lista2;
import javax.swing.JOptionPane;

public class L2E18 {
    public static void main(String[] args) {
        
        double BRL = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em real: R$"));
        double USD;
        double variacao = 0.181428;

        USD = BRL * variacao;

        JOptionPane.showMessageDialog(null, "R$ " + BRL + " corresponde a " + USD + " Dólares");

    }
    
}
