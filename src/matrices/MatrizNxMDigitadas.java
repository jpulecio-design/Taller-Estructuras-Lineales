package matrices;

import java.util.Random;
import java.util.Scanner;

public class MatrizNxMDigitadas {
    private int[][] matriz;
    private Random random = new Random();

    public void pedirDimensiones() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        int columnas = scanner.nextInt();
        rellenarMatrizAleatoria(filas, columnas);
    }

    private void rellenarMatrizAleatoria(int filas, int columnas) {
        matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public void intercambiarPrimeraFilaPorLaSegunda() {
        if (matriz.length < 2) {
            System.out.println("La matriz no tiene suficientes filas para intercambiar");
            return;
        }
        int[] temp = matriz[0];
        matriz[0] = matriz[1];
        matriz[1] = temp;
    }

    public void mostrarMatriz() {
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }
}