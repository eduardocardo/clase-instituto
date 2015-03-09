
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    //indica el nombre del alumno
    private String nombre;
    //indica la edad del alumno
    private int edad;
    //indica una serie de notas del alumno
    private int[] notas;
    //indica la media de las notas del alumno
    private int media;
    //indica el numero de clase del alumno
    private static int numeroClase;
    //indica la nota de corte para aprobar
    private static final int NOTA_APROBADO = 5;
    //indica si el alumno esta aprobado
    private String calificacionFinal;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre,int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        notas = new int[0];
        media = 0;
        numeroClase = 1;
        calificacionFinal = "suspenso";
    }

    /**
     * Metodo que añade notas al alumno
     * @param nota es la nota que se quiere añadir al alumno
     */
    public void añadirNota(int nota)
    {
        //se crea un array temporal que aumenta de tamaño cada vez que se introduce una nota
        int[] temp = new int[notas.length + 1];
        //introducimos la nota al alumno
        temp[temp.length - 1] = nota;
        for(int i = 0; i < notas.length; i++)
        {
            //se almacena en el array temporal los valores del array de notas
            temp[i] = notas[i];
        }
        notas = temp;
    }

    /**
     * Metodo que calcula la nota media de un alumno
     * @return la nota media del alumno
     */
    public int calcularNotaMedia()
    {
        //variable local donde se almacena la suma de las notas del alumno
        int totalNotas = 0;
        for(int i = 0; i < notas.length; i++)
        {
            totalNotas += notas[i];
        }

        //si no se ha introducido ninguna nota
        if(notas.length == 0)
        {
            media = 0;  //la media sera 0
        }
        else
        {
            //se calcula la media
            media = totalNotas/notas.length;
        }

        return media;
    }

    /**
     * Metodo que indica si el alumno esta aprobado o no
     * @return aprobado si la nota media es mayor o igual a NOTA_APROBADO y suspenso si es menor
     */
    public String comprobarAprobado()
    {
        if(calcularNotaMedia() >= NOTA_APROBADO)
        {
            calificacionFinal = "aprobado";
        }
        return calificacionFinal;
    }
}
