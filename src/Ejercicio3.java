public class Ejercicio3 {
    public static void main(String[] args) {
        int n = 5;
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == 4 || i == j) {
                    matriz[i][j] = 'X';
                } else {
                    matriz[i][j] = ' '; // Espacio vacío
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }
}