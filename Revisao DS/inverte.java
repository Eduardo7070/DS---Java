import java.util.*;
public class inverte {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int n,calculo1, calculo2, calculo3 ;
	System.out.println("Escreva um numero de tres algarismos: ");
	n = ler.nextInt();
	
	calculo1 = n % 10;
	calculo2 = n % 100 / 10;
	calculo3 = n / 100;
	
	System.out.println("Inverte: "+calculo1+calculo2+calculo3);

	}

}
