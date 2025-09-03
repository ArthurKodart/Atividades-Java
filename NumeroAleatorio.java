import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100);
        System.out.println(numero);
        for (int i = 0; i < 5; i++) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("digite um numero");
            int chute = leitura.nextInt();
            System.out.println(chute);
           if (chute > numero) {
               System.out.println("o numero é menor");
           }
           if (chute < numero){
               System.out.println("o numero é maior");

           }
           if(chute == numero){
               System.out.println("acertou!!");
               break;
           }
        }

    }
}

