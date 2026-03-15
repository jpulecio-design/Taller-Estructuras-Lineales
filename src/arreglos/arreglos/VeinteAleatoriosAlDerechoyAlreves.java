package arreglos;

import java.util.Random;

public class VeinteAleatoriosAlDerechoyAlreves {
    private int[] numeros = new int[20];
    private int[] numerosInvertidos = new int[20];
    private Random random = new Random();

    public void generarNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
    }

    public void invertirNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[i] = invertirDigitos(numeros[i]);
        }
    }

    private int invertirDigitos(int numero) {
        int invertido = 0;
        while (numero != 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return invertido;
    }

    public void mostrarNumeros() {
        System.out.println("Numeros originales:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.println("Numeros invertidos:");
        for (int numero : numerosInvertidos) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}