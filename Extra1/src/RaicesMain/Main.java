package RaicesMain;

import Entidad.Raices;
import Servicio.RaicesServicio;

public class Main {
    public static void main(String[] args) {

        Raices raiz1 = new Raices(1, 0, -9);
        RaicesServicio rs = new RaicesServicio();

        rs.calcular(raiz1);

    }
}