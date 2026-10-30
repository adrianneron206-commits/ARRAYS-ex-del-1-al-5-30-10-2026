import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int m;

        System.out.println("Introduce el número de columnas:");
        m = teclado.nextInt();

        int[][] numeros = new int[3][m];

        int[][] resultados = new int[3][m];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Introduce un número:");
                numeros[i][j] = teclado.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {

            int suma = 0;
            int mayor = numeros[0][j];
            int menor = numeros[0][j];

            for (int i = 0; i < 3; i++) {

                suma = suma + numeros[i][j];

                if (numeros[i][j] > mayor) {
                    mayor = numeros[i][j];
                }

                if (numeros[i][j] < menor) {
                    menor = numeros[i][j];
                }
            }

            resultados[0][j] = suma;
            resultados[1][j] = mayor;
            resultados[2][j] = menor;
        }

        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + j);
            System.out.println("Suma: " + resultados[0][j]);
            System.out.println("Mayor: " + resultados[1][j]);
            System.out.println("Menor: " + resultados[2][j]);
        }

        teclado.close();
    }
}