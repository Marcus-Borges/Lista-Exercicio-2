package Lista2;
import javax.swing.JOptionPane;

public class L2E8 {
    public static void main(String[] args) {

        double pi = 3.14159265359;
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo: "));
        double area;

        area = pi * (raio * raio);

        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
        
    }
    
}
