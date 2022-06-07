package Lista2;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class L2E12 {
    public static void main(String[] args) {
        
        /*Scanner teclado = new Scanner(System.in);
        double salario, reajuste, novoSalario;

        System.out.print("Digite o salário: ");
        salario = teclado.nextDouble();

        System.out.print("Digite o valor do reajuste: ");
        reajuste = teclado.nextDouble();

        novoSalario = salario + (salario*reajuste/100);
        System.out.print("O valor do novo salário será de: R$" + novoSalario);

        teclado.close();*/

        double salario, reajuste, novoSalario;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: R$ "));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o reajuste: R$ "));

        novoSalario = salario + (salario * reajuste/100);

        JOptionPane.showMessageDialog(null, "O valor do novo salário será de: R$" + novoSalario);

    }
    
}
