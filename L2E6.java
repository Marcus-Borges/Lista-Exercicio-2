package Lista2;
import javax.swing.JOptionPane;

public class L2E6 {
    
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        int soma;

        soma = (n1 + n2 + n3)/3;

        JOptionPane.showMessageDialog(null, "A média aritimética é igual a: " + soma);
    }
}
