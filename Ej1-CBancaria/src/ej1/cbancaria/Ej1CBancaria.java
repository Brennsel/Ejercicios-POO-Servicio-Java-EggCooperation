package ej1.cbancaria;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Ej1CBancaria {

    public static void main(String[] args) {

        CuentaBancariaServicio bs = new CuentaBancariaServicio();
        CuentaBancaria cuenta = bs.crearCuenta();
        Scanner leer = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n>>>>>>>>>>Bienvenido!<<<<<<<<<<");
            System.out.println(">>>>>>>>>>>>>MENU<<<<<<<<<<<<<<");
            System.out.println("1. INGRESAR EFECTIVO");
            System.out.println("2. RETIRAR EFECTIVO");
            System.out.println("3. EXTRACCION RAPIDA");
            System.out.println("4. CONSULTAR SALDO");
            System.out.println("5. CONSULTAR DATOS");
            System.out.println("6. SALIR");
            System.out.println("================================");
            System.out.print("\nSeleccione una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    bs.ingresar(cuenta);
                    break;
                case 2:
                    bs.retirar(cuenta);
                    break;
                case 3:
                    bs.extraccionRapida(cuenta);
                    break;
                case 4:
                    bs.consultarSaldo(cuenta);
                    break;
                case 5:
                    bs.consultarDatos(cuenta);
                    break;
                case 6:
                    System.out.println("Sesion finalizada.");
                    break;
                default:
                    System.out.println("Ingreso incorrecto");
                    break;
            }
            System.out.println("\n================================");
        } while (opc != 6);

    }
    
}
