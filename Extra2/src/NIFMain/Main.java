package NIFMain;

import Entidad.NIF;
import Servicio.NIFServicio;

public class Main {
    public static void main(String[] args) {

        NIF nif1;
        NIFServicio ns = new NIFServicio();

       nif1 = ns.crearNif();
       ns.mostrar(nif1);

    }
}