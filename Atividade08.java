package ListaExercício;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		int num,soma = 0;
		int i =0;
		

		while (i <10) {
			System.out.println( "Informe o número:");
			num= ler.nextInt();	
			
			soma= soma+num;
			
			System.out.println( "O resultado é: " + soma);
			System.out.println( i++);
		}
	

}
}
