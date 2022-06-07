package Lista2;
import javax.swing.JOptionPane;

public class L2E26 {
    public static void main(String[] args) {
        
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

    }
    
}
