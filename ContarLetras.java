
import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            String palabra;
            int contador = 0;
            
            System.out.print("Ingresa una palabra: ");
            palabra = teclado.nextLine();
            
            for (int i = 0; i < palabra.length(); i++) {
                char letra = Character.toLowerCase(palabra.charAt(i));
                
                if (letra == 'a' || letra == 'á') {
                    contador++;
                }
            }
            
            System.out.println("Cantidad de letras a: " + contador);
        }
    }
}

    

