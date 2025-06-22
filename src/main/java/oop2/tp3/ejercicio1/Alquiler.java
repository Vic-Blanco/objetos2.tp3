package oop2.tp3.ejercicio1;

public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;

    }

    public double calcularMonto() {
        double monto = copia.calcularMonto(diasAlquilados);
        return monto;
    }
}
