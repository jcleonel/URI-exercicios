package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double ponto = sc.nextDouble();
		String s = "";

		if (ponto >= 0.0 && ponto <= 25.00) {
			s = "Intervalo [0,25]";
		} else if (ponto >= 25.01 && ponto <= 50.00) {
			s = "Intervalo (25,50]";
		} else if (ponto >= 50.01 && ponto <= 75.00) {
			s = "Intervalo (50,75]";
		} else if (ponto >= 75.01 && ponto <= 100.00) {
			s = "Intervalo (75,100]";
		} else {
			s = "Fora de intervalo";
		}

		System.out.println(s);

		sc.close();
	}

}
