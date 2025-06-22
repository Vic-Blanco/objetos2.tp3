package oop2.tp3.ejercicio1;

public class NuevoLanzamiento implements Categoria {
    @Override
    public double calcularMonto(int diasAlquilados) {
        double monto = 0;
        return monto += diasAlquilados * 3;
    }

    @Override
    public int sumarPuntos(int diasAlquilados) {
        return (diasAlquilados > 1) ? 1 : 0;
    }

}
