package construccion;

import java.util.*;

public class Seccion {
    private String nombre;
    private List<Operario> listado;
    
    public Seccion() {
        this( "-" );
    }
    
    public Seccion(String nombre) {
        setNombre(nombre);
        listado = new LinkedList<Operario>();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setListado(List<Operario> listado) {
        this.listado = listado;
    }
    
    public List<Operario> getListado() {
        return listado;
    }
    
    public void agregarOperario(Operario o){
        listado.add(o);
    }
    
    public String toString(){
        return "{ "
                + "seccion: " + nombre
                + ", " + listado
                + " }";
    }
}