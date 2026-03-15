package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class MenosDiezSumaMedia {
    public void generarYMostrarNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Generar 10 numeros aleatorios entre -10 y 10
        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(21) - 10; // Genera numeros entre -10 y 10
            numeros.add(numero);
        }

        // Mostrar los numeros generados
        System.out.println("Numeros generados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Calcular la suma y la media
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double media = (double) suma / numeros.size();

        // Mostrar la suma y la media
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
