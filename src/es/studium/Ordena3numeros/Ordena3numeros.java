package es.studium.Ordena3numeros;

import java.util.Scanner;

public class Ordena3numeros
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
		if(a>b)
		{
			if(b>c)
				{
					System.out.println("Los numeros ordenados son="+c+b+a);
				}
			else
			{
				if(a>c)
				{
					System.out.println( "Los numeros ordenados son=" + b+c+a);
				}
				else
				{
					System.out.println("Los numeros ordenados son=" + b+a+c);
				}
			}
		}
		else
		{
			if(a>c)
			{
				System.out.println("Los numeros ordenados son="+ c+a+b);
			}
			else
			{
				if(b>c)
				{
					System.out.println( "Los numeros ordenados son=" + a+c+b);
				}
				else
				{
					System.out.println("Los numeros ordenados son=" +a+b+c);
					
				}
			}
		}
	}
}



/*
Programa 17

VARIABLES
    ENTERO a,b,c
INICIO
    ESCRIBIR "INGRESE LOS NUMEROS"
    Leer a,b,c
	SI a > b ENTONCES
    	SI b>c ENTONCES
        	ESCRIBIR "Los numeros ordenados son=" c,b,a
    	SINO
        	SI a>c ENTONCES
            	ESCRIBIR "Los numeros ordenados son=" b, c, a
        	SINO
            	ESCRIBIR "Los numeros ordenados son=" + b, a, c
        	FINSI
    	FINSI
	SINO
    	SI a>c ENTONCES
        	ESCRIBIR "Los numeros ordenados son=" + c , a, b
    	SINO
        	SI b>c ENTONCES
            	ESCRIBIR "Los numeros ordenados son=" + a, c, b
        	SINO
            	ESCRIBIR "Los numeros ordenados son=" + a, b, c
        	FINSI
    	FINSI
	FINSI
FIN*/