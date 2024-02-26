package lista01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] alturas = new double[5];
		for (int i = 0; i < 5;i++) {
			System.out.print("Digite a altura: ");
			alturas[i] = teclado.nextDouble();
		}
		
		double SomaAltura = 0;
		for (int i = 0; i < 5; i++) {
			SomaAltura += alturas[i];		
		}
		double MediaAltura = SomaAltura / 5;
		
		System.out.printf("A média de alturas é de: %.2f", MediaAltura);
		
		teclado.close();
		
		
			

	}

}
