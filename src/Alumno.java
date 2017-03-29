/**
 * Created by cominf on 29/03/2017.
 */
public class Alumno {
    private String nombre;
    private int clave;
    private static int contador = 0;

    public Alumno(String nombre)
    {
        this.nombre = nombre;
        this.clave = ++contador;
    }

    public String comoTeLlamas()
    {
        return nombre;
    }

    public int cualEsTuClave()
    {
        return clave;
    }

    public static int dimeTotalAlumnos()
    {
        /*
        Si un método static llama a in método de instancia (no static)
        en la misma clase, se produce un error de compilación.
        cualEsTuClave();
        */
        /*
        No se puede utilizar this dentro de un método estático.
        System.out.println(this.nombre);
         */
        return contador;
    }

    public static void reiniciaContador()
    {
        contador = 0;
    }
}
