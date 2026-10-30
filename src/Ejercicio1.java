import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, m;

        System.out.println("Introduce el número de filas:");
        n = teclado.nextInt();

        System.out.println("Introduce el número de columnas:");
        m = teclado.nextInt();

        int[][] numeros = new int[n][m];

        int[] sumaColumnas = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Introduce un número:");
                numeros[i][j] = teclado.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                sumaColumnas[j] = sumaColumnas[j] + numeros[i][j];
            }
        }

        for (int j = 0; j < m; j++) {
            System.out.println("Suma de la columna " + j + ": " + sumaColumnas[j]);
        }

        teclado.close();
    }
}