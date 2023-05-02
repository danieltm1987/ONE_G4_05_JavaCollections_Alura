package co.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import co.com.alura.model.Curso;

public class Clase10 {
	
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = -2495555889458288265L;

		{
			add(new LinkedList<Integer>());
			add(new ArrayList<Integer>());
		}		
	};

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 10:Collections y Stream !!!\n");
		
		Curso curso1 = new Curso("Historia", 30);
		Curso curso2 = new Curso("Algebra", 10);
		Curso curso3 = new Curso("Aritmetica", 20);
		Curso curso4 = new Curso("Geometria", 50);
		Curso curso5 = new Curso("Fisica", 60);
		Curso curso6 = new Curso("Quimica", 80);
		Curso curso7 = new Curso("Geografia", 70);
		Curso curso8 = new Curso("Educacion Fisica", 30);
		Curso curso9 = new Curso("Fisica", 30);
		Curso curso10 = new Curso("Quimica", 70);
		Curso curso11 = new Curso("Literatura", 70);
		;
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		cursos.add(curso7);
		cursos.add(curso8);
		cursos.add(curso9);
		cursos.add(curso10);
		cursos.add(curso11);
		
		System.out.println("Clase 10:Imprimiedo el ArrayList de Objetos !!!\n");
		System.out.println(cursos);
		
		System.out.println("Clase 10:Ordenamiento con Colletions !!!");
		
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
		System.out.println("\nOrdenado con Colletions : \n"+cursos);
		
		int suma = 0;
		for (Curso curso: cursos) {
			if(!curso.getNombre().equalsIgnoreCase("historia")) {
				suma += curso.getTiempo();
			}			
		}
		
		System.out.println("Tiempo con FOR : "+suma);
		
		System.out.println("Tiempo Con Stream :"+cursos.stream().mapToInt(Curso::getTiempo).sum());
		
		System.out.println("Tiempo Maximo Con Stream :"+cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		
		System.out.println("Tiempo Maximo sin Historia Con Stream :"+cursos.stream().mapToInt(Curso::getTiempo).sum());
		
		System.out.println("Tiempo Promedio Con Stream :"+cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
		
		System.out.println("Tiempo Promedio Con Stream :"+cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());					
		
		Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
		
		System.out.println("Clase 10:Agrupando con steam en un MAP<> !!!\n"+groupCurso);
		
		groupCurso.forEach((Key, Value) -> System.out.println(Key + " - " + Value.size()));
		
		System.out.println("Clase 10: Usando ParallelStream :\nSuma Tiempos :"+cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
		
		System.out.println("Agregando Literatura y excluyendo Geometria:"+cursos.parallelStream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Geometria")).mapToInt(Curso::getTiempo).sum());
		
	}

}