
import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double numero, suma = 0, media;
            int contador = 0;
            do {
                System.out.print("Ingresa un numero positivo o negativo para terminar: ");
                numero = teclado.nextDouble();
                
                if (numero > 0) {
                    suma += numero;
                    contador++;
                }
            } while (numero >= 0);
            if (contador > 0) {
                media = suma / contador;
                System.out.println("La media es: " + media);
            } else {
                System.out.println("No ingresaste numeros positivos.");
            }
        }
    }
}

    
