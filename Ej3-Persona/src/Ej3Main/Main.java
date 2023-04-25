/*
A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */

package Ej3Main;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Main {
    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();

        Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona();

        boolean[] vectorEdad = new boolean[4];
        int[] vectorIMC = new int[4];

        vectorEdad[0] = ps.esMayorDeEdad(p1);
        vectorEdad[1] = ps.esMayorDeEdad(p2);
        vectorEdad[2] = ps.esMayorDeEdad(p3);
        vectorEdad[3] = ps.esMayorDeEdad(p4);

        vectorIMC[0] = ps.calcularIMC(p1);
        vectorIMC[1] = ps.calcularIMC(p2);
        vectorIMC[2] = ps.calcularIMC(p3);
        vectorIMC[3] = ps.calcularIMC(p4);

        promedioPeso(vectorIMC);
        promedioMayores(vectorEdad);


    }

    public static void promedioPeso(int[] vector) {

        int debajo = 0, ideal = 0, sobrepeso = 0;

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == -1) {
                debajo++;
            } else if (vector[i] == 0) {
                ideal++;
            } else {
                sobrepeso++;
            }
        }


        System.out.println("\nEl porcentaje de personas que se encuentran ");
        System.out.println("Por debajo de su peso es " + (debajo * 25) + "%");
        System.out.println("En su peso ideal es " + (ideal * 25) + "%");
        System.out.println("Por ensima de su peso es " + (sobrepeso * 25) + "%");
        System.out.println("\n============================================================");

    }

    public static void promedioMayores(boolean[] vector) {

        int mayor = 0, menor = 0;

        for (int i = 0; i < vector.length; i++) {

            if (vector[i]) {
                mayor++;
            } else {
                menor++;
            }
        }

        System.out.println("\nEl procentaje de mayores de edad es " + (mayor * 25) + "%");
        System.out.println("El porcentaje de menores de edad es " + (menor * 25) + "%");
        System.out.println("\n============================================================");

    }
}