package co.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import co.com.alura.model.Aula;
import co.com.alura.model.Curso;

public class Clase8 {
	
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<Integer>());
			add(new ArrayList<Integer>());
		}		
	};

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 8:diferencias entre ArrayList y LinkedList !!!\n");
		
		for (List<Integer> lista:listas) {
			final String nombreImplementacion = lista.getClass().getSimpleName();
			//add
			long inicio = System.currentTimeMillis();
			for(int i =0; i< 10000; i++) {
				lista.add(i);
			}
			long fin = System.currentTimeMillis();
			long duracion = fin -inicio;
			System.out.println(nombreImplementacion+" add: " + duracion);

			//get
			inicio = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				lista.get(i);
			}
			fin = System.currentTimeMillis();
			duracion = fin - inicio;
			System.out.println(nombreImplementacion+" get: " + duracion);
			
			//remove
			
			inicio = System.currentTimeMillis();
			for (int i = 9999; i >=0; i--) {
				lista.remove(i);
			}
			fin = System.currentTimeMillis();
			duracion = fin - inicio;
			System.out.println(nombreImplementacion+" remove: "+ duracion);
			
		}	
		
		
	}

}