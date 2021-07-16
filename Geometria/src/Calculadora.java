import java.util.Scanner;

public class Calculadora {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		//cuadrado
		Cuadrado cuadrado1 = new Cuadrado();
		System.out.println("¿cuanto mide de lado tu cuadrado amigo?");
		cuadrado1.parametro = lector.nextFloat();
		//area
		System.out.println("el area de tu cuadrado es " +cuadrado1.area());
		
		//Circulo
		Circulo circulo1 = new Circulo();
		System.out.println("¿cuanto mide de radio tu circulo amigo?");
		circulo1.parametro = lector.nextFloat();
		//area
		System.out.println("el area de tu circulo es " +circulo1.area());
		
		//Triangulo
		Triangulo triangulo1 = new Triangulo();
		System.out.println("¿cuanto mide de altura tu Trianguo amigo?");
		triangulo1.parametro = lector.nextFloat();
		System.out.println("¿cuanto mide de base tu Trianguo amigo?");
		triangulo1.base = lector.nextFloat();		
		//area
		System.out.println("el area de tu triangulo es " +triangulo1.area());
		
		lector.close();
	}

}

/*Crea una clase padre FigurasGeometricas con un método calcular área. 
 * Escribir 3 clases hijos que hereden de figuras geométricas, 
 * definir los atributos y métodos necesarios para calcular el área, 
 * y al final crear objetos de esas 3 clases que sean capaces 
 * de calcular las respectivas areas
 */
