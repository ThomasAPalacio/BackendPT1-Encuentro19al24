package Ejercicio_extra4;

import java.util.Scanner;

public class TiempoServicios {

    public void definirTiempo(TiempoEntidad time) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de horas (desde las 00 a las 24):");
        time.setHora(leer.nextInt());

        while (time.getHora() < 0 || time.getHora() > 24) {
            System.out.println("ERROR! las horas introducidas no son validas");
            System.out.println("Vuelva a ingresarlos:");
            time.setHora(leer.nextInt());
        }

        System.out.println("Ingrese una cantidad de minutos: ");
        time.setMinutos(leer.nextInt());

        while (time.getMinutos() < 0 || time.getMinutos() > 60) {
            System.out.println("ERROR! los minutos introducidos no son validos (desde 0 a 60)");
            System.out.println("Vuelva a ingresarlos:");
            time.setMinutos(leer.nextInt());
        }
        
        System.out.println("Ingrese una cantidad de segundos (desde 0 a 60):");
        time.setSegundos(leer.nextInt());

        while (time.getSegundos() < 0 || time.getSegundos() > 60) {
            System.out.println("ERROR! los segundos introducidos no son validos");
            System.out.println("Vuelva a ingresarlos: ");
            time.setSegundos(leer.nextInt());

        }
    }

    public void imprimirHoraCompleta(TiempoEntidad time) {
        
        System.out.println("La hora que es: " + time.getHora() + ":" + time.getMinutos() + ":" + time.getSegundos());
    }

}
