package ListaExercício;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma,idade,i =0;
		
		Scanner ler = new Scanner(System.in);
		while (i <20) {
			System.out.println( "Informe a idade:");
			idade= ler.nextInt();	
			
			soma= i+idade;
			
			System.out.println( "O resultado é: " + soma);
			System.out.println( i++);
	}

}
}
