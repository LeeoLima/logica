package exercicios;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		//vari�veis
		String nome;
		double peso,altura,media;
		//objetos
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite o seu peso: ");
		peso = teclado.nextDouble();
		System.out.println("Digite a sua altura: ");
		altura = teclado.nextDouble();
		//processamento
		media = peso / (altura * altura);
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
