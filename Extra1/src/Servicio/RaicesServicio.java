/*
 Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */

package Servicio;

import Entidad.Raices;

public class RaicesServicio {

    public double getDiscriminante(Raices raiz) {

        double discriminante = (Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()));

        return discriminante;
    }

    public boolean tieneRaices(Raices ecuacion) {

        if (getDiscriminante(ecuacion) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(Raices ecuacion) {

        if (getDiscriminante(ecuacion) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices(Raices ecuacion) {

        double x1, x2;

        if (tieneRaices(ecuacion)) {

            x1 = (-ecuacion.getB() + Math.sqrt(Math.pow(ecuacion.getB(), 2) - (4 * ecuacion.getA() * ecuacion.getC()))) / (2 * ecuacion.getA());
            x2 = (-ecuacion.getB() - Math.sqrt(Math.pow(ecuacion.getB(), 2) - (4 * ecuacion.getA() * ecuacion.getC()))) / (2 * ecuacion.getA());

            System.out.println("Las dos posibles soluciones son: X1: " + x1 + " y X2: " + x2);
        }
    }

    public void obtenerRaiz(Raices ecuacion) {

        if (tieneRaiz(ecuacion)) {

            System.out.println("La posible solucion es x: " + (-ecuacion.getB() + Math.sqrt(Math.pow(ecuacion.getB(), 2) - (4 * ecuacion.getA() * ecuacion.getC()))) / (2 * ecuacion.getA()));
        }
    }

    public void calcular(Raices ecuacion) {

        if (tieneRaices(ecuacion)) {
            obtenerRaices(ecuacion);
        } else if (tieneRaiz(ecuacion)) {
            obtenerRaiz(ecuacion);
        } else {
            System.out.println("La ecuacion no posee solucion posible.");
        }
    }

}
