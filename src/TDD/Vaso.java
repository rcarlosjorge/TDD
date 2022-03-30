package TDD;

public class Vaso {

    private int cantidadVasos;
    private int contenido;

    public Vaso() {
        int cantidadVasos;
        int contenido;
    }

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    public void setCantidadVasos(int cantidadVasos)  { this.cantidadVasos -= cantidadVasos; }

    public int getCantidadVasos() {
        return cantidadVasos;
    }
    public int getContenido() { return contenido; }

    public boolean hasVasos(int eVasos){
        return cantidadVasos >= eVasos ? true : false;
    }

    public int giveVasos(int cantidad){
        return cantidadVasos -= cantidad;
    }

}
