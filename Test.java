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
        
        
        
      
    }

    /**
     * Metodo que crea 5 alumnos y muestra sus datos
     */
    public void testDatos()
    {
        //se crea un objeto random para que al crear el alumno tengo nombre,edad,notas aleatorias
        Random rnd = new Random();
        
        Alumno alumno1 = new Alumno(nombreAlumno[rnd.nextInt(10)],rnd.nextInt(15) + 10);
        Alumno alumno2 = new Alumno(nombreAlumno[rnd.nextInt(10)],rnd.nextInt(15) + 10);
        Alumno alumno3 = new Alumno(nombreAlumno[rnd.nextInt(10)],rnd.nextInt(15) + 10);
        Alumno alumno4 = new Alumno(nombreAlumno[rnd.nextInt(10)],rnd.nextInt(15) + 10);
        Alumno alumno5 = new Alumno(nombreAlumno[rnd.nextInt(10)],rnd.nextInt(15) + 10);
        
        //se añade notas a los alumnos
        alumno1.añadirNota(rnd.nextInt(11));
        alumno1.añadirNota(rnd.nextInt(11));
        alumno1.añadirNota(rnd.nextInt(11));
        
        alumno2.añadirNota(rnd.nextInt(11));
        alumno2.añadirNota(rnd.nextInt(11));
        alumno2.añadirNota(rnd.nextInt(11));
        
        alumno3.añadirNota(rnd.nextInt(11));
        alumno3.añadirNota(rnd.nextInt(11));
        alumno3.añadirNota(rnd.nextInt(11));
        
        alumno4.añadirNota(rnd.nextInt(11));
        alumno4.añadirNota(rnd.nextInt(11));
        alumno4.añadirNota(rnd.nextInt(11));
        
        alumno5.añadirNota(rnd.nextInt(11));
        alumno5.añadirNota(rnd.nextInt(11));
        alumno5.añadirNota(rnd.nextInt(11));
        
        //se comprueba si el alumno esta aprobado
        alumno1.comprobarAprobado();
        alumno2.comprobarAprobado();
        alumno3.comprobarAprobado();
        alumno4.comprobarAprobado();
        alumno5.comprobarAprobado();
        
        //se muestran los datos de los alumnos
        System.out.println(alumno1.datosDelAlumno());
        System.out.println(alumno2.datosDelAlumno());
        System.out.println(alumno3.datosDelAlumno());
        System.out.println(alumno4.datosDelAlumno());
        System.out.println(alumno5.datosDelAlumno());
    }
}
