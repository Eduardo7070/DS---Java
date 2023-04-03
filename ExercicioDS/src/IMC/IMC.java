package IMC;

import java.util.Scanner;

public class IMC {

	public double altura, peso, resultado = 0 ;
	public String resultado1 ;

	public void lerAlturaPeso() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua Altura: ");
		altura  = ler.nextDouble();
		System.out.println("Digite seu Peso: ");
		peso = ler.nextDouble();
	}
	
	public String calcularIMC() {
		resultado = peso / (altura*altura);
		
		System.out.println("Seu IMC é de: "+resultado);
		
		if(resultado<16) {
			resultado1 = "Baixo Peso (Grau 1)";
	
		}
		else if(resultado>=16 && resultado<=16.99){
			resultado1 = "Baixo Peso (Grau 2";
			
		}
		else if(resultado>=17 && resultado<= 18.49) {
			resultado1 = "Baixo peso (Grau 3) ";
			
		}
		else if(resultado >= 18.50 && resultado<= 24.99) {
			resultado1 = "Peso adequado";
		}
		else if(resultado >= 25 && resultado <= 29.99) {
			resultado1 = "Sobrepeso";
			
		}
		else if(resultado >= 30 && resultado <= 34.99 ) {
			resultado1 = "Obesidade (Grau 1)";
			
		}
		else if(resultado >= 35 && resultado <= 39.99) {
			resultado1 = "Obesidade (Grau 2) ";
			
		}
		else if (resultado > 40){
			resultado1 = "Obesidade (Grau 3)";
			
		}
		
		return resultado1;
		
	}
	
}
