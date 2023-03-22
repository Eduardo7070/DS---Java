import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[4][2], i, j;
		final int TAM=4;


		
		for(i=0; i<4; i++) {
			
		
		for(j=0; j<2; j++) {
			System.out.println("Digite os numeros das linas e das colunas: ");
			matriz[i][j] = ler.nextInt();
		}
		
		}
		for(i=0; i<4; i++) {
			System.out.println("Resultado: "+(matriz[i][0] + matriz[i][1]));;
			

	}
		
	}
}
