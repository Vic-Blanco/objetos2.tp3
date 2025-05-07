package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClienteTest {
    @Test
    void AlquilarTest(){
        Libro elTunel = new Libro("El Túnel", Libro.REGULARES);
        Libro antesDelFin = new Libro("Antes del Fin", Libro.REGULARES);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(elTunel, 5);
        yo.alquilar(antesDelFin, 3);
        assertEquals(10.0, yo.calcularDeuda());
        assertEquals(2, yo.calcularPuntosObtenidos());
    }


}
