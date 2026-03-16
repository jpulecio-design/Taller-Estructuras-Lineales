import arreglos.*;
import matrices.AleatoriosBusquedaPosicion;
import matrices.MatrizMxNTranspuestaAleatoria;
import matrices.MatrizNxNAleatoriaSimetricaEsquina;
import matrices.SumatoriaDiagonalOpuesta;
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

        VeinteParesAscendentesBorrar veinteparascendente = new VeinteParesAscendentesBorrar();
        veinteparascendente.generarPares();
        veinteparascendente.mostrar();
        veinteparascendente.insertar();
        veinteparascendente.borrar();
        veinteparascendente.cerrar();

        CienEntreUnoVeinteRepetidoTabla cienEntreUnoVeinteRepetidoTabla = new CienEntreUnoVeinteRepetidoTabla();
        cienEntreUnoVeinteRepetidoTabla.generarNumeros();
        cienEntreUnoVeinteRepetidoTabla.frecuenciaApariciones();
        cienEntreUnoVeinteRepetidoTabla.mostrarTablaFrecuencia();
        cienEntreUnoVeinteRepetidoTabla.numeroMayorFrecuencia();

        VeinteEntreUnoyCien veinteEntreUnoyCien = new VeinteEntreUnoyCien();
        veinteEntreUnoyCien.generarNumeros();
        veinteEntreUnoyCien.mostrarOriginal();
        veinteEntreUnoyCien.ordenarMenorMayor();
        veinteEntreUnoyCien.ordenarMayorMenor();
        veinteEntreUnoyCien.separarParesImpares();

        PartidosArrayList partidos = new PartidosArrayList();
        partidos.cargarPartidos("Taller-Estructuras-Lineales\\PartidoLiga.txt");
        partidos.mostrarGanadorVisitante();
        partidos.contarVictoriasBarcelona();
        partidos.contarVictoriasLocal();
        partidos.eliminarNoEmpates();

        AleatoriosBusquedaPosicion aleatoriosBusquedaPosicion = new AleatoriosBusquedaPosicion();
        aleatoriosBusquedaPosicion.generarMatriz(5, 5);
        aleatoriosBusquedaPosicion.mostrarMatriz();
        aleatoriosBusquedaPosicion.buscarValor(50);

        SumatoriaDiagonalOpuesta sumatoriaDiagonalOpuesta = new SumatoriaDiagonalOpuesta();
        sumatoriaDiagonalOpuesta.generarMatriz(4);
        sumatoriaDiagonalOpuesta.mostrarMatriz();
        sumatoriaDiagonalOpuesta.sumarDiagonalOpuesta();

        MatrizNxNAleatoriaSimetricaEsquina matrizSimetricaEsquina = new MatrizNxNAleatoriaSimetricaEsquina();
        matrizSimetricaEsquina.generarMatriz(4);
        matrizSimetricaEsquina.mostrarMatriz();
        matrizSimetricaEsquina.esSimetrica();
        matrizSimetricaEsquina.mostrarEsquinas();

        MatrizMxNTranspuestaAleatoria matrizTranspuestaAleatoria = new MatrizMxNTranspuestaAleatoria();
        matrizTranspuestaAleatoria.generarMatriz(3, 4);
        matrizTranspuestaAleatoria.mostrarMatriz();
        matrizTranspuestaAleatoria.mostrarTranspuesta();
    }
}