package ListaExercício;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int soma,idade;
		for(int i=0; i<=20 ; i++) {

			System.out.println("Informe o número:");
			idade= ler.nextInt();


			soma =(i+idade);
			System.out.println(" A soma das idades são: " + soma);
		}


	}

}
