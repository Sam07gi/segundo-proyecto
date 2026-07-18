package arreglos_y_matrices;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;
public class Ejercicio3 {
       
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número de la posición " + i + ": ");
            numeros[i] = teclado.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicionMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posicionMenor = i;
            }
        }

        System.out.println("Mayor: " + mayor + " en la posición " + posicionMayor);
        System.out.println("Menor: " + menor + " en la posición " + posicionMenor);
        teclado.close();
    }
}
