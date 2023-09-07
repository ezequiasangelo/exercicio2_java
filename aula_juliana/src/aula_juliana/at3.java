package aula_juliana;

import java.util.Scanner;

public class at3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		double  n1, n2;

		System.out.print("Digite um número:  ");
		n1 = scanner.nextDouble();


		do {
			System.out.print("Digite o segundo número:  ");
			n2 = scanner.nextDouble();

			if(n2 == 0) {
				System.out.println("                        ");
				System.out.println("                        ");
				System.out.println("VALOR INVÁLIDO! ");
			}
		}while(n2 == 0); 


			double resultado = n1 / n2;	
			System.out.println("                        ");
			System.out.println("                        ");
			System.out.println("Resultado "  + resultado);

		scanner.close();
	}

}

