package oop2.tp3.ejercicio1;

public class Libro {
    //    public static final int INFANTILES = 2;
//    public static final int REGULARES = 0;
//    public static final int NUEVO_LANZAMIENTO = 1;
    private String nombre;
    //    private int codigoPrecio;
    private Categoria categoria;

    public Libro(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
//        this.codigoPrecio = priceCode;
    }

    public double calcularMonto(int diasAlquilados) {
        return this.categoria.calcularMonto(diasAlquilados);
    }


//    public boolean esLibroInfantil() {
//        return this.codigoPrecio == INFANTILES;
//    }
//    public boolean esLibroNuevoLanzamiento() {
//        return this.codigoPrecio == NUEVO_LANZAMIENTO;
//    }
//    public boolean esLibroRegular() {
//        return this.codigoPrecio == REGULARES;
//    }


}