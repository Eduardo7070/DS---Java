package CalculadoraRetornoParametro;

import java.util.Scanner;
public class Calculadora {
	
	//Sem parametro e Sem retorno
	public double num1,num2,soma,mult,sub,div;
	public int escolha, repete;
	
	Scanner ler = new Scanner(System.in);

	
	public void  fazerOperacao1() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha dois numeros para a Soma");
		num1= ler.nextDouble();
		num2 = ler.nextDouble();
		soma = num1+num2;
		System.out.println("A soma é de: "+soma);
	}

	//Sem parametro e com retorno

	public double  fazerOperacao() {	
	System.out.println("Escolha dois numeros para a Subtração");
		Scanner ler = new Scanner(System.in);
		num1= ler.nextDouble();
		num2 = ler.nextDouble();
		sub = num1-num2;
	
		return sub;
	}
	
	//Com parametro e sem retorno
	
	public void fazerOperacao( double sub, double n1, double n2) {
		Scanner ler = new Scanner(System.in);
	
		
		System.out.println("Digite dois Números para a multiplicação: ");
		n1 = ler.nextDouble();
		n2 = ler.nextDouble();
		mult = n1*n2;
		System.out.println("A multiplicação é de: "+mult);
		
	}
	//Com parametro e com Retorno
	public double fazerOperacao1( double div, double numero1, double numero2) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite dois Números para a divisão: ");
		numero1 = ler.nextDouble();
		numero2 = ler.nextDouble();
	
		div = numero1/numero2;
		if(numero2 == 0) {
			System.out.println("Não existe Divisão por 0");
		}
		
		return div;
	}
	
		
	
	public void  fazerEscolha() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha:\n 1-Soma\n 2-Subtração\n 3-Multiplicação\n 4-Divisão");
		escolha = ler.nextInt();
		
		if(escolha==1) {
			fazerOperacao1();
		}
		else if(escolha==2) {
			System.out.println("A subtração é de: "+fazerOperacao());
		}
		else if(escolha==3) {
			fazerOperacao(0, 0, 0);
		}
		else if(escolha==4) {
			
			
			System.out.println("A divisão é de: "+fazerOperacao1(0, 0, 0));
			
			
			
		}
		
	
		
		
	}

	
	
}

