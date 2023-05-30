package Ejercicio_extra1;

import java.util.Scanner;

public class RaicesServicio {
    
    Scanner leer = new Scanner(System.in);

    public RaicesEntidad crearRaiz() {
        System.out.println("Ingresar coeficiente (a) de la ecuacion de 2do grado");
        double a = leer.nextDouble();
        System.out.println("Ingresar coeficiente (b) de la ecuacion de 2do grado");
        double b = leer.nextDouble();
        System.out.println("Ingresar coeficiente (c) de la ecuacion de 2do grado");
        double c = leer.nextDouble();

        return new RaicesEntidad(a, b, c);

    }

    public double getDiscriminante(RaicesEntidad raiz) {        
        double discr = ((Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC());
        return discr;
    }

    public boolean tieneRaices(RaicesEntidad raiz) {
        boolean dosRaices = false;
        if (getDiscriminante(raiz) > 0) {
            dosRaices = true;
        }
        return dosRaices;
    }

    public boolean tieneRaiz(RaicesEntidad raiz) {
        boolean unaRaiz = false;
        if (getDiscriminante(raiz) == 0) {
            unaRaiz = true;
        }
        return unaRaiz;
    }

    public void obtenerRaices(RaicesEntidad raiz) {
        if (tieneRaices(raiz)) {
            
            System.out.println("\nLas raices son: "
                    + "\n" + ((-raiz.getB() + (Math.sqrt(getDiscriminante(raiz)))) / (2 * raiz.getA()))
                    + "\n" + ((-raiz.getB() - (Math.sqrt(getDiscriminante(raiz)))) / (2 * raiz.getA())));
        }
    }

    public void obtenerRaiz(RaicesEntidad raiz) {
        if (tieneRaiz(raiz)) {
            System.out.println("\nLas raiz es: "
                    + "\n" + -raiz.getB() / 2 * raiz.getA());
        }
    }

    public void calcular(RaicesEntidad raiz) {
        if (getDiscriminante(raiz) < 0) {
            System.out.println("La ecuacion no tiene solucion entre los numeros reales,"
                    + " el discriminante es: "+getDiscriminante(raiz));
        } else {
            obtenerRaices(raiz);
           obtenerRaiz(raiz);
        }
    }

    
    
}
