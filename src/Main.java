import Entidades.Pais;
import Servicios.ServiciosPaises;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        ServiciosPaises svp = new ServiciosPaises();
        HashSet <Pais> ccc= svp.crearListaPaises();

        System.out.println(".................");
        System.out.println("nombres por orden alfabetico");
        svp.ordenamientoAlfabeticoNombre(ccc);
        System.out.println(".................");
        System.out.println("lista con pais eliminado");
        svp.eliminarPais(ccc);


    }
}