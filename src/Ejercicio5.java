void main() {
    import java.util.Scanner;

    public class GestionNotasAlumnos {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numAlumnos = 20;

            double[][] matriz = new double[numAlumnos][6];

            double mejorNotaCurso = Double.MIN_VALUE;
            double peorNotaCurso = Double.MAX_VALUE;

            System.out.println("=== INGRESO DE NOTAS DE LOS ALUMNOS ===");
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println("\nAlumno " + (i + 1) + ":");
                for (int j = 0; j < 3; j++) {
                    System.out.print("  Ingrese la nota parcial " + (j + 1) + ": ");
                    matriz[i][j] = scanner.nextDouble();
                }
            }
            for (int i = 0; i < numAlumnos; i++) {
                double suma = 0;
                double maxAlumno = matriz[i][0];
                double minAlumno = matriz[i][0];

                for (int j = 0; j < 3; j++) {
                    double notaActual = matriz[i][j];
                    suma += notaActual;

                    if (notaActual > maxAlumno) {
                        maxAlumno = notaActual;
                    }
                    if (notaActual < minAlumno) {
                        minAlumno = notaActual;
                    }
                }

                matriz[i][3] = suma / 3.0; // Promedio
                matriz[i][4] = maxAlumno;  // Nota más alta
                matriz[i][5] = minAlumno;  // Nota más baja

                if (maxAlumno > mejorNotaCurso) {
                    mejorNotaCurso = maxAlumno;
                }
                if (minAlumno < peorNotaCurso) {
                    peorNotaCurso = minAlumno;
                }
            }

            System.out.println("\n==========================================================================");
            System.out.println("                         MATRIZ RESULTANTE");
            System.out.println("==========================================================================");
            System.out.printf("%-10s %-8s %-8s %-8s %-10s %-10s %-10s\n",
                    "Alumno", "Nota 1", "Nota 2", "Nota 3", "Promedio", "Máxima", "Mínima");
            System.out.println("--------------------------------------------------------------------------");

            for (int i = 0; i < numAlumnos; i++) {
                System.out.printf("Alumno %-3d ", (i + 1));
                for (int j = 0; j < 6; j++) {
                    System.out.printf("%-8.2f ", matriz[i][j]);
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------------------------------------");

            System.out.println("\n=== RESUMEN GENERAL DEL CURSO ===");
            System.out.printf("Mejor nota del curso: %.2f\n", mejorNotaCurso);
            System.out.printf("Peor nota del curso:  %.2f\n", peorNotaCurso);

            scanner.close();
        }
    }
}