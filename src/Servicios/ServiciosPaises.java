package Servicios;

import Entidades.Pais;

import java.util.*;

public class ServiciosPaises {
Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Pais crearPais(){
         Pais pais=new Pais();
         pais.setNombre(sc.next());
        return pais;
    }

    public HashSet<Pais> crearListaPaises(){
        HashSet<Pais> paisHashSet= new HashSet<>();
             do {
            System.out.println("ingrese nombre pais");
            paisHashSet.add(crearPais());
            System.out.println("salir?");
        }while (sc.next().equalsIgnoreCase("no")?true:false);
        mostrarListaPaises(paisHashSet);
        return paisHashSet;
    }

    private void mostrarListaPaises(HashSet<Pais> paisHashSet){
        for (Pais x: paisHashSet
             ) {
            System.out.println(x);
        }
    }

    public void ordenamientoAlfabeticoNombre(HashSet<Pais> crearListaPaises){
        ArrayList <Pais> orderAlfabetico= new ArrayList<>();
        orderAlfabetico.addAll(crearListaPaises);
        Collections.sort(orderAlfabetico, Comparator.comparing(Pais::getNombre));
        for (Pais v:orderAlfabetico
             ) {
            System.out.println(v.getNombre());
        }
    }


    public HashSet <Pais> eliminarPais(HashSet<Pais> paisHashSet){
        HashSet <Pais> listaSinAlgunPais =new HashSet<>();
        Pais paisEliminado=null;
        System.out.println("pone el pais que vas a eliminar");
        String paisCandidadoEliminarString=sc.next();

        Iterator<Pais>its= paisHashSet.iterator();
        while (its.hasNext() && paisEliminado==null){
            Pais variableIteradora= its.next();
            if (variableIteradora.getNombre().equals(paisCandidadoEliminarString)){
                its.remove();
                paisEliminado=variableIteradora;
            }
      }
    if (paisEliminado!=null){
        System.out.println("El pais ingresado se eliminó");
        System.out.println("");
    }else {
        System.out.println("No se encontró che...");
        System.out.println("");
    }

    listaSinAlgunPais.addAll(paisHashSet);
    mostrarListaPaises(listaSinAlgunPais);
    return listaSinAlgunPais;
    }









}
