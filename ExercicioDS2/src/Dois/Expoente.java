package Dois;

import java.util.Scanner;

public class Expoente {
	
	public void fazerOperacao( double base, double expoente, double resultado) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a base: ");
		base = ler.nextDouble();
		System.out.println("Digite o expoente: ");
		expoente = ler.nextDouble();
		
	if(expoente==0) {
		expoente=1;
	}else {
		for(int i=1; i<expoente; i++) {
			if(i==1) {
				resultado = base*base;
			}
			else {
				resultado = resultado*base;
			}
		}
	System.out.println("Resultado: "+resultado);
	}
}
}