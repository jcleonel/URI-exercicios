package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double calculo = 0.0;

		if ((Math.abs(B - C) < A && A < B + C) || (Math.abs(A - C) < B && B < A + C)
				|| (Math.abs(A - B) < C && C < A + B)) {
			calculo = A + B + C;
			System.out.printf("Perimetro = %.1f%n", calculo);
		} else {
			calculo = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f%n", calculo);
		}

		sc.close();
	}

}
