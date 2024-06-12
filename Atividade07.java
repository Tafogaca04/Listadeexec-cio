package ListaExercício;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
        int num,soma=0;
        
        
		for(int i=0; i<=10 ; i++) {
			
			System.out.println("Informe o número:");
			num= ler.nextInt();
		
			
			soma =(soma+num);
			System.out.println(" A soma é: " + soma);
	}

}
}
