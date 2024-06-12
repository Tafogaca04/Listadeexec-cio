package ListaExercício;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int num,soma = 0;

		while (soma <15) {
			System.out.println( "Informe o valor do número:");
			num= ler.nextInt();	

			soma = num++;
			soma= soma+num;
			System.out.println( "O resultado é: " +soma);
		}

	}
}
