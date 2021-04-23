package construccion;

public class Clave {
    private int codigo;

    public Clave(int codigo) {
        //this.codigo = codigo;
        setCodigo(codigo);
    }
    
    public Clave(){
        this(-1);
    }
    
    public void setCodigo(int codigo) {
        this.codigo = ( codigo >= 0 ) ? codigo : 0;
        
        //if(codigo>=0)
        //    this.codigo = codigo;
        //else
        //    this.codigo = 0;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String toString() {
        return "{ cod: " + codigo + " }";
    }
}

// 1. Análisis      => analizar (diagramas de C.U.)     -> UML
// 2. Diseño        => diseñar (diagramas de clases)    -> UML
//      ¿Qué es un diagrama? Representación gráfica de clases
// 3. Codificación  => programar/desarrollar/codificar