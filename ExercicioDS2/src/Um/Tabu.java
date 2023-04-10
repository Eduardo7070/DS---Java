package Um;

import java.util.Scanner;

public class Tabu{

	public int numero1, numero2,  resultado = 0;
	public void lerNumero() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro numero do intervalo: ");
		numero1 = ler.nextInt();
		System.out.println("Digite o Segundo numero do istervalo: ");
		numero2 = ler.nextInt();
		}
	public void calcularTabuada() {
		
			
		for(numero1 = numero1; numero1<=numero2; numero1++) {
			
		
		for(int i = 1; i<=10 ; i++) {
			resultado = numero1 * i;
			
			System.out.println(numero1 + "*" + i + "=" + resultado);
		}
		}
		
	}
}
