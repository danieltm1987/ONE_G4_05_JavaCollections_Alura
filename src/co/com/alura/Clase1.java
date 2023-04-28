package co.com.alura;

import java.util.ArrayList;

public class Clase1 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 1: Trabajando con ArrayList !!!\n");
		
		String variable1 = "Ejemplo1";
		String variable2 = "Ejemplo2";
		String variable3 = "Ejemplo3";
		String variable4 = "Ejemplo4";
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		
		System.out.println(lista);
		
		System.out.println("Se elimina del ArrayList en la posicion "+2+" el valor :"+lista.get(2));
		lista.remove(2);		
		System.out.println(lista);
		
		System.out.println("Se modifica del ArrayList en la posicion "+2+" el valor :"+lista.get(2));
		lista.set(2,"Ejemplo modificado");
		System.out.println(lista);
		
		System.out.println("El tamaño del ArrayList es de : "+lista.size());

	}

}
