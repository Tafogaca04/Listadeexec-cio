package ListaExercício;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int idade,media,soma = 0;
		int i =0;
		

		while (i <10) {
			System.out.println( "Informe o número:" +i);
			idade= ler.nextInt();	
			
			soma= i+idade;
			media = (soma)/20;
			
			System.out.println( i++);
			System.out.println( "O resultado é: "+ soma);
		    System.out.println( "O resultado da  média é : " + media);
	}
}
}
