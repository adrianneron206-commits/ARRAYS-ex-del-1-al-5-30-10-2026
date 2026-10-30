void main() {
    public class MatrizFiguraX {
        public static void main(String[] args) {
            int n = 5;
            char[][] matriz = new char[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Si está en la diagonal principal o en la secundaria, coloca 'X'
                    if (i == j || i + j == n - 1) {
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
}