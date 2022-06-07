package Lista2;
import java.util.Scanner;

public class L2E13 {
    public static void main(String[] args) { 
        
        Scanner teclado = new Scanner(System.in);
        int trlab, avsem, exfinal, notaFinal;

        System.out.print("Digite a nota do trabalho: ");
        trlab = teclado.nextInt();

        System.out.print("Digite a nota do avaliação: ");
        avsem = teclado.nextInt();

        System.out.print("Digite a nota da exame final: ");
        exfinal = teclado.nextInt();

        notaFinal = (trlab * 2 + avsem * 3 + exfinal * 5)/3;
        System.out.println("A nota final é: "+ notaFinal);

        if(notaFinal > 70){
             System.out.println(" Passou ");
        }
        else if(notaFinal > 40){
            System.out.println(" Prova alternativa ");
        }
        else{
            System.out.println(" Não passou ");

        
        }
        
        teclado.close();
    }  
}
