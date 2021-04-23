package construccion;

public class Operario {
    private String nombre;
    private Clave clave;
    
    public Operario(String nombre, Clave clave) {
        setNombre(nombre);
        setClave(clave);
    }
    
    public Operario() {
        this( "", new Clave(-1) );
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setClave(Clave clave){
        this.clave = clave;
    }
    
    public Clave getClave(){
        return clave;
    }
    
    public String toString() {
        return "{ "
                + "nombre: " + "\"" + nombre + "\""
                + ", " + "clave: " + clave
                + " }";
    }
}
