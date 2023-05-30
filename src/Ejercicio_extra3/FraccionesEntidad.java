package Ejercicio_extra3;

public class FraccionesEntidad {
    
    private int den1;
    private int den2;
    private int nume1;
    private int nume2;
    
    public FraccionesEntidad() {
    }

    public FraccionesEntidad(int den1, int den2, int nume1, int nume2) {
        this.den1 = den1;
        this.den2 = den2;
        this.nume1 = nume1;
        this.nume2 = nume2;
    }

    public int getDen1() {
        return den1;
    }

    public void setDen1(int den1) {
        this.den1 = den1;
    }

    public int getDen2() {
        return den2;
    }

    public void setDen2(int den2) {
        this.den2 = den2;
    }

    public int getNume1() {
        return nume1;
    }

    public void setNume1(int nume1) {
        this.nume1 = nume1;
    }

    public int getNume2() {
        return nume2;
    }

    public void setNume2(int nume2) {
        this.nume2 = nume2;
    }

    
    
}
