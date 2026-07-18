package arreglos_y_matrices;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;
public class Ejercicio4 {
     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantidadPares = 0, cantidadImpares = 0;
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();

            if (numeros[i] % 2 == 0) {
                cantidadPares++;
                sumaPares = sumaPares + numeros[i];
            } else {
                cantidadImpares++;
                sumaImpares = sumaImpares + numeros[i];
            }
        }

        System.out.println("Cantidad de pares: " + cantidadPares);
        System.out.println("Cantidad de impares: " + cantidadImpares);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        teclado.close();
    }
}
