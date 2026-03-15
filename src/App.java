import arraylist.MenosDiezSumaMedia;
import arraylist.VeinteParesAscendentesBorrar;
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

        VeinteAleatoriosAlDerechoyAlreves veinte = new VeinteAleatoriosAlDerechoyAlreves();
        veinte.generarNumeros();
        veinte.invertirNumeros();
        veinte.mostrarNumeros();

        MenosDiezSumaMedia menosDiez = new MenosDiezSumaMedia();
        menosDiez.generarNumeros();
        menosDiez.mostrarNumeros();
        menosDiez.calcularYMostrarSumaMedia();

        VeinteParesAscendentesBorrar vpab = new VeinteParesAscendentesBorrar();
        vpab.generarPares();
        vpab.mostrar();
        vpab.insertar();
        vpab.borrar();
        vpab.cerrar();
    }
}