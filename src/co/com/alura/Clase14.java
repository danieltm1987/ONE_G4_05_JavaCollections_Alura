package co.com.alura;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import co.com.alura.model.*;

public class Clase14 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 14:Trabajando con Set y HashSet !!!\n");
		
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
		
		//Collection<Alumno> listaAlumnosII = new HashSet<>();		
		Collection<Alumno> listaAlumnosII = new ArrayList<>();
		
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
		
		Alumno alumnoNuevo = new Alumno("Daniel Alfonso","001");
		
		System.out.println("Comparando objetos con Equal en @Override :"+alumno1.equals(alumnoNuevo));
		
		System.out.println("Comparando Objetos II :"+listaAlumnosII.contains(alumnoNuevo));
		
		System.out.println("\nImpriminedo Lista :"+listaAlumnosII);
		
		for (Alumno alumnosI: listaAlumnosII) {
			System.out.println("desde for : "+alumnosI.getCodigo()+" - "+alumnosI.getNombre());
		}
		
		listaAlumnosII.forEach(alumnosII ->{System.out.println("Usando Lambda :"+alumnosII);});
		
		boolean valida = listaAlumnosII.contains("Maria Jose");
		
		System.out.println("¿Existe MARIA JOSE ? "+valida);
		
		System.out.println(listaAlumnosII);
		
		//System.out.println("El alumno a buscar :"+listaAlumnosII.stream().filter(alumno -> alumno.equalsIgnoreCase("Gustavo Polar")).findFirst().orElse("No Existe"));

	}
}

