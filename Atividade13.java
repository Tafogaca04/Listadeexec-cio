package ListaExercício;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler =new Scanner (System.in);
		int idade;
		int i=0;
		System.out.print("Digite a idade:");
		idade =ler.nextInt();
		System.out.print(i++);
		while (idade != 18) {
			System.out.print("Menor de Idade");
		idade=ler.nextInt();
		
		}
		System.out.print("A idade" + idade + " é maior de idade");
	}

}
