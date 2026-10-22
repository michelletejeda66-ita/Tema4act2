
import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            long numero;
            int contador = 0;
            
            System.out.print("Ingresa un numero entero: ");
            numero = teclado.nextLong();
            
            do {
                contador++;
                numero = numero / 10;
            } while (numero != 0);
            
            System.out.println("Cantidad de digitos: " + contador);
        }
    }
}

    

