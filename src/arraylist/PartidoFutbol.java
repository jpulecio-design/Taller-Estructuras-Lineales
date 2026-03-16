package arraylist;

/* 10. Con el ejercicio de Partidos realizado en clase adicionar las siguientes 
*funcionalidades al programa:
*Mostrar los partidos de fútbol donde el visitante fue el ganador e imprimir
*Contar cuantas veces gano el Barcelona e imprimir 
*Eliminar los partidos de fútbol del ArrayList, cuyo resultado no sea un empate e imprimir
*Contar cuántos partidos ganó el equipo local. 
*/
public class PartidoFutbol {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public PartidoFutbol(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }
}