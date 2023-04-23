/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters.
 */

package Entidad;

public class Cafetera {

    private int capacidadMaxima, capadidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capadidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capadidadActual = capadidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapadidadActual() {
        return capadidadActual;
    }

    public void setCapadidadActual(int capadidadActual) {
        this.capadidadActual = capadidadActual;
    }

}

