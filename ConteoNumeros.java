
import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int cantidad, numero;
            int positivos = 0, negativos = 0, ceros = 0;
            System.out.print("Cuantos numeros ingresaras? ");
            cantidad = teclado.nextInt();
            if (cantidad > 0) {
                for (int i = 1; i <= cantidad; i++) {
                    System.out.print("Ingresa el numero " + i + ": ");
                    numero = teclado.nextInt();
                    
                    if (numero > 0) {
                        positivos++;
                    } else if (numero < 0) {
                        negativos++;
                    } else {
                        ceros++;
                    }
                }
                
                System.out.println("Positivos: " + positivos);
                System.out.println("Negativos: " + negativos);
                System.out.println("Ceros: " + ceros);
            } else {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        }
    }
}

    

