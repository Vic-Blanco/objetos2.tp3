package oop2.tp3.ejercicio1;

public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public double calcularMonto() {
        double monto = 0;
        if (copia.esLibroRegular()) {
            monto += 2;
            if (diasAlquilados > 2)
                monto += (diasAlquilados - 2) * 1.5;
        }
        if (copia.esLibroNuevoLanzamiento()) {
            monto += diasAlquilados * 3;
        }
        if (copia.esLibroInfantil()) {
            monto += 1.5;
            if (diasAlquilados > 3)
                monto += (diasAlquilados - 3) * 1.5;
        }
        return monto;
    }
}
