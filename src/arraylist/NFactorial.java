package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class NFactorial {
    Random random = new Random();
    ArrayList<Integer> numeros = new ArrayList<>();
    ArrayList<Integer> factoriales = new ArrayList<>();

    public void generarNumerosAleatorios(int cantidad) {
        System.out.println("Numero generado: ");
        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(10) + 1; // Genera nUmeros entre 1 y 10
            numeros.add(numero);
        }
    }
    public void calcularFactoriales() {
        for (int numero : numeros) {
            int factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            factoriales.add(factorial);
        }       
    }
    public void mostrarFactorialesyNumeros() {
        System.out.println("Numeros generados: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("Factoriales calculados: ");
        for (int factorial : factoriales) {
            System.out.println(factorial);
        }   
    }   
}
