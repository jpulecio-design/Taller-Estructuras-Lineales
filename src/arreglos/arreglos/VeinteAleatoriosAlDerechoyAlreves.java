package arreglos;
import java.util.Arrays;
import java.util.Random;
public class VeinteAleatoriosAlDerechoyAlreves {
    public void generarYMostrarAleatorios() {
        int[] numeros = new int[20];
        Random random = new Random();

        // Generar 20 numeros aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Mostrar los numeros en orden normal
        System.out.println("Numeros aleatorios en orden normal:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Mostrar los numeros en orden inverso
        System.out.println("Numeros aleatorios en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

}
