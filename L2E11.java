package Lista2;
import javax.swing.JOptionPane;

public class L2E11 {
    public static void main(String[] args) {
        
        int salarioBase = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário base: "));
        double gratificacao;
        double imposto;
        double salarioFinal;

        gratificacao = salarioBase * 0.05;
        //System.out.println(gratificacao);
        imposto = salarioBase * 0.07;
        //System.out.println(imposto);
        salarioFinal = salarioBase + gratificacao - imposto;

        JOptionPane.showMessageDialog(null, "O salário final do funcionário é: R$ "+ salarioFinal);

    }
    
}
