package arreglos_y_matrices;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;
public class Ejercicio5 {
     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[12];
        int valor;

        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Ingrese un número positivo para la posición " + i + ": ");
                valor = teclado.nextInt();
                if (valor <= 0) {
                    System.out.println("El número debe ser positivo.");
                }
            } while (valor <= 0);
            numeros[i] = valor + i;
        }

        System.out.println("Arreglo modificado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        teclado.close();
    }
}
