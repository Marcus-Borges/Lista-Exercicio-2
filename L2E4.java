package Lista2;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class L2E4 {
    public static void main(String[] args) {

        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = teclado.nextDouble();
        System.out.print("Digite seu sexo (m) ou (f): ");
        
        teclado.nextLine();
        String sexo = teclado.next();

        double Peso;*/

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
        String sexo = " ";
        JOptionPane.showInputDialog("Digite seu sexo (m) ou (f): ");
        double Peso;

        if (sexo.equals("m") || sexo.equals("")) {
            Peso = (72.7*altura) - 58;
        }
        else {
            Peso = (62.1*altura) - 44.7;
        }

        System.out.println("A seu peso ideal é " + String.format("%.2f", Peso));

        //teclado.close();
    }
}