package Lista2;
import javax.swing.JOptionPane;

public class L2E9 {
    public static void main(String [] args){

        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite o número: "));
        System.out.println("O quadrado é: " + (num*num) + " o cubo é: " + (num*num*num) +" e a raiz quadrada é: " + Math.sqrt(num));
        
    }
    
}