package exercicios;

import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		//vari�veis
		String nome;
		double nota1,nota2,media;
		//objetos
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite a nota1: ");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a nota2: ");
		nota2 = teclado.nextDouble();
		//processamento
		media = (nota1 + nota2) /  2;
		//saida
		System.out.println("======================");
		System.out.println("== C�lculo da m�dia ==");
		System.out.println("======================");
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("M�dia: " + media);
		teclado.close();
	}

}
