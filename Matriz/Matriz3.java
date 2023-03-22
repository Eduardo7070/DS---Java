import java.util.Scanner;

public class Matriz3 {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5], j, i;
		Scanner ler = new Scanner(System.in);
		for(i=0; i<5; i++) {
			
			for(j=0; j<5; j++) {
				System.out.println("Digite os numeros ");
				matriz[i][j] = ler.nextInt();
			}
		

	}
		System.out.println("Diagonal: "+matriz[0][0]);
		System.out.println("Diagonal: "+ matriz[1][1]);
		System.out.println("Diagonal: "+ matriz[2][2]);
		System.out.println("Diagonal: "+ matriz[3][3]);
		System.out.println("Diagonal: "+ matriz[4][4]);
	}
}
