
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int opcion;
            double num1, num2;
            String continuar;
            do {
                System.out.println("\n--- CALCULADORA ---");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");
                System.out.print("Selecciona una opcion: ");
                opcion = teclado.nextInt();
                
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingresa el primer numero: ");
                    num1 = teclado.nextDouble();
                    
                    System.out.print("Ingresa el segundo numero: ");
                    num2 = teclado.nextDouble();
                    
                    switch (opcion) {
                        case 1 -> System.out.println("Resultado: " + (num1 + num2));
                        case 2 -> System.out.println("Resultado: " + (num1 - num2));
                        case 3 -> System.out.println("Resultado: " + (num1 * num2));
                        case 4 -> {
                            if (num2 != 0) {
                                System.out.println("Resultado: " + (num1 / num2));
                            } else {
                                System.out.println("No se puede dividir entre cero.");
                            }
                        }
                    }
                } else {
                    System.out.println("Opcion no valida.");
                }
                
                System.out.print("Deseas continuar? (si/no): ");
                continuar = teclado.next();
                
            } while (continuar.equalsIgnoreCase("si"));
            System.out.println("Calculadora finalizada.");
        }
    }
}
