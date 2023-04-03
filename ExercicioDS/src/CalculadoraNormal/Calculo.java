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
		System.out.println("A soma é de: "+soma);
	}
	public void  fazerSub() {	
	System.out.println("Escolha dois numeros para a Subtração");
		Scanner in = new Scanner(System.in);
		num1= in.nextDouble();
		num2 = in.nextDouble();
		sub = num1-num2;
		System.out.println("A subtração é de: "+sub);
	}
	public void  fazerMult() {
		System.out.println("Escolha dois numeros para a Multiplicação");
		Scanner in = new Scanner(System.in);
		num1= in.nextDouble();
		num2 = in.nextDouble();
		mult = num1*num2;
		System.out.println("A multiplicação é de: "+mult);
	}
	public void  fazerDiv() {
		System.out.println("Escolha dois numeros para a Divisão");
		Scanner in = new Scanner(System.in);
		num1= in.nextDouble();
		num2 = in.nextDouble();
		div = num1/num2;
		if(num2 == 0) {
			System.out.println("Não Existe Divisão por 0");
		}
		System.out.println("A divisão é de: "+div);
	}
	public void fazerEscolha() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha:\n 1-Soma\n 2-Subtração\n 3-Multiplicação\n 4-Divisão");
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
			System.out.println("Numero não registrado");
		}
	}
	
	

}
