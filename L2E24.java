package Lista2;
import javax.swing.JOptionPane;

public class L2E24 {
    public static void main(String[] args){
        int tabuada = 0;
        tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
       
        if ((tabuada >= 1) && (tabuada <= 20)) {
            for(int i = 1; i <= 10; i++)
            {
                int resulto = i * tabuada;
                System.out.println(i + " x " + tabuada + " = " + resulto);
            }
        }
    }
}