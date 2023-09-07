package aula_juliana;

import java.util.Scanner;

public class at1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor : ");
        int num2 = scanner.nextInt();
        
        
        
        while (num2 == 0) {
            System.out.println("O segundo valor não pode ser zero. Digite novamente.");
            System.out.print("Digite o segundo valor: ");
            num2 = scanner.nextInt();
        }
        int dividir = num1 / num2;
        System.out.println("Resultado da divisão: " + dividir);
        
        scanner.close();
    }
}
