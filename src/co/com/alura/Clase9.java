package co.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import co.com.alura.model.Aula;
import co.com.alura.model.Curso;

public class Clase9 {
	
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<Integer>());
			add(new ArrayList<Integer>());
		}		
	};

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 9:Collections y Stream !!!\n");
		
		Curso curso1 = new Curso("Historia", 30);
		Curso curso2 = new Curso("Algebra", 10);
		Curso curso3 = new Curso("Aritmetica", 20);
		Curso curso4 = new Curso("Geometria", 50);
		;
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println("Clase 9:Imprimiedo el ArrayList de Objetos !!!\n");
		System.out.println(cursos);
		
		System.out.println("Clase 9:Ordenamiento con Colletions !!!");
		
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
		System.out.println("\nOrdenado con Colletions : \n"+cursos);
		
		int tiempo = 0;
		for (Curso curso: cursos) {
			tiempo += curso.getTiempo();
		}
		
		System.out.println("Tiempo con FOR : "+tiempo);
		
		System.out.println("Tiempo Con Stream :"+cursos.stream().mapToInt(Curso::getTiempo).sum());
		
		System.out.println("Tiempo Maximo Con Stream :"+cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		
		System.out.println("Tiempo Maximo sin Historia Con Stream :"+cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());
						
		
		
	}

}