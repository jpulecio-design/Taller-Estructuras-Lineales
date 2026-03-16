package matrices;

import java.util.Random;
import java.util.Arrays;

public class AleatoriosBusquedaPosicion {
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
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public void buscarValor(int valor) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    System.out.println("Valor " + valor + " encontrado en posicion: [" + i + "][" + j + "]");
                    return;
                }
            }

        }
        System.out.println("Valor " + valor + " no encontrado en la matriz");
    }
}
