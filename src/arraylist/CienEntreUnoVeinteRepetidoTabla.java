package arraylist;

/* 8. Genere un ArrayList con 100 números enteros aleatorios entre 1 y 20. 
*¿Cómo puede recorrer la lista para determinar cuántas veces aparece cada
* número dentro de ella? Construya una tabla que muestre cada número y su 
*frecuencia de aparición, e identifique cuál es el número que se repite con 
*mayor frecuencia en la lista.
*/
import java.util.ArrayList;
import java.util.Random;

public class CienEntreUnoVeinteRepetidoTabla {
    private ArrayList<Integer> numeros = new ArrayList<>();
    private Random random = new Random();
    private int[] frecuencia = new int[20];

    public void generarNumeros() {
        for (int i = 0; i <= 100; i++) {
            int numero = random.nextInt(20) + 1;
            numeros.add(numero);
        }
    }

    public void frecuenciaApariciones() {
        for (int numero : numeros) {
            frecuencia[numero - 1]++;
        }
    }

    public void mostrarTablaFrecuencia() {
        System.out.println("Numero | Frecuencia");
        for (int i = 0; i < frecuencia.length; i++) {
            System.out.printf("%6d | %9d%n", i + 1, frecuencia[i]);
        }
    }

    public void numeroMayorFrecuencia() {
        frecuenciaApariciones();
        int maxFrecuencia = 0;
        int numeroMayorFrecuencia = 0;
        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] > maxFrecuencia) {
                maxFrecuencia = frecuencia[i];
                numeroMayorFrecuencia = i + 1;
            }
        }
        System.out.println("Numero con mayor frecuencia: " + numeroMayorFrecuencia +
                " (Frecuencia: " + maxFrecuencia + ")");
    }
}
