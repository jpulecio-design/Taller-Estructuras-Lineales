package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class VeinteEntreUnoyCien {
    private ArrayList<Integer> numeros = new ArrayList<>();
    private Random random = new Random();

    public void generarNumeros() {
        for (int i = 0; i < 20; i++) {
            numeros.add(random.nextInt(100) + 1);
        }
    }

    public void mostrarOriginal() {
        mostrarLista("Lista original:", numeros);
    }

    public void mostrarLista(String titulo, ArrayList<Integer> lista) {
        System.out.println(titulo);
        for (int numero : lista) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public void ordenarMenorMayor() {
        ArrayList<Integer> ordenada = new ArrayList<>(numeros);
        Collections.sort(ordenada);
        mostrarLista("De menor a mayor:", ordenada);
    }

    public void ordenarMayorMenor() {
        ArrayList<Integer> ordenada = new ArrayList<>(numeros);
        Collections.sort(ordenada, Collections.reverseOrder());
        mostrarLista("De mayor a menor:", ordenada);
    }

    public void separarParesImpares() {
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0)
                pares.add(numero);
            else
                impares.add(numero);
        }
        mostrarLista("Pares:", pares);
        mostrarLista("Impares:", impares);
    }
}