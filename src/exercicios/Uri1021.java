package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		N = (N * 100) + 0.5;
		//NOTAS:
		int nota100 = (int) N / 10000;
		int nota50 = (int) (N % 10000) / 5000;
		int nota20 = (int) (N % 10000 % 5000) / 2000;
		int nota10 = (int) (N % 10000 % 5000 % 2000) / 1000;
		int nota5 = (int) (N % 10000 % 5000 % 2000 % 1000) / 500;
		int nota2 = (int) (N % 10000 % 5000 % 2000 % 1000 % 500) / 200;
		
		//MOEDAS:
		int moeda1 = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200) / 100;
		int moeda50 = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200 % 100) / 50;
		int moeda25 = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200 % 100 % 50) / 25;
		int moeda10 = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200 % 100 % 50 % 25) / 10;
		int moeda05 = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200 % 100 % 50 % 25 % 10) / 5;
		int moeda01 = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200 % 100 % 50 % 25 % 10 % 5) / 1;
		
		System.out.println("NOTAS:");
		System.out.println(nota100 + " nota(s) de R$ 100.00");
		System.out.println(nota50 + " nota(s) de R$ 50.00");
		System.out.println(nota20 + " nota(s) de R$ 20.00");
		System.out.println(nota10 + " nota(s) de R$ 10.00");
		System.out.println(nota5 + " nota(s) de R$ 5.00");
		System.out.println(nota2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moeda1 + " moeda(s) de R$ 1.00");
		System.out.println(moeda50 + " moeda(s) de R$ 0.50");
		System.out.println(moeda25 + " moeda(s) de R$ 0.25");
		System.out.println(moeda10 + " moeda(s) de R$ 0.10");
		System.out.println(moeda05 + " moeda(s) de R$ 0.05");
		System.out.println(moeda01 + " moeda(s) de R$ 0.01");
		
		sc.close();

	}

}