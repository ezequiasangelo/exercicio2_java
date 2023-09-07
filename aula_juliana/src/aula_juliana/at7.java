package aula_juliana;

import java.util.Scanner;

public class at7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um Número maior que ZERO!: ");
		int n = scanner.nextInt();
			
		for(int contador = 1; contador <= n ; contador++ ) {
			System.out.println(contador);	
		}
		
		scanner.close();
	}

}
