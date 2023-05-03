package co.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Clase11 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 2:Trabajando con ArrayList !!!\n");
		
		String alumno1 = "Daniel Alfonso";
		String alumno2 = "Luis Miguel";
		String alumno3 = "Jose";
		String alumno4 = "Maria Jose";
		String alumno5 = "Maria Alejandra";
		String alumno6 = "Mafe Roca";
		String alumno7 = "Michelle";
		
		Set<String> listaAlumnos = new HashSet<>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		
		
		System.out.println(listaAlumnos);
		
		for (String alumno: listaAlumnos) {
			System.out.println("desde for : "+alumno);
		}
		
		

	}

}
