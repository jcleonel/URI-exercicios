package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		double tot = 0.0;
		
		switch(cod) {
			case 1:
				tot = 4.0 * qtd;
				break;
			case 2:
				tot = 4.5 * qtd;
				break;
			case 3:
				tot = 5.0 * qtd;
				break;
			case 4:
				tot = 2.0 * qtd;
				break;
			case 5:
				tot = 1.5 * qtd;
				break;
		}
		
		System.out.printf("Total: R$ %.2f%n", tot);
		
		sc.close();
	}
}