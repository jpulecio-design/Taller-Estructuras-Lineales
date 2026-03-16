package matrices;

import java.util.Random;
import java.util.Arrays;

public class MatrizNxNAleatoriaSimetricaEsquina {
    private int[][] matriz;
    private Random random = new Random();

    public void generarMatriz(int n) {
        matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int valor = random.nextInt(100) + 1;
                matriz[i][j] = valor;
                matriz[j][i] = valor;
            }
        }
    }

    public void mostrarMatriz() {
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }

    public void esSimetrica() {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    System.out.println("La matriz no es simetrica");
                    return;
                }
            }
        }
        System.out.println("La matriz es simetrica");
    }

    public void mostrarEsquinas() {
        int n = matriz.length;
        System.out.println("Esquinas:");
        System.out.println("Superior izquierda: " + matriz[0][0]);
        System.out.println("Superior derecha:   " + matriz[0][n - 1]);
        System.out.println("Inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Inferior derecha:   " + matriz[n - 1][n - 1]);
    }
}