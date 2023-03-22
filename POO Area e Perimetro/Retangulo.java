
import java.util.*;

public class Retangulo {
	public int altura, base, area, perimetro;
	
	public void Area() {
		System.out.println("Digite a Altura do Retangulo: ");
		Scanner ler = new Scanner(System.in);
		altura = ler.nextInt();
		System.out.println("Digite o tamanho da base do seu Retangulo: : ");
		base = ler.nextInt();
		
		area = base * altura; 
	}
	public void Perimetro() {
		perimetro = (altura + base)* 2 ;
		
	}
	
	public void Apresentar() {
		System.out.println("A area é de: "+area+" E o Perimetro é de: "+perimetro);
	}
	
	
}
