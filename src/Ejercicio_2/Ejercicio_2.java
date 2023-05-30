//Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos 
//capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual 
//(la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros 
//así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:

//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
//Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
//y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café 
//“no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó 
//o no la taza, y de no haberse llenado en cuanto quedó la taza.
//Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe 
//y se añade a la cafetera la cantidad de café indicada.

package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        CafeteriaServicio servicio = new CafeteriaServicio();
        
        CafeteriaEntidad cafe = new CafeteriaEntidad(1000,250);
        
        int menu = -1;
        do {
            System.out.println();
            System.out.println();
            System.out.println("BIENVENIDO A NESPRESSO");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Estado actual de la cafetera");
            System.out.println("0. SALIR");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                     cafe.setCantidadActual(servicio.llenarCafetera(cafe));
                    break;
                case 2:
                    servicio.servirTaza(cafe);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafe);
                    break;
                case 4:
                    servicio.agregarCafe(cafe);
                    break;
                case 5:
                    System.out.println("Capacidad maxima: " + cafe.getCapacidadMaxima());
                System.out.println("Cantidad actual: " + cafe.getCantidadActual());
                break;
                default:
            }
        } while (menu != 0);
        
    }
    
}
