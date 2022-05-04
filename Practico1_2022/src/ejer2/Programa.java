package ejer2;
import java.util.Scanner;
import java.util.Random;

public class Programa {
	Random azar=new Random();
	void iniciar(){
			
			int valor=generarAleatorio(); //numero maquina
			int num;
			int resul;
			
			do{
				num=pedirNumero(); //numero usuario
				resul=compararNumeros(num, valor);
				
				if (resul==-1)
					System.out.println("Demasiado chico");
				
				else if (resul==1)
					System.out.println("Demasiado grande");
					
				else 
					System.out.println("El numero era: "+num);
				
			}while(resul!=0);
			System.out.println("Felicitaciones acertaste!!");
		}
		
		//devuelve un numero aleatorio entre 1 y 1000
		int generarAleatorio(){
			int valor=azar.nextInt(1000);
			return valor; 
			
		}
		
		//pide un nro por pantalla
		 int pedirNumero(){
			 System.out.println("Ingrese numero : ");
			 Scanner entrada=new Scanner(System.in);
			 int a=entrada.nextInt();
			 return a;  
			 
			//completar aquí
			 
		 }
		
		 //compara dos enteros a y b. Devuelve un String indicando si es menor, mayor o igual
		 int compararNumeros(int a, int b){
			 	
			int resul;
				if(a>b)
					resul=1;
				else if(a<b)
					resul=-1;
				else
					resul=0;
			 	
		return resul;		
				 
				 
			 
			 
		
		 }//com num

}


