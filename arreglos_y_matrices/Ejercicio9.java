package arreglos_y_matrices;

/**
 *
 * @author Samantha Paulette Jimenez Aguilar
 */
import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) mayor = matriz[i][j];
                if (matriz[i][j] < menor) menor = matriz[i][j];
            }
        }

        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
        teclado.close();
    }
}
