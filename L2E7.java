package Lista2;
import javax.swing.JOptionPane;

public class L2E7 {
    public static void main(String[] args) {
        
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        int area;

        area = (base * altura)/2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
    
}
