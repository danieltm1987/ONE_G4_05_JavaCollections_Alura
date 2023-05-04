package co.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Clase13 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 13:Trabajando con Set y HashSet !!!\n");
		
		String alumno1 = "Daniel Alfonso";
		String alumno2 = "Luis Miguel";
		String alumno3 = "Jose";
		String alumno4 = "Maria Jose";
		String alumno5 = "Maria Alejandra";
		String alumno6 = "Mafe Roca";
		String alumno7 = "Michelle";
		String alumno8 = "Mafe Roca";
		String alumno9 = "Michelle";
		String alumno10 = "null"; //Gustavo Polar
		
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
		listaAlumnosII.add(alumno10);
		
		System.out.println(listaAlumnosII);
		
		for (String alumnosI: listaAlumnosII) {
			System.out.println("desde for : "+alumnosI);
		}
		
		listaAlumnosII.forEach(alumnosII ->{System.out.println("Usando Lambda :"+alumnosII);});
		
		boolean valida = listaAlumnosII.contains("Maria Jose");
		System.out.println("¿Existe MARIA JOSE ? "+valida);
		
		String maximo = listaAlumnosII.stream().max(Comparator.comparingInt(String::length)).get();		
		
		System.out.println("Alumno con mas candidad de letras :"+maximo+" con :"+maximo.length() );
		
		listaAlumnosII.removeIf(alumno -> "Michelle".equalsIgnoreCase(alumno));
		
		System.out.println(listaAlumnosII);
		
		System.out.println("El alumno a buscar :"+listaAlumnosII.stream().filter(alumno -> alumno.equalsIgnoreCase("Gustavo Polar")).findFirst().orElse("No Existe"));

	}

}
