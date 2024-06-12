package ListaExercício;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int idade,media,soma;
	
		for(int i=0; i<=20 ; i++) {

			System.out.println("Informe o número da idade:"+i);
			idade= ler.nextInt();


			soma =(i+idade);
			media= (soma)/20;
			
			System.out.println(" A soma das idades são: " + soma);
			System.out.println(" A soma das medias são: " + media);
	}

}
}
