/*
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
3
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
 */

package Servicios;

import Entidades.Persona;

import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public boolean esMayorDeEdad(Persona pers) {

        return pers.getEdad() >= 18;
    }

    public Persona crearPersona() {

        int edad;
        String nombre, sexo;
        double peso, altura;


        System.out.print("\nIngrese nombre: ");
        nombre = leer.next();

        System.out.print("Ingrese edad: ");
        do {
            edad = leer.nextInt();

            if (edad < 0) {
                System.out.print("Ingreso erroneo. Ingrese nuevamente la edad: ");
            }

        } while (edad < 0);


        System.out.print("Ingrese sexo ( H / M / O ): ");
        do {
            sexo = leer.next();

            if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
                System.out.print("Ingreso erroneo. Ingrese nuevamente el sexo: ");
            }

        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));

        System.out.print("Ingrese peso (kg): ");
        do {
            peso = leer.nextDouble();

            if (peso < 0) {
                System.out.print("Ingreso erroneo. Ingrese nuevamente el peso: ");
            }

        } while (peso < 0);

        System.out.print("Ingrese altura (mts): ");
        do {
            altura = leer.nextDouble();

            if (altura < 0) {
                System.out.print("Ingreso erroneo. Ingrese nuevamente la altura: ");
            }

        } while (altura < 0);

        System.out.println("\n============================================================");

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona pers) {

        double pesoAltura = pers.getPeso() / Math.pow(pers.getAltura(), 2);

        if (pesoAltura < 20) {
            return -1;

        } else if (pesoAltura >= 20 && pesoAltura <= 25) {
            return 0;

        } else {
            return 1;
        }
    }
}
