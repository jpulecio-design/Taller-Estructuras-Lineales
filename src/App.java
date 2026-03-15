import arraylist.MenosDiezSumaMedia;
import arreglos.*;

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
        MayorMenorVeintiCinco mayorMenorVeintiCinco = new MayorMenorVeintiCinco();
        mayorMenorVeintiCinco.encontrarMayorMenor();
        VeinteAleatoriosAlDerechoyAlreves veinteAleatoriosAlDerechoyAlreves = new VeinteAleatoriosAlDerechoyAlreves();
        veinteAleatoriosAlDerechoyAlreves.generarYMostrarAleatorios();
        MenosDiezSumaMedia menosDiezSumaMedia = new MenosDiezSumaMedia();
        menosDiezSumaMedia.generarYMostrarNumeros();
    }
}
