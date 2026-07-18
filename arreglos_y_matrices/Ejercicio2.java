package arreglos_y_matrices;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;
public class Ejercicio2 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
            suma = suma + numeros[i];
        }

        double promedio = suma / numeros.length;
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        teclado.close();
    }   
}
