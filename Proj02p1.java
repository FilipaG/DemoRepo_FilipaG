

import java.util.Scanner;

public class Proj02p1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);      // scan do número
		System.out.println ("Insira um número: ");
		int originalNumber = input.nextInt();
		int number = originalNumber;   //afetação para não destruir o valor inserido pelo utilizador
		int countNum = 0;
		
		while (number != 0) {
			number /= 10;  // divisões sucessivas por 10
			countNum ++;    // contagem das divisões feitas para determinar os algarismos do número
		} 
        System.out.println("O número " + originalNumber + " tem " + countNum + " dígitos.");
	}

}
