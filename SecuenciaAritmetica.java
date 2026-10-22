
import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int primero, diferencia, maximo, numero;
            System.out.print("Ingresa el primer numero: ");
            primero = teclado.nextInt();
            System.out.print("Ingresa la diferencia: ");
            diferencia = teclado.nextInt();
            System.out.print("Ingresa el numero maximo: ");
            maximo = teclado.nextInt();
            numero = primero;
            if (diferencia > 0 && primero <= maximo) {
                do {
                    System.out.println(numero);
                    numero += diferencia;
                } while (numero <= maximo);
            } else {
                System.out.println("Verifica los datos ingresados.");
            }
        }
    }
}
