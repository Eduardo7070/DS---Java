
import java.util.Scanner;


public class retangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int area, perimetro, base, altura;
		System.out.println("Escreva a base do retangulo");
		base = ler.nextInt();
		System.out.println("Escreva a altura do retangulo");
		altura = ler.nextInt();
	
		area = base * altura;
		perimetro = base + altura;
		System.out.println("A area do retangulo � de: "+area+" E o perimetro � de: "+perimetro);
	
		
		
		
	}

}
