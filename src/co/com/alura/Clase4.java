package co.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import co.com.alura.model.Curso;

public class Clase4 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 4:Trabajando con ArrayList de Objetos !!!\n");
		
		Curso curso1 = new Curso("Geometria", 30);
		Curso curso2 = new Curso("Fisica", 10);
		Curso curso3 = new Curso("Quimica", 20);
		Curso curso4 = new Curso("Historia", 50);
		;
		
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println("Clase 4:Imprimiedo el ArrayList de Objetos !!!\n");
		System.out.println(cursos);
		
		

	}

}