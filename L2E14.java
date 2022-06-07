package Lista2;
import javax.swing.JOptionPane;

public class L2E14 {
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        if (num1 > num2){
            JOptionPane.showMessageDialog(null, "O número maior é: " + num1);
        }            
        else {
            JOptionPane.showMessageDialog(null, "O número maior é: " + num2);
        }
            
    }
}