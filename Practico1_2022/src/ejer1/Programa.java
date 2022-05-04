package ejer1;
import java.util.Scanner;

public class Programa {
	Scanner teclado=new Scanner(System.in);
	String apellido;
	int edad, cedula;
	double altura;
	
	public void iniciar() {
		cargar();
		imprimir();
		
	}//iniciar

	private void cargar() {
		
		System.out.println("Ingrese su apellido: ");
		apellido=teclado.nextLine();
		
		System.out.println("Ingrese su cedula: ");
		cedula=teclado.nextInt();
		
		System.out.println("Ingrese su edad: ");
		edad=teclado.nextInt();
		
		System.out.println("Ingrese su altura: ");
		altura=teclado.nextDouble();
		
	}//cargar
	
	private void imprimir() {
		System.out.println("Apellido: "+apellido);
		System.out.println("Cedula: "+cedula);
		System.out.println("Edad: "+edad);
		System.out.println("Altura: "+altura);
		
		
	}//imprimir
	
}//Clase
