package Lista2;
import javax.swing.JOptionPane;

public class L2E17 {
    public static void main(String[] args) {
        
        double C = Double.parseDouble(JOptionPane.showInputDialog("Digitar a temperatura em graus celsius"));
        double F;

        F = C*(9.0/5.0)+32.0;

        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + F);        

    }
    
}
