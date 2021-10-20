package es.studium.tabla3;

import java.util.Scanner;

public class tabla3
{

	public static void main(String[] args)
	{
		final int fila = 5;
		final int columna = 5;
		int tabla[][]=new int[fila][columna];
		int i,j;
		Scanner teclado = new Scanner (System.in);
		for (i=0;i<fila;i++)
		{
			for(j=0;j<columna;j++)
			{
			System.out.println("Ingrese el valor de la posicion " +i+","+j+":");
			tabla[i][j]=teclado.nextInt();
			}
				for(i=0;i<fila;i++)
				{
					for (j=0;j<columna;j++)
					{
						System.out.println("tabla["+i+"]["+j+"]="+tabla[i][j]);
					}
				}
		}
		teclado.close();
	}

}
