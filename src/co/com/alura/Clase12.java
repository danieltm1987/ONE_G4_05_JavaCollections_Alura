package co.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Clase12 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 12:Trabajando con Set y HashSet !!!\n");
		
		String alumno1 = "Daniel Alfonso";
		String alumno2 = "Luis Miguel";
		String alumno3 = "Jose";
		String alumno4 = "Maria Jose";
		String alumno5 = "Maria Alejandra";
		String alumno6 = "Mafe Roca";
		String alumno7 = "Michelle";
		String alumno8 = "Mafe Roca";
		String alumno9 = "Michelle";
		
		Set<String> listaAlumnos = new HashSet<>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		listaAlumnos.add(alumno9);
		
		
		System.out.println(listaAlumnos);
		
		for (String alumno: listaAlumnos) {
			System.out.println("desde for : "+alumno);
		}
		
		listaAlumnos.forEach(alumno ->{System.out.println("Usando Lambda :"+alumno);});
		
		System.out.println("\nCambiando intefaz Set por Colletion Y HashSet por ArrayList\n");
		
		Collection<String> listaAlumnosII = new ArrayList<>();
		listaAlumnosII.add(alumno1);
		listaAlumnosII.add(alumno2);
		listaAlumnosII.add(alumno3);
		listaAlumnosII.add(alumno4);
		listaAlumnosII.add(alumno5);
		listaAlumnosII.add(alumno6);
		listaAlumnosII.add(alumno7);
		listaAlumnosII.add(alumno8);
		listaAlumnosII.add(alumno9);
		
		
		System.out.println(listaAlumnosII);
		
		for (String alumnosI: listaAlumnosII) {
			System.out.println("desde for : "+alumnosI);
		}
		
		listaAlumnosII.forEach(alumnosII ->{System.out.println("Usando Lambda :"+alumnosII);});

	}

}
