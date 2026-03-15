package arreglos;

import java.util.Arrays;
import java.util.Random;

public class MayorMenorVeintiCinco {
    public void encontrarMayorMenor() {
        int[] numeros = new int[25];
        Random random = new Random();

        // Generar numeros aleatorios entre 1 y 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(-50, 50) + 1;
        }

        // Encontrar el mayor y menor número
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Imprimir los numeros generados, el mayor y el menor
        System.out.println("Numeros generados: " + Arrays.toString(numeros));
        System.out.println("Mayor numero: " + mayor);
        System.out.println("Menor numero: " + menor);
    }
}
