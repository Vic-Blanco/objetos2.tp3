package oop2.tp3.ejercicio1;

public class CopiaLibro {
    private Libro copia;

    public CopiaLibro(Libro libro) {
        this.copia= libro;
    }
    public boolean esLibroInfantil() {
        return this.copia.esLibroInfantil();
    }
    public boolean esLibroNuevoLanzamiento() {
        return this.copia.esLibroNuevoLanzamiento();
    }
    public boolean esLibroRegular() {
        return this.copia.esLibroRegular();
    }
}