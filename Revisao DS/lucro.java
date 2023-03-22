
import java.util.*;
public class lucro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int precoProduto, lucro, venda, escolha;
		do {
			
		
		System.out.println("Digite o pre�o que o produto foi comprado :");
		precoProduto = ler.nextInt();
		System.out.println("Digite a margem de lucro da venda em porcentagem: ");
		lucro = ler.nextInt();
		lucro = (precoProduto*lucro)/100;
		System.out.println("O lucro liquido é de: "+lucro);
		venda = precoProduto+lucro;
		System.out.println("O valor da venda é de: "+venda);
		
		System.out.println("Deseja continuar a execução? 1 para SIM ou 2 para NÃO");
		escolha = ler.nextInt();
		}while (escolha == 1);
		
		

	}

}