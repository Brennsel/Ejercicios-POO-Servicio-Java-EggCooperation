/*
 En NIFServicese dispondrá de los siguientes métodos:
a) Métodos getters y setters para el número de DNI y la letra.
b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
letra que le corresponderá. Una vez calculado, le asigna la letra que
le corresponde según
c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un
método que funciona de la siguiente manera: Para calcular la letra se
toma el resto de dividir el número de DNI por 23 (el resultado debe ser
un número entre 0 y 22). El método debe buscar en un array (vector) de
caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente: ...(pdf)...
 */

package Servicio;

import Entidad.NIF;

import java.util.Scanner;

public class NIFServicio {

    Scanner leer = new Scanner(System.in);
    String dniString;

    public NIF crearNif(){

        String[] vector = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        long dni;
        int pos;
        String letra;

        System.out.print("Ingrese el DNI: ");
        dniString = leer.next();                  //se podria verificar que no ingrese caracteres que no sean numeros

        dni= Long.valueOf(dniString);

        pos = (int) (dni%23);

        letra = vector[pos];

        return new NIF(dni, letra);
    }

    public void mostrar(NIF nif1){

        System.out.println("NIF: " + dniString + "-" + nif1.getLetra());
    }
}
