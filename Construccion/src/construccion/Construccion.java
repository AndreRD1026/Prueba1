package construccion;

public class Construccion {
    
    private static void init(Seccion s){
        s.agregarOperario( new Operario( "Damaris", new Clave(1001) ) );
        s.agregarOperario( new Operario( "Luis", new Clave(1605) ) );
        s.agregarOperario( new Operario( "Ludwing", new Clave(1230) ) );
        s.agregarOperario( new Operario( "Gerson", new Clave(1018) ) );
        s.agregarOperario( new Operario( "Steven", new Clave(1056) ) );
    }

    public static void main(String[] args) {
        
        Seccion s = new Seccion("C");
        init(s);
        System.out.println(s);
    }
}
