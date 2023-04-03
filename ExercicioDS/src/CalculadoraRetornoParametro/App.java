package CalculadoraRetornoParametro;

import java.util.Scanner;


public class App {


	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		int repete;
		
		do {
			
			calc.fazerEscolha();
			
	
			
			System.out.println("Deseja refazer a execução? 1-SIM ou 2-NÃO");
			repete = ler.nextInt();
			}while (repete == 1);
		

	}
}


