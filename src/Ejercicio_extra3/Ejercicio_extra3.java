//Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
//fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
//fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
package Ejercicio_extra3;

import java.util.Scanner;

public class Ejercicio_extra3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        FraccionesServicios servicios = new FraccionesServicios();
        FraccionesEntidad operador = new FraccionesEntidad();
        
        servicios.crearFraccion(operador);

        int menu = -1;
        do {
            System.out.println();
            System.out.println("1. Sumar Fracciones");
            System.out.println("2. Restar Fracciones");
            System.out.println("3. Multiplicar Fracciones");
            System.out.println("4. Dividir Fracciones");
            System.out.println("0. SALIR");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    servicios.sumarFracciones(operador);
                    break;
                case 2:
                    servicios.restaFracciones(operador);
                    break;
                case 3:
                    servicios.multiplicarFracciones(operador);
                    break;
                case 4:
                    servicios.dividirFracciones(operador);
                    break;
                default:
                    System.out.println("Esa opcion no es valida");
            }
        } while (menu != 0);

    }

}
