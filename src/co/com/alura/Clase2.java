package co.com.alura;

import java.util.ArrayList;

public class Clase2 {

	public static void main(String[] args) {
		System.out.println("Bienvenido a el curso de Java: Dominando Colletions !!!");
		
		System.out.println("Clase 2:Trabajando con ArrayList !!!\n");
		
		String variable1 = "Ejemplo1";
		String variable2 = "Ejemplo2";
		String variable3 = "Ejemplo3";
		String variable4 = "Ejemplo4";
		
		ArrayList<String> listaString = new ArrayList<>();
		listaString.add(variable1);
		listaString.add(variable2);
		listaString.add(variable3);
		listaString.add(variable4);
		
		System.out.println(listaString);
		
		System.out.println("Se elimina del ArrayList en la posicion "+2+" el valor :"+listaString.get(2));
		listaString.remove(2);		
		System.out.println(listaString);
		
		System.out.println("Se modifica del ArrayList en la posicion "+2+" el valor :"+listaString.get(2));
		listaString.set(2,"Ejemplo modificado");
		System.out.println(listaString);
		
		System.out.println("El tamaño del ArrayList es de : "+listaString.size());
		
		System.out.println("\nRecorriendo un ArrayList !!!\n");
		
		System.out.println("Recorriendo un ArrayList con FOR !!!\n");
		for (int i = 0; i < listaString.size(); i++) {
			System.out.println(listaString.get(i));			
		}
		
		System.out.println("\nRecorriendo un ArrayList con FOREACH !!!\n");
		
		for (String clase : listaString) {
			System.out.println(clase);
		}
		
		System.out.println("\nRecorriendo un ArrayList con FOREACH - LAMBDA!!!\n");
		
		listaString.forEach(clase ->{System.out.println(clase);});
			 

	}

}
