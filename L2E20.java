package Lista2;
import javax.swing.JOptionPane;

public class L2E20 {

    public static void main(String[] args) {
         
        //declarando a variavel
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
        //ler um numero entre 1 e 7
        //exibir o texto do dia correspondente
        //1 - domingo / 2 - segunda / ... / 7 - sabado
         
            switch(numero){
                case 1: JOptionPane.showMessageDialog(null, "Domingo");
                        break;
                case 2: JOptionPane.showMessageDialog(null, "Segunda-Feira");
                        break;
                case 3: JOptionPane.showMessageDialog(null, "Terça-Feira");
                        break;
                case 4: JOptionPane.showMessageDialog(null, "Quarta-Feira");
                        break;
                case 5: JOptionPane.showMessageDialog(null, "Quinta-Feira");
                        break;
                case 6: JOptionPane.showMessageDialog(null, "Sexta-Feira");
                        break;
                case 7: JOptionPane.showMessageDialog(null, "Sábado");
                        break;
                default: 
                        JOptionPane.showMessageDialog(null, "Numero digitado não corresponde a nenhum dia da semana.");
            }                
    }
}
