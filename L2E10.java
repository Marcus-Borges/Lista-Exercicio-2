package Lista2;
import javax.swing.JOptionPane;

public class L2E10 {
    public static void main(String[] args) {
        
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do objeto: "));
        int desconto = Integer.parseInt(JOptionPane.showInputDialog("Valor do desconto: "));
        double precoFinal;

        precoFinal = preco - (preco*desconto)/100;
 
        JOptionPane.showMessageDialog(null, "O preço final do produto é: " + precoFinal);
        
    }
    
}