package Ejercicio_1;

import java.util.Scanner;

public class CuentaBancariaServicio {

    public CuentaEntidad crearCuenta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("BIENVENIDO");
        System.out.println("Ahora le pediremos los datos para crear la cuenta bancaria");
        System.out.println();
        System.out.println("Ingrese Numero de la Cuenta:");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese DNI del cliente:");
        long dniCliente = leer.nextLong();
        System.out.println("Saldo actual de la cuenta:");
        double saldoActual = leer.nextDouble();
        return new CuentaEntidad(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaEntidad cuenta) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuanto dinero quiere ingresar?");
        double dinero = leer.nextDouble();
        System.out.println("Acaba de ingresar: $" + dinero);
        cuenta.setSaldoActual(cuenta.getSaldoActual() + dinero);
    }

    public void retirar(CuentaEntidad cuenta) {
        Scanner leer = new Scanner(System.in);
        /*recibe una cantidad de dinero a retirar y se le
        restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
        retirar se retirará el máximo posible hasta dejar la cuenta en 0.*/
        System.out.println("Cuanto desea retirar?:");
        double dinero = leer.nextDouble();
        if (dinero > cuenta.getSaldoActual()) {
            System.out.println("La cantidad ingresada excede el saldo actual");
            System.out.println("Se retiraron:");
            System.out.println(cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        } else {
            System.out.println("Se retiraron $" + dinero + " de su cuenta");
            cuenta.setSaldoActual(cuenta.getSaldoActual() - dinero);
        }
    }

    public void extraccionRapida(CuentaEntidad cuenta) {
        Scanner leer = new Scanner(System.in);
        /*le permitirá sacar solo un 20% de su saldo.
        Validar que el usuario no saque más del 20%.*/
        double maximoRetirar = cuenta.getSaldoActual() * 0.20;
        System.out.println("Cuanto dinero quiere retirar de manera RAPIDA?:");
        double dinero = leer.nextDouble();
        if (dinero > maximoRetirar) {
            System.out.println("Su retiro excede el maximo disponible para la operacion.");
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - dinero);
        }

    }

    public void consultarSaldo(CuentaEntidad cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaEntidad cuenta) {
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI Cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo disponible: " + cuenta.getSaldoActual());
    }
}
