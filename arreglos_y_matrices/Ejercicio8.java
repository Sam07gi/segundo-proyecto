package arreglos_y_matrices;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }
        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonal);
        teclado.close();
    }
}
