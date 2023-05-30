package Ejercicio_2;

import java.util.Scanner;

public class CafeteriaServicio {

    Scanner leer = new Scanner(System.in);

    public int llenarCafetera(CafeteriaEntidad cafe) {
        return cafe.getCapacidadMaxima();
    }

    public void servirTaza(CafeteriaEntidad cafe) {
        System.out.println("Ingrese el tamaño de la taza: ");
        int taza = leer.nextInt();

        if (taza > cafe.getCantidadActual()) {
            System.out.println("No habia suficiente cafe en la cafetera, se lleno:  " + cafe.getCantidadActual() + "ml.");
            cafe.setCantidadActual(0);
        } else {
            System.out.println("Se lleno la taza");
            cafe.setCantidadActual(cafe.getCantidadActual() - taza);
        }
    }
    
    public void vaciarCafetera(CafeteriaEntidad cafe){
        cafe.setCantidadActual(0);
    }
    
    public void agregarCafe(CafeteriaEntidad cafe){
        System.out.println("Ingrese la cantidad de cafe a agregar en mililitros: ");
        int cafe2 = leer.nextInt();
        int resta = cafe.getCapacidadMaxima() - cafe.getCantidadActual();

        if(cafe2 <= resta){
            cafe.setCantidadActual(cafe.getCantidadActual() + cafe2);
        } else {
            System.out.println("La cantidad excede la capacidad de la cafetera.");
        }
    }

}
