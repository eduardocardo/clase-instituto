import java.util.Random;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    //array de tipo String que almacena nombres de alumnos
    private String[] nombreAlumno;
    //
    private Alumno[] grupoAlumno;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        nombreAlumno = new String[10];
        nombreAlumno[0] = "Pepe";
        nombreAlumno[1] = "Juan";
        nombreAlumno[2] = "Ana";
        nombreAlumno[3] = "Maria";
        nombreAlumno[4] = "Julia";
        nombreAlumno[5] = "Eva";
        nombreAlumno[6] = "Sara";
        nombreAlumno[7] = "Edu";
        nombreAlumno[8] = "Fran";
        nombreAlumno[9] = "Manuel";

        grupoAlumno = null;
    }
    /**
     * Metodo que crea un numero alumnos y muestra sus datos
     * @param numeroAlumnos es el numero de alumnos que se quiere crear
     */
    public void testDatos(int numeroAlumnos)
    {
        grupoAlumno = new Alumno[numeroAlumnos];
        //se crea un objeto random para que al crear el alumno tengo nombre,edad,notas aleatorias
        Random rnd = new Random();
        for(int i = 0;i < numeroAlumnos; i++)
        {
            grupoAlumno[i] = new Alumno(nombreAlumno[rnd.nextInt(10)],rnd.nextInt(15) + 10);
           
        }
        //se añade notas a los alumnos

        for(int i = 0; i < numeroAlumnos; i++)
        {
            grupoAlumno[i].añadirNota(rnd.nextInt(11));
            grupoAlumno[i].añadirNota(rnd.nextInt(11));
            grupoAlumno[i].añadirNota(rnd.nextInt(11));
        }
        

        //se comprueba si el alumno esta aprobado
        for(int i = 0;i < numeroAlumnos; i++)
        {
            grupoAlumno[i].comprobarAprobado();
        }
       
        //se muestran los datos de los alumnos
        for(int i = 0; i < numeroAlumnos; i ++)
        {
            System.out.println(grupoAlumno[i].datosDelAlumno());
        }
       
    }
}
