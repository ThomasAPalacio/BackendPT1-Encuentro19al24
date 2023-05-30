package Ejercicio_extra3;

import java.util.Scanner;

public class FraccionesServicios {

    public void crearFraccion(FraccionesEntidad operador) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numerador de la primera fraccion:");
        operador.setNume1(leer.nextInt());

        System.out.println("Ingrese el denominador de la primera fraccion:");
        operador.setDen1(leer.nextInt());

        System.out.println("Ingrese el numerador de la segunda fraccion: ");
        operador.setNume2(leer.nextInt());

        System.out.println("Ingrese el denominador de la segunda fraccion: ");
        operador.setDen2(leer.nextInt());

        System.out.println("La primera fraccion que ingreso es: ");
        System.out.println(operador.getNume1() + "/" + operador.getDen1());
        System.out.println("La segunda fraccion que ingreso es: ");
        System.out.println(operador.getNume2() + "/" + operador.getDen2());
    }

    public void sumarFracciones(FraccionesEntidad operador) {
        int res1, res2, res3, res4;

        res1 = 0;
        res2 = 0;
        res3 = 0;
        res4 = 0;

        System.out.println("La suma de la fraccion da como resultado: ");

        res1 = operador.getDen1() * operador.getDen2();
        res2 = operador.getNume1() * operador.getDen2();
        res3 = operador.getDen1() * operador.getNume2();
        res4 = res2 + res3;

        System.out.println(res4);
        System.out.println("-");
        System.out.println(res1);

    }

    public void restaFracciones(FraccionesEntidad operador) {

        if (operador.getDen1() == operador.getDen2()) {
            int res1 = 0;
            System.out.println("La resta de la fraccion da como resultado: ");
            res1 = operador.getNume1() - operador.getNume2();

            System.out.println(res1);
            System.out.println("-");
            System.out.println(operador.getDen1());
        } else if (operador.getDen1() != operador.getDen2()) {
            int res1 = 0, res2 = 0, res3 = 0, res4 = 0;

            res1 = operador.getDen1() * operador.getDen2();
            res2 = operador.getNume1() * operador.getDen2();
            res3 = operador.getDen1() * operador.getNume2();
            res4 = res2 - res3;

            System.out.println(res4);
            System.out.println("-");
            System.out.println(res1);
        }
    }

    public void multiplicarFracciones(FraccionesEntidad operador) {
        int res1 = 0, res2 = 0;

        System.out.println("La multiplicacion de la fraccion da como resultado:");

        res1 = operador.getNume1() * operador.getNume2();
        res2 = operador.getDen1() * operador.getDen2();

        System.out.println(res1);
        System.out.println("-");
        System.out.println(res2);
    }

    public void dividirFracciones(FraccionesEntidad operador) {
        int res1 = 0, res2 = 0;

        System.out.println("La division de la fraccion da como resultado: ");

        res1 = operador.getNume1() * operador.getDen2();
        res2 = operador.getDen1() * operador.getNume2();
    }

}
