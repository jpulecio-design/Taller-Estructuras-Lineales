package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class VeinteParesAscendentesBorrar {
    private ArrayList<Integer> numeros = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void generarPares() {
        for (int i = 0; i < 20; i++) {
            numeros.add((i + 1) * 2);
        }
    }

    public void mostrar() {
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public void insertar() {
        System.out.print("Ingrese un numero a insertar: ");
        int numeroAInsertar = scanner.nextInt();
        int posicion = numeros.size();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeroAInsertar <= numeros.get(i)) {
                posicion = i;
                break;
            }
        }
        numeros.add(posicion, numeroAInsertar);
        System.out.println("Lista tras insertar " + numeroAInsertar + ":");
        mostrar();
    }

    public void borrar() {
        System.out.print("Ingrese un numero a borrar: ");
        int numeroABorrar = scanner.nextInt();
        if (numeros.contains(numeroABorrar)) {
            numeros.remove(Integer.valueOf(numeroABorrar));
            System.out.println("Numero " + numeroABorrar + " borrado.");
        } else {
            System.out.println("El numero " + numeroABorrar + " no se encuentra en la lista");
        }
        System.out.println("Lista tras borrar:");
        mostrar();
    }
}