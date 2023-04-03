package Tabuada;

import java.util.Scanner;

public class Tabuada {

	public int numero, resultado = 0;
	public void lerNumero() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva um número para ser tabuado: ");
		numero = ler.nextInt();
		System.out.println("Tabuada do: "+numero);
		}
	public int calcularTabuada() {
		
		for(int i = 1; i<=10 ; i++) {
			resultado = numero * i;
			
			System.out.println(numero + "*" + i + "=" + resultado);
		}
		return resultado;
	}
}
