package P1;

import P1.IAlumno.Alumno;
import static P1.IAlumno.imprimeArrayAlumnos;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        Alumno[] arrayAlumnos = new Alumno[7];
        arrayAlumnos[0] = new Alumno("Matias", "Fernandez", "Andres", "Masculino", "Ninguna", 4.0);
        arrayAlumnos[1] = new Alumno("Fernando", "Oñate", "Angel", "Masculino", "Ninguna", 3.2);
        arrayAlumnos[2] = new Alumno("Rodrigo", "Muñoz", "Francis", "Masculino", "Ninguna", 3.5);
        arrayAlumnos[3] = new Alumno("Andrea", "Ramos", "Marcos", "Femenino", "Ninguna", 2.5);
        arrayAlumnos[4] = new Alumno("Camila", "Montero", "Franco", "Femenino", "Ninguna", 1.5);
        arrayAlumnos[5] = new Alumno("Alejandra", "Carvajal", "Juan", "Femenino", "Ninguna", 3.1);
        arrayAlumnos[6] = new Alumno("Eduardo", "Quintero", "Emanuel", "Masculino", "Ninguna", 1.0);
        
        System.out.println("Alumnos sin ordenar");
        System.out.println("Asignatura: Algortimos Y Programacion III");
        System.out.println("-------------------------------------------------");
        imprimeArrayAlumnos(arrayAlumnos);
        Arrays.sort(arrayAlumnos);
        System.out.println("\nOrdenamiento de Acuerdo a la Nota Final");
        System.out.println("Asignatura: Algortimos Y Programacion III");
        System.out.println("---------------------------------------------------");
        imprimeArrayAlumnos(arrayAlumnos);
        
    
}
    
}