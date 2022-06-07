package Lista2;
import javax.swing.JOptionPane;

public class L2E3 {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if((num%2)== 0){
                JOptionPane.showMessageDialog(null,"O número é par");
            } else {JOptionPane.showMessageDialog(null,"o número é impar");}
    }
    
}
