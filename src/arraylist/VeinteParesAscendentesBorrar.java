package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class VeinteParesAscendentesBorrar {
    public void generarYMostrarPares() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Generar 20 numeros pares ascendentes
        for (int i = 0; i < 20; i++) {
            numeros.add((i + 1) * 2);
        }

        // Mostrar los numeros generados
        System.out.println("Numeros pares ascendentes:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Insertar numero en la posicion correcta
        System.out.print("Ingrese un numero a insertar: ");
        int numeroAInsertar = scanner.nextInt();
        int posicion = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeroAInsertar <= numeros.get(i)) {
                posicion = i;
                break;
            }
            posicion = numeros.size(); // si es mayor que todos, va al final
        }
        numeros.add(posicion, numeroAInsertar);
        System.out.println("Lista tras insertar " + numeroAInsertar + ":");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Solicitar al usuario el numero a borrar
        System.out.print("Ingrese un numero a borrar: ");
        int numeroABorrar = scanner.nextInt();
        if (numeros.contains(numeroABorrar)) {
            numeros.remove(Integer.valueOf(numeroABorrar));
            System.out.println("Numero " + numeroABorrar + " borrado.");
        } else {
            System.out.println("El numero " + numeroABorrar + " no se encuentra en la lista.");
        }

        // Mostrar los numeros restantes
        System.out.println("Numeros restantes:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        scanner.close();
    }
}