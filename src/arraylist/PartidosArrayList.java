package arraylist;

/* 10. Con el ejercicio de Partidos realizado en clase adicionar las siguientes funcionalidades al programa:
Mostrar los partidos de fútbol donde el visitante fue el ganador e imprimir
Contar cuantas veces gano el Barcelona e imprimir 
Eliminar los partidos de fútbol del ArrayList, cuyo resultado no sea un empate e imprimir
Contar cuántos partidos ganó el equipo local. 
*/
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PartidosArrayList {
    private ArrayList<PartidoFutbol> partidos = new ArrayList<>();

    public void cargarPartidos(String nombreFichero) {
        try {
            Scanner s = new Scanner(new File(nombreFichero));
            while (s.hasNext()) {
                String[] datos = s.nextLine().split("::");
                partidos.add(new PartidoFutbol(
                        datos[0], datos[1],
                        Integer.parseInt(datos[2]),
                        Integer.parseInt(datos[3])));
            }
            s.close();
            System.out.println("Partidos cargados: " + partidos.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mostrarPartido(PartidoFutbol p) {
        System.out.println(p.getEquipoLocal() + " " + p.getGolesLocal()
                + " - " + p.getGolesVisitante() + " " + p.getEquipoVisitante());
    }

    public void mostrarGanadorVisitante() {
        System.out.println("\n--- Partidos ganados por el visitante ---");
        for (PartidoFutbol p : partidos)
            if (p.getGolesVisitante() > p.getGolesLocal())
                mostrarPartido(p);
    }

    public void contarVictoriasBarcelona() {
        int contador = 0;
        for (PartidoFutbol p : partidos)
            if ((p.getEquipoLocal().equals("Barcelona") && p.getGolesLocal() > p.getGolesVisitante())
                    || (p.getEquipoVisitante().equals("Barcelona") && p.getGolesVisitante() > p.getGolesLocal()))
                contador++;
        System.out.println("\n--- Victorias del Barcelona: " + contador + " ---");
    }

    public void contarVictoriasLocal() {
        int contador = 0;
        for (PartidoFutbol p : partidos)
            if (p.getGolesLocal() > p.getGolesVisitante())
                contador++;
        System.out.println("\n--- Partidos ganados por el local: " + contador + " ---");
    }

    public void eliminarNoEmpates() {
        Iterator<PartidoFutbol> it = partidos.iterator();
        while (it.hasNext()) {
            PartidoFutbol p = it.next();
            if (p.getGolesLocal() != p.getGolesVisitante())
                it.remove();
        }
        System.out.println("\n--- Partidos empatados restantes ---");
        for (PartidoFutbol p : partidos)
            mostrarPartido(p);
    }
}