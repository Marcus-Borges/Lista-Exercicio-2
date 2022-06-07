package Lista2;
import javax.swing.JOptionPane;

//import java.util.Scanner;

public class L2E21 {
    public static void main(String[] args) {
            
        //Scanner teclado = new Scanner(System.in);
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano para saber se é bissexto"));
        
        //System.out.println("Digite um ano para saber se é bissexto");
        //ano = teclado.nextInt();
        
        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println(ano + " é bissexto.");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissexto.");
        } else{
            System.out.println(ano + " não é bissexto");
        }

        //teclado.close();
    }
}
