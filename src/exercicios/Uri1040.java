package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 +1);
		
		if(media >= 7.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		} else if(media < 5.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		} else if(media >= 5.0 && media <= 6.9) {			
			float nExame = sc.nextFloat();
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			System.out.printf("Nota do exame: %.1f%n", nExame);
			
			float novaMedia = (media + nExame) / 2;
			
			if(novaMedia >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			
			System.out.printf("Media final: %.1f%n", novaMedia);
		}
		
		
		sc.close();

	}

}
