package arreglos;

/*  1.   Inicializar directamente un arreglo con los primeros 10 
*números primos e imprimir el arreglo. 
*/
public class DiezPrimo {
    int[] numerosPrimo = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

    public void mostrarNumerosPrimo() {
        for (int numeroprimo : numerosPrimo) {
            System.out.println(numeroprimo);
        }
    }
}