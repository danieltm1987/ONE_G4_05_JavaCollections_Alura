package co.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 3:Trabajando con ArrayList !!!\n");
		
		String curso1 = "Geometria";
		String curso2 = "Fisica";
		String curso3 = "Quimica";
		String curso4 = "Historia";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		System.out.println("Clase 3:Ordenado ArrayList con Colletions !!!\n");
		
		Collections.sort(cursos);
		System.out.println("Lista Ordenada : \n"+cursos);
		
		Collections.sort(cursos, Collections.reverseOrder());
		System.out.println("Lista Invertida : \n"+cursos);
		
		Collections.sort(cursos);
		System.out.println("Lista Ordenada otravez : \n"+cursos);
		
		cursos.sort(Comparator.reverseOrder());
		System.out.println("Lista Invertida con fuccines de ArrayList : \n"+cursos);
		
		cursos.sort(Comparator.naturalOrder());
		System.out.println("Lista con natural Order : \n"+cursos);
		cursos.sort(Comparator.reverseOrder());
		System.out.println("Revertimosr : \n"+cursos);
		
		List<String> cursoList = cursos.stream().sorted().collect(Collectors.toList());
		System.out.println("Lista Ordenada como Stream : \n"+cursoList);
		

	}

}



