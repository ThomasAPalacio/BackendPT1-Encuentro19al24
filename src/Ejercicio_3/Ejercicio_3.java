//Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: 
//nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. 
//Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
//En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
//Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
//Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
//y después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
//Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
//Si no es correcto se deberá mostrar un mensaje
//Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
//Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por 
//debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado 
//un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal 
//y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor 
//que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
//llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está 
//en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para 
//cada objeto si la persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC 
//y esMayorDeEdad en distintas variables(arrays), para después calcular 
//un porcentaje de esas 4 personas cuantas están por debajo de su peso, 
//cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
//un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, 
//podemos crear unos métodos adicionales.
package Ejercicio_3;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Boolean[] serMayor = new Boolean[4];
        int[] pesoPersonas = new int[4];

        for (int i = 0; i < 4; i++) {
            PersonaServicio servicio = new PersonaServicio();
            PersonaEntidad persona1 = new PersonaEntidad();
            System.out.println("Persona N° " + (i + 1));
            servicio.CrearPersona(persona1);
            serMayor[i] = servicio.esMayorDeEdad(persona1);

            if (servicio.esMayorDeEdad(persona1)) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }

            pesoPersonas[i] = servicio.CalcularIMC(persona1);

            switch (pesoPersonas[i]) {
                case -1:
                    System.out.println("Estas por debajo de tu peso ideal");
                    break;
                case 0:
                    System.out.println("Estas en tu peso ideal");
                    break;
                case 1:
                    System.out.println("Estas por encima de tu peso ideal");
                    break;
                default:
                    throw new AssertionError();
            }

        }

        int num1 = 0;
        int num2 = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;

        for (int i = 0; i < 4; i++) {
            if (serMayor[i]) {
                num1++;
            } else {
                num2++;
            }
            switch (pesoPersonas[i]) {
                case -1:
                    cont1++;
                    break;
                case 0:
                    cont2++;
                    break;
                case 1:
                    cont3++;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println(" ");
        System.out.println("El porcentaje de la gente mayor es: " + num1 * 4 / 100);
        System.out.println("El porcentaje de la gente menor es: " + num2 * 4 / 100);
        System.out.println("¿Cuantas personas estan debajo de su peso ideal? " + cont1);
        System.out.println("¿Cuantas personas estan en su peso ideal? " + cont2);
        System.out.println("¿Cuantas personas estan por encima de su peso ideal? " + cont3);
    }
}
