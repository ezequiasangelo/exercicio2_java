package aula_juliana;

import java.util.Scanner;

public class at2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int  n1, n2;
		
		System.out.print("Digite um número:  ");
		n1 = scanner.nextInt();
	

		do {
			System.out.print("Digite o segundo número:  ");
			n2 = scanner.nextInt();
			
		}while(n2 == 0); 	
		
		int resultado = n1 / n2;	
		System.out.println("Resultado "  + resultado);
		
		scanner.close();

	}

}