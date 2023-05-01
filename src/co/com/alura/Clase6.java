package co.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import co.com.alura.model.Clase;
import co.com.alura.model.Curso;

public class Clase6 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 6:Trabajando con ArrayList de Objetos !!!\n");
		
		Curso curso1 = new Curso("Java", 30, new ArrayList<>());
		curso1.addClase(new Clase("ArrayList"));
		curso1.addClase(new Clase("List"));
		curso1.addClase(new Clase("LinkedList"));
		
				
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		
		
		System.out.println("Clase 6:Imprimiedo el ArrayList de Objetos !!!\n");
		System.out.println(cursos.get(0).getClaseList());
		
		System.out.println("Clase 6:Ordenamiento con Colletions !!!\n");
		
		/*
		cursos.sort(Comparator.reverseOrder());
		System.out.println("Inverso :\n"+cursos);
		
		Collections.sort(cursos);
		System.out.println("\nOrdenado con Colletions : \n"+cursos);
		
		Collections.sort(cursos, Comparator.reverseOrder());
		System.out.println("\nRevers Order con Colletions : \n"+cursos);
		
		cursos.sort(Comparator.comparing(Curso::getNombre));
		System.out.println("\nCon lambda, Ordenamiento por Atributo Nombre : \n"+cursos);
		
		
		List<Curso> cursoList = cursos.stream().sorted(Comparator.comparing(Curso::getTiempo)).collect(Collectors.toList());
		System.out.println("\nCon Stream, ordenamiento por atributo Tiempo : \n"+cursoList);
		
		List<Curso> cursoList2 = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparing(Curso::getTiempo)).collect(Collectors.toList());
		System.out.println("\nCon Stream, ordenamiento por atributo Tiempo y agregando filtros : \n"+cursoList2);
		*/

	}

}