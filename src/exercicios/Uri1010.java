package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
		double valorPeca1, valorPeca2, valorTotal;

		codPeca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		valorTotal = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		System.out.println();
		
		sc.close();
	}
}