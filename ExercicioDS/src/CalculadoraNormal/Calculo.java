package CalculadoraNormal;

import java.util.Scanner;


public class Calculo {
	public double num1,num2,soma,mult,sub,div;
	public int escolha;
	
	
	
	public void  fazerSoma() {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha dois numeros para a Soma");
		num1= in.nextDouble();
		num2 = in.nextDouble();
		soma = num1+num2;
		System.out.println("A soma � de: "+soma);
	}
	public void  fazerSub() {	
	System.out.println("Escolha dois numeros para a Subtra��o");
		Scanner in = new Scanner(System.in);
		num1= in.nextDouble();
		num2 = in.nextDouble();
		sub = num1-num2;
		System.out.println("A subtra��o � de: "+sub);
	}
	public void  fazerMult() {
		System.out.println("Escolha dois numeros para a Multiplica��o");
		Scanner in = new Scanner(System.in);
		num1= in.nextDouble();
		num2 = in.nextDouble();
		mult = num1*num2;
		System.out.println("A multiplica��o � de: "+mult);
	}
	public void  fazerDiv() {
		System.out.println("Escolha dois numeros para a Divis�o");
		Scanner in = new Scanner(System.in);
		num1= in.nextDouble();
		num2 = in.nextDouble();
		div = num1/num2;
		if(num2 == 0) {
			System.out.println("N�o Existe Divis�o por 0");
		}
		System.out.println("A divis�o � de: "+div);
	}
	public void fazerEscolha() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha:\n 1-Soma\n 2-Subtra��o\n 3-Multiplica��o\n 4-Divis�o");
		escolha = ler.nextInt();
		
		if(escolha==1) {
			fazerSoma();
		}
		else if(escolha==2){
			fazerSub();
		}
		else if(escolha==3){
			fazerMult();
		}
		else if(escolha==4) {
			fazerDiv();
		}
		else {
			System.out.println("Numero n�o registrado");
		}
	}
	
	

}
