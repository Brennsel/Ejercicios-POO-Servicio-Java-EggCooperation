/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package Servicios;

import Entidades.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancariaServicio {
    public Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        System.out.print("Ingrese numero de cuenta: ");
        int num = leer.nextInt();

        System.out.print("Ingrese DNI: ");
        long dni = leer.nextLong();

        System.out.print("Ingrese saldo actual: $");
        double saldo = leer.nextDouble();

        return new CuentaBancaria(num, dni, saldo);

    }

    public void ingresar(CuentaBancaria cuenta) {

        System.out.print("Dinero a ingresar: $");
        double ingreso = leer.nextDouble();

        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);

        System.out.print("Su nuevo saldo es: $" + (cuenta.getSaldoActual()));

    }

    public void retirar(CuentaBancaria cuenta) {

        System.out.print("Ingrese el monto a retirar: $");
        double retiro = leer.nextDouble();

        if (cuenta.getSaldoActual() >= retiro) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.print("Su nuevo saldo es: $" + cuenta.getSaldoActual());
        } else if (cuenta.getSaldoActual() < retiro || cuenta.getSaldoActual() == 0) {
            cuenta.setSaldoActual(0);
            System.out.println("El importe a retirar es mayor que su saldo");
            System.out.println("Su saldo actual es: $0");
        }

    }

    public void extraccionRapida(CuentaBancaria cuenta) {

        System.out.print("Solo puede retirar el 20%. Ingrese el monto a retirar: $");
        double retiro = leer.nextDouble();

        if (retiro < cuenta.getSaldoActual() * 0.2) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);

        } else {
            System.out.println("Supera el 20%. Solo puede retirar: $" + cuenta.getSaldoActual() * 0.2);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cuenta.getSaldoActual() * 0.2);
        }

        System.out.println("Su saldo actual es: $" + cuenta.getSaldoActual());

    }

    public void consultarSaldo(CuentaBancaria cuenta) {

        System.out.println("Su saldo actual es: $" + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {

        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
    }

}
