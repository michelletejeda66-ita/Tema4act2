
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int numero;
            long factorial = 1;
            
            System.out.print("Ingresa un numero entre 0 y 20: ");
            numero = teclado.nextInt();
            
            if (numero >= 0 && numero <= 20) {
                for (int i = 1; i <= numero; i++) {
                    factorial = factorial * i;
                }
                System.out.println("El factorial es: " + factorial);
            } else {
                System.out.println("Ingresa un numero entre 0 y 20.");
            }
        }
    }
}
