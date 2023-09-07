package aula_juliana;

import java.util.Scanner;

public class at8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um Número: ");
		int n = scanner.nextInt();
		
		while(n == 0) { 
			System.out.print("Digite um valor maior que ZERO! ");
			n = scanner.nextInt();	}	
		
		for(int contador = 1; contador <= n ; contador++ ) 
			System.out.println(contador);	
		
		
		scanner.close();
		
	}

}
