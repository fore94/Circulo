package repository;

import java.io.*;
import java.util.Scanner;

public class areaCirculo
{
	public static void main(String args[])
	{
	double radio=0.0, area;
	final double PI=3.14;
	
	/* Creamos el objeto Scanner*/
	Scanner teclado= new Scanner(System.in);
		
	//Obtener datos
	System.out.println("Introdudizca el radio:");
	radio = teclado.nextInt();
	
	//Calcular área
	area = PI*(radio*radio);
	
	//Mostrar resultados
	System.out.println("El área del circulo es "+area);
	}
}
