package arreglos;

import java.util.Arrays;
import java.util.Random;

public class NFactorial {
    Random random = new Random();
    int[] numeros = new int[10];
    int[] factoriales = new int[10];

    public void generarNumerosAleatorios(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(10) + 1; // Genera nUmeros entre 1 y 10
            numeros[i] = numero;
        }
    }

    public void calcularFactoriales() {
        for (int i = 0; i < numeros.length; i++) {
            int factorial = 1;
            for (int j = 1; j <= numeros[i]; j++) {
                factorial *= j;
            }
            factoriales[i] = factorial;
        }
    }

    public void mostrarFactorialesyNumeros() {
        System.out.println("/n Numeros generados: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("/nFactoriales calculados: ");
        for (int factorial : factoriales) {
            System.out.println(factorial);
        }
    }
}
