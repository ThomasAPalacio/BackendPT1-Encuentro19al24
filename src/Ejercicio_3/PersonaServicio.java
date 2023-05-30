package Ejercicio_3;

import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void CrearPersona(PersonaEntidad persona1) {
        
        System.out.println("Ingrese su nombre");
        persona1.setNombre(leer.next());
        
        System.out.println("Ingrese su edad, " +persona1.getNombre());
        persona1.setEdad(leer.nextInt());
        
        System.out.println("Ingrese su sexo: Hombre (H), Mujer (M) o Otro (O), " +persona1.getNombre());
        String sexo = leer.next();
        
        while (!sexo.equals("H") && !sexo.equals("h") && !sexo.equals("M") && !sexo.equals("m") && !sexo.equals("O") && !sexo.equals("o")) {
            System.out.println("ERROR! ese sexo no es valido, ingrese otro por favor");
            sexo = leer.next();
        }
        
        if (sexo.equals("H") || sexo.equals("h")) {
            sexo = "Hombre";
        }
        
        if (sexo.equals("M") || sexo.equals("m")) {
            sexo = "Mujer";
        }
        
        if (sexo.equals("O") || sexo.equals("o")) {
            sexo = "Otro";
        }
        
        System.out.println("Ingrese su peso actual en kilogramos, " +persona1.getNombre());
        persona1.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese su altura actual, " +persona1.getNombre());
        persona1.setAltura(leer.nextDouble());   
    }
    
    public boolean esMayorDeEdad(PersonaEntidad persona1) {

        if (persona1.getEdad() >= 18) {
            return true;
        }
        return false;
    }
    
    public int CalcularIMC(PersonaEntidad persona1) {
        
        double res = (persona1.getPeso() / (Math.pow(persona1.getAltura(), 2)));
        
        if (res < 20) {
            return -1;
        }
        
        if (res > 20 && res < 25) {
            return 0;
        }
        
        if (res > 25) {
            return 1;
        }
        return 5;
    }
    
}
