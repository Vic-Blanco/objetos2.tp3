package oop2.tp3.ejercicio1;

public class Regular implements Categoria {
    @Override
    public double calcularMonto(int diasAlquilados) {
        double monto = 2;
        if (diasAlquilados > 2)
            monto += (diasAlquilados - 2) * 1.5;
        return monto;
    }

    @Override
    public int sumarPuntos(int diasAlquilados) {
        return 0;
    }
}
