package co.com.alura;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import co.com.alura.model.*;

public class Clase15 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 15:Trabajando con Set y HashSet !!!\n");
		
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
		
		Alumno alumnoNuevo = new Alumno("Daniel Alfonso","001");
		
		System.out.println("Comparando objetos con Equal en @Override :"+alumno1.equals(alumnoNuevo));
		
		System.out.println("Comparando Objetos II :"+curso1.getAlumnos().contains(alumnoNuevo));
		
		System.out.println("\nImpriminedo Lista :"+curso1);
		
		for (Alumno alumnosI: curso1.getAlumnos()) {
			System.out.println("desde for : "+alumnosI.getCodigo()+" - "+alumnosI.getNombre());
		}
		
		curso1.getAlumnos().forEach(alumnosII ->{System.out.println("Usando Lambda :"+alumnosII);});		
		
		System.out.println(curso1);
		System.out.println(curso1.getAlumnos());
		
		//System.out.println("El alumno a buscar :"+listaAlumnosII.stream().filter(alumno -> alumno.equalsIgnoreCase("Gustavo Polar")).findFirst().orElse("No Existe"));
		
		System.out.println("\nCodigos de Alumnos :");
		curso1.getAlumnos().stream().sorted(Comparator.comparing(Alumno::getCodigo).reversed()).forEach(alumno -> System.out.println(alumno.getCodigo()));

	}
}
