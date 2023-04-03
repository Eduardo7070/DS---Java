package CalculadoraNormal;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Calculo calc = new Calculo();
		
		int escolha, repete;
		do {
		calc.fazerEscolha();
		System.out.println("Deseja refazer a execução? 1 para SIM ou 2 para NÃO");
		repete = ler.nextInt();
		}while (repete == 1);
	}
	

}