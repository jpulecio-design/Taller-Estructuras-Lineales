import arreglos.*;
import arraylist.*;
public class App {
    public static void main(String[] args) throws Exception {
        DiezPrimo diezPrimo = new DiezPrimo();
        diezPrimo.mostrarNumerosPrimo();
        CienNumero cienNumero = new CienNumero();
        cienNumero.inicializarCienNumeros();
        NFactorial nFactorial = new NFactorial();
        nFactorial.generarNumerosAleatorios(10);
        nFactorial.calcularFactoriales();
        nFactorial.mostrarFactorialesyNumeros();
        
    }
}
