package arreglos;

public class CienNumero {
    public void inicializarCienNumeros() {
        int[] numeros = new int[200];
        System.out.println("una sola linea");
        for (int i = 2; i < numeros.length; i++) {
            if (i % 2 == 0) {
                numeros[i] = i;
                System.out.print(numeros[i] + "  ");
            }

        }
        System.out.println("\n 10 líneas ");
        int columna = 0;
        int linea = 1;
        for (int i = 2; i < numeros.length; i++) {
            if (i % 2 == 0) {
                if (columna == 0) {
                    System.out.print("Línea " + linea + ": ");
                }
                System.out.print(numeros[i] + "\t");
                columna++;

                if (columna % 10 == 0) {
                    System.out.println();
                    linea++;
                    columna = 0;
                }
            }
        }
    }
}

