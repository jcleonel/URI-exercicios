package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempo, vel;
		double litros;

		tempo = sc.nextInt();
		vel = sc.nextInt();

		litros = (double) (tempo * vel) / 12;

		System.out.printf("%.3f", litros);
		System.out.println();
		sc.close();

	}

}
