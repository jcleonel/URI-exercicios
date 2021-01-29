package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double reajuste = 0, novoSal = 0.0;
		int percentual = 0;
		
		if(salario >= 0 && salario <= 400.0) {
			novoSal = salario * 1.15;
			reajuste = novoSal - salario;
			percentual = 15;
		} else if (salario >= 400.01 && salario <= 800.0) {
			novoSal = salario * 1.12;
			reajuste = novoSal - salario;
			percentual = 12;
		} else if (salario >= 800.01 && salario <= 1200.0) {
			novoSal = salario * 1.10;
			reajuste = novoSal - salario;
			percentual = 10;
		} else if (salario >= 1200.01 && salario <= 2000.0) {
			novoSal = salario * 1.07;
			reajuste = novoSal - salario;
			percentual = 7;
		} else if (salario >= 2000.01) {
			novoSal = salario * 1.04;
			reajuste = novoSal - salario;
			percentual = 4;
		}
		
		System.out.printf("Novo salario: %.2f%n", novoSal);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: " + percentual + " %");
		
		sc.close();

	}

}

