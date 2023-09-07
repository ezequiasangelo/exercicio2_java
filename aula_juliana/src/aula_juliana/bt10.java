package aula_juliana;

import java.util.Scanner;

public class bt10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escreva um valor entre 1 e 10: ");
		int num = scanner.nextInt();
		
		if(num >= 1 && num <=10 ){
		
			for (int i = 1; i <= 10; i++) {
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
            }
		}else {
			System.out.println("Número não aceito! ");
        }
		scanner.close();
	}

}