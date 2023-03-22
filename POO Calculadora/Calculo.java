
import java.util.*;


	public class Calculo {
		public double num1,num2,soma,mult,sub,div;
		
		
		
		public void  fazerSoma() {
			Scanner in = new Scanner(System.in);
			num1= in.nextDouble();
			num2 = in.nextDouble();
			soma = num1+num2;
		}
		public void  fazerSub() {
			Scanner in = new Scanner(System.in);
			num1= in.nextDouble();
			num2 = in.nextDouble();
			sub = num1-num2;
		}
		public void  fazerMult() {
			Scanner in = new Scanner(System.in);
			num1= in.nextDouble();
			num2 = in.nextDouble();
			mult = num1*num2;
		}
		public void  fazerDiv() {
			Scanner in = new Scanner(System.in);
			num1= in.nextDouble();
			num2 = in.nextDouble();
			div = num1/num2;
		}
		public void apresentarSoma() {
			System.out.println(soma);
		}
		public void apresentarSub() {
			System.out.println(sub);
		}
		public void apresentarMult() {
			System.out.println(mult);
		}
		public void apresentarDiv() {
			System.out.println(div);
		}
		
		

	}
