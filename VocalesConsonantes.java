
import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            String entrada;
            char letra;
            
            while (true) {
                System.out.print("Ingresa una letra o un espacio para salir: ");
                entrada = teclado.nextLine();
                
                if (entrada.equals(" ")) {
                    break;
                }
                
                if (entrada.isEmpty()) {
                    System.out.println("No ingresaste ninguna letra.");
                    continue;
                }
                
                letra = Character.toLowerCase(entrada.charAt(0));
                
                if (!Character.isLetter(letra)) {
                    System.out.println("Ingresa una letra valida.");
                } else if ("aeiouáéíóú".indexOf(letra) >= 0) {
                    System.out.println("Es una vocal.");
                } else {
                    System.out.println("Es una consonante.");
                }
            }
            
            System.out.println("Programa terminado.");
        }
    }
}

    

