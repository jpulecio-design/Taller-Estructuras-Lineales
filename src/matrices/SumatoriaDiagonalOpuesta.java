package matrices;

/* 12.   Inicializar una matriz de tamaño n por n rellenar con
*números aleatorios entre -50 y 50 y calcular la sumatoria de 
*los elementos de la diagonal opuesta a la principal.
*/
import java.util.Random;

public class SumatoriaDiagonalOpuesta {
    private int[][] matriz;
    private Random random = new Random();

    public void generarMatriz(int n) {
        matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(101) - 50; 
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

    public void sumarDiagonalOpuesta() {
        int suma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }
        System.out.println("Suma diagonal opuesta: " + suma);
    }
}