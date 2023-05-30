package Ejercicio_extra2;

import java.util.Scanner;

public class NifServicio {

    Scanner leer = new Scanner(System.in);
    NifEntidad codificado = new NifEntidad();

    public String crearNIF() {

        System.out.println("Ingresar DNI");
        codificado.setDNI(leer.nextInt());
        int resto = (int) codificado.getDNI() % 23;
        System.out.println("el resto es " + resto);

        return codificado.elegirLetra(resto);
    }

    public void mostrar() {
        String car = crearNIF();
        System.out.println("El DNI codificado es: " + codificado.getDNI()
                + "-" + car);
    }
}
