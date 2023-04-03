package UsuarioSalario;

import java.util.Scanner;

	public class Salario {

	Scanner ler = new Scanner(System.in);	
	public double salario;
	
	public void lerSalario() {
		System.out.println("Digite seu salario: ");
		salario = ler.nextDouble();
	}
	
	public void calcularSalario() {
		if (salario<3000) {
			salario =  (salario) + ( salario * 10) / 100;
		}else if(salario>=3000) {
			salario = (salario) + (salario  * 20) /100  ;
			
		}
		System.out.println("Seu salario com o adicional é de : "+salario);
	}
}
