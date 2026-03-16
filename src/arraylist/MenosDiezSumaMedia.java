package arraylist;

/*6.   Escribe un programa que lea números enteros aleatorios entre -10 y 10 
*y los guarde en un ArrayList hasta que se lea el número 10 y muestra los números
*leídos, su suma y su media. 
 */
import java.util.ArrayList;
import java.util.Random;

public class MenosDiezSumaMedia {
    private ArrayList<Integer> numeros = new ArrayList<>();
    private Random random = new Random();

    public void generarNumeros() {
        int numero;
        do {
            numero = random.nextInt(21) - 10;
            numeros.add(numero);
        } while (numero != 10);
    }

    public void mostrarNumeros() {
        System.out.println("Numeros generados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public void calcularYMostrarSumaMedia() {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double media = (double) suma / numeros.size();
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}