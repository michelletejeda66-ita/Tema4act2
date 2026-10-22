
import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Random aleatorio = new Random();
            
            int secreto = aleatorio.nextInt(100) + 1;
            int intento;
            
            do {
                System.out.print("Adivina el numero del 1 al 100: ");
                intento = teclado.nextInt();
                
                if (intento > secreto) {
                    System.out.println("Demasiado alto.");
                } else if (intento < secreto) {
                    System.out.println("Demasiado bajo.");
                } else {
                    System.out.println("Felicidades, adivinaste!");
                }
            } while (intento != secreto);
        }
    }
}

