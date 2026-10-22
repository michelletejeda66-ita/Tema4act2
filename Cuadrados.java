
import java.util.Scanner;

public class Cuadrados {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int numero, i = 1;
            System.out.print("Ingresa un numero entero positivo: ");
            numero = teclado.nextInt();
            if (numero > 0) {
                do {
                    System.out.println(i + " al cuadrado = " + (i * i));
                    i++;
                } while (i <= numero);
            } else {
                System.out.println("El numero debe ser positivo.");
            }
        }
    }
}

