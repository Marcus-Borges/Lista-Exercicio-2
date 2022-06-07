package Lista2;
import java.util.Scanner;

public class L2E15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a,b,c;

        System.out.println("Digite um número inteiro:");
        a=teclado.nextInt();
        System.out.println("Digite mais um número inteiro:");
        b=teclado.nextInt();
        System.out.println("Digite outro número inteiro:");
        c=teclado.nextInt();
        System.out.println("Digite o ultimo número inteiro:");
  
        if ((a<b)&&(a<c)){
            System.out.println(a);
            if(b<c){
            System.out.println(b);
            System.out.println(c);
            }
            else{
            System.out.println(c);
            System.out.println(b);    
            }
        }
        else if ((b<a)&&(b<c)){
        System.out.println(b);
        if(a<c){
            System.out.println(a);
            System.out.println(c);
        }
        else{
            System.out.println(c);
            System.out.println(a);    
        }
    }
    else{
        System.out.println(c);
        if(a<b){
            System.out.println(a);
            System.out.println(b);
        }
        else{
            System.out.println(b);
            System.out.println(a);    
        }
    }

    teclado.close();
    }
}
        
        
        
    
   