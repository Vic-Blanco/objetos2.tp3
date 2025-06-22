package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClienteTest {
    @Test
    void AlquilarTest() {
//        Libro elTunel = new Libro("El Túnel", Libro.REGULARES);
//        Libro antesDelFin = new Libro("Antes del Fin", Libro.REGULARES);
        Libro elTunel = new Libro("El Túnel", new Regular());
        Libro antesDelFin = new Libro("Antes del Fin", new Regular());
        Cliente yo = new Cliente("Javier");
        CopiaLibro copiaElTunel = new CopiaLibro(elTunel);
        CopiaLibro copiaAntesDelFin = new CopiaLibro(antesDelFin);
        yo.alquilar(copiaElTunel, 5);
        yo.alquilar(copiaAntesDelFin, 3);
        assertEquals(10.0, yo.calcularDeuda());
        assertEquals(2, yo.calcularPuntosObtenidos());
    }


}
