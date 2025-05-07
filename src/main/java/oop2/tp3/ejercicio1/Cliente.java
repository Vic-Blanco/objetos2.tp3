package oop2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;
    private int puntosAlquilerFrecuente = 0;

    public Cliente(String nombre) {
        this.name = nombre;
    }

    public double calcularDeuda(){
        if (alquileres.isEmpty()) {
            return 0;
        }
        return alquileres.stream().mapToDouble(Alquiler::calcularMonto).sum();
    }

    public int calcularPuntosObtenidos(){
        return puntosAlquilerFrecuente;
    }

    public void alquilar(Libro Libro, int diasAlquilados) {
        CopiaLibro copiaLibro = new CopiaLibro(Libro);
        Alquiler rental = new Alquiler(copiaLibro, diasAlquilados);
        alquileres.add(rental);
        puntosAlquilerFrecuente++;
        sumarPuntosPorAlquilarNuevoLanzamiento(copiaLibro, diasAlquilados);

    }

    private void sumarPuntosPorAlquilarNuevoLanzamiento(CopiaLibro copiaLibro, int diasAlquilados) {
        if ((copiaLibro.esLibroNuevoLanzamiento()) && (diasAlquilados > 1)) {
            puntosAlquilerFrecuente++;
        }
    }
}