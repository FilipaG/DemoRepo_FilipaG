

import java.util.Scanner;

public class Proj02p1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);      // scan do n�mero
		System.out.println ("Insira um n�mero: ");
		int originalNumber = input.nextInt();
		int number = originalNumber;   //afeta��o para n�o destruir o valor inserido pelo utilizador
		int countNum = 0;
		
		while (number != 0) {
			number /= 10;  // divis�es sucessivas por 10
			countNum ++;    // contagem das divis�es feitas para determinar os algarismos do n�mero
		} 
        System.out.println("O n�mero " + originalNumber + " tem " + countNum + " d�gitos.");
	}

}
