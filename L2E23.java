package Lista2;
import java.util.Scanner;

public class L2E23 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o tamanho do quadrado: ");
        int quad = teclado.nextInt();

        if (quad <= 20) {
            for (int i = 0; i < quad; i++) {
                for (int j = 0; j < quad; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Tamanho não suportado.");
        }
        teclado.close();
    }
}
   