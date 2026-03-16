package matrices;

import java.util.Random;
import java.util.Arrays;

public class MatrizMxNTranspuestaAleatoria {
    private int[][] matriz;
    private Random random = new Random();

    public void generarMatriz(int filas, int columnas) {
        matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public void mostrarMatriz() {
        System.out.println("Matriz original:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }

    public void mostrarTranspuesta() {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz transpuesta:");
        for (int[] fila : transpuesta) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }

}
