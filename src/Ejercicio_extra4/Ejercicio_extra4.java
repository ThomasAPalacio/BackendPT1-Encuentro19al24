//Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
//constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
//además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
//Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. ¿Te
//animas a simular el paso del tiempo en consola?
package Ejercicio_extra4;

import java.util.Scanner;

public class Ejercicio_extra4 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        TiempoServicios servicios = new TiempoServicios();
        TiempoEntidad time = new TiempoEntidad();
        
        servicios.definirTiempo(time);
        servicios.imprimirHoraCompleta(time);
    }
    
}
