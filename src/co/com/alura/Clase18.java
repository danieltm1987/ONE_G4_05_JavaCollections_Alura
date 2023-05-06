package co.com.alura;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;

import co.com.alura.model.*;

public class Clase18 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 18:Trabajando con Maps !!!\n");
		
		Curso curso1 = new Curso("Historia", 30);
		
		Alumno alumno1 = new Alumno("Daniel Alfonso","001");
		Alumno alumno2 = new Alumno("Luis Miguel","002");
		Alumno alumno3 = new Alumno("Jose","003");
		Alumno alumno4 = new Alumno("Maria Jose","004");
		Alumno alumno5 = new Alumno("Maria Alejandra","005");
		Alumno alumno6 = new Alumno("Mafe Roca","006");
		Alumno alumno7 = new Alumno("Michelle","007");
		Alumno alumno8 = new Alumno("Mafe Roca","008");
		Alumno alumno9 = new Alumno("Michelle","010");
		Alumno alumno10 = new Alumno("Gustavo Polar","052");
		
		
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		curso1.addAlumno(alumno7);
		curso1.addAlumno(alumno8);
		curso1.addAlumno(alumno9);
		curso1.addAlumno(alumno10);
		
		System.out.println("Clase 18:Imprimiendo Listado de Alumnos!!!\n");
		curso1.getAlumnos().forEach(alumno -> System.out.println("Alumno :"+alumno));
		
		System.out.println("\nClase 18:Usando MAP !!!\n");
		
		Optional<Alumno> alumnos = curso1.getAlumnos().stream().filter(a -> "003".equalsIgnoreCase(a.getCodigo())).findFirst();
		
		if(alumnos.isPresent()) {
			System.out.println("Alumnos:"+alumnos.get());
		}
		
		Alumno alumnoMap = curso1.getAlumnoMap().get("003");
		
		System.out.println("\nClase 18:Metodos de Maps !!!\n"+alumnoMap);
		

	}
}
