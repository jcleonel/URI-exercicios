package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salFixo = sc.nextDouble();
		double totVendas = sc.nextDouble();
		
		double salario = salFixo + (totVendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", salario);
		
		sc.close();
	}
}