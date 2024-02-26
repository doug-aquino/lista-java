package lista01;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o ano do seu nacimento: ");
		int ano_usuario = teclado.nextInt();
		int ano_atual = 2024; 
		int idade_usuario = ano_atual - ano_usuario; 
		System.out.print("Sua idade é: " + idade_usuario);
		teclado.close();
		
		
	
		

	}

}
