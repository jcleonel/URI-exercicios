package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X;
		double Y, CONSUMO;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		CONSUMO = X / Y;
		
		System.out.printf("%.3f Km/l\n", CONSUMO);
		
		sc.close();

	}

}
