package NomeIdade;

import java.util.Scanner;

public class PessoaIdade {

	public String nome[] = new String [5];
	public int idade[] = new int [5];


	public void  Nome() {
		
		Scanner ler = new Scanner(System.in);
	
		for(int i=0; i<5; i++) {
			System.out.println("Digite o nome da "+(i+1)+"º Pessoa");
			nome[i] = ler.next();
			System.out.println("Digite a idade da "+(i+1)+"º Pessoa");
			idade[i] = ler.nextInt();
		}
		}
		
		
		
	
	public void Apresentar() {
		for(int i = 0; i<5; i++) {
			System.out.println("Nome: "+nome[i]+", idade: "+idade[i]);
		}
	}

}
