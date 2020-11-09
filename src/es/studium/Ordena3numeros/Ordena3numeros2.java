package es.studium.Ordena3numeros;

import java.util.Scanner;

public class Ordena3numeros2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		System.out.println( "Dame el primer número" );
		a=teclado.nextInt();
		System.out.println( "Dame el segundo número" );
		b=teclado.nextInt();
		System.out.println( "Dame el tercer número");
		c=teclado.nextInt();
		teclado.close();
		if (a>=b && b>=c)
		{
			System.out.println( "Los números ordenados de mayor a menor son: "+a+","+b+","+c);
		}
		else if(a>=c && a>=b)
		{
			System.out.println("Los números ordenados de mayor a menor son: "+a+","+c+","+b);
		}
		else if(b>=a && a>=c )
		{
			System.out.println("Los números ordenados de mayor a menor son: "+b+","+a+","+c);
		}
		else if(b>=c && c>=a)
		{
			System.out.println("Los números ordenados de mayor a menor son: "+b+","+c+","+a);
		}
		else if( c>=a && a>=b )
		{
			System.out.println("Los números ordenados de mayor a menor son: "+c+","+a+","+b);
		}
		else 
		{
			System.out.println("Los números ordenados de mayor a menor son: "+c+","+b+","+a);
		}
	}

}

