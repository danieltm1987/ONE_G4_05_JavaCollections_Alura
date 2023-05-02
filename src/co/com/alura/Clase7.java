package co.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import co.com.alura.model.Aula;
import co.com.alura.model.Curso;

public class Clase7 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 7:Trabajando con ArrayList de Objetos !!!\n");
		
		Curso curso1 = new Curso("Java", 30, new ArrayList<>());
		curso1.addAula(new Aula("ArrayList"));
		curso1.addAula(new Aula("List"));
		curso1.addAula(new Aula("LinkedList"));
		curso1.addAula(new Aula("Inmutable"));
		
		List<Aula> aulaList = curso1.getAulaList();
		 
		//aulaList.add(new Aula("Inmutable"));  //No se puede agregar ya que se convirtio en inmutable
				
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		
		
		System.out.println("Clase 7:Imprimiedo el ArrayList de Objetos !!!\n");
		System.out.println(cursos.get(0).getAulaList());
		
		System.out.println("\nClase 7:Imprimiendo el AUla List !!!\n"+aulaList);	
		
	}

}