package Ejercicio_guia01;

import java.util.Scanner;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    //con el .useDelimiter(\n) te deja escribir con espacios la variable tipo String que pida el programa
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona() {
    }
    
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona tipoPersona(){
        System.out.println("Ingrese un nombre: ");
        nombre = leer.next();
        
        System.out.println("Ingrese un apellido: ");
        apellido = leer.next();
        
        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();
        Persona p1 = new Persona(nombre, apellido, edad);
        
        return p1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
}
