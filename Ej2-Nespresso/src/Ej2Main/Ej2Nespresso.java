package Ej2Main;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;

import java.util.Scanner;

public class Ej2Nespresso {

    public static void main(String[] args) {

        Cafetera cafetera1 = new Cafetera(2000, 450);
        CafeteraServicio cs = new CafeteraServicio();
        Scanner leer = new Scanner(System.in);
        int opc, taza, cafe;
        boolean esValido;

        do {
            System.out.println("\n>>>>>>>>>>NESPRESSO<<<<<<<<<<");
            System.out.println(">>>>>>>>>>>>>MENU<<<<<<<<<<<<<<");
            System.out.println("1. LLENAR CAFETERA");
            System.out.println("2. SERVIR TAZA");
            System.out.println("3. VACIAR CAFETERA");
            System.out.println("4. AGREGAR CAFE");
            System.out.println("5. APAGAR");
            System.out.println("================================");
            System.out.print("\nSeleccione una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    cs.llenarCafetera(cafetera1);
                    cs.mostrarDatos(cafetera1);
                    break;

                case 2:
                    System.out.print("Ingrese los mililitros (ml) de la taza: ");
                    taza = leer.nextInt();

                    cs.servirTaza(cafetera1, taza);
                    cs.mostrarDatos(cafetera1);
                    break;

                case 3:
                    cs.vaciarCafetera(cafetera1);
                    cs.mostrarDatos(cafetera1);
                    break;

                case 4:
                    do {
                        System.out.print("Ingrese la cantidad de cafe a agregar (ml):  ");
                        cafe = leer.nextInt();

                        esValido = cs.agregarCafe(cafetera1, cafe);

                    } while (!esValido);
                    cs.mostrarDatos(cafetera1);
                    break;

                case 5:
                    System.out.println("Apagando...");
                    break;
            }
            System.out.println("\n================================");
        } while (opc != 5);

    }
}
