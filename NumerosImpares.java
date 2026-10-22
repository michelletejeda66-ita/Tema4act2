
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int numero, i = 1;
            System.out.print("Ingresa un numero entero positivo: ");
            numero = teclado.nextInt();
            if (numero > 0) {
                do {
                    System.out.println(i);
                    i += 2;
                } while (i <= numero);
            } else {
                System.out.println("El numero debe ser positivo.");
            }
        }
    }
}

