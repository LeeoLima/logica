package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ImcStatus {

	public static void main(String[] args) {
		//variáveis
		String nome;
		double peso,altura,media;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
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
		System.out.println("== Cálculo do IMC ==");
		System.out.println("======================");
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("IMC: " + formatador.format(media));
		
		//estrutura de controle condicional
		if (media < 17) {
			System.out.println("Muito Abaixo do peso");
		} else if (media <18.50 ) {
			System.out.println("Abaixo do Peso");
		} else if (media <25) {
			System.out.println("Normal");
		} else if (media <30) {
			System.out.println("Sobrepeso");
		} else if (media <40) {
			System.out.println("Obesidade");
		} else {
			System.out.println("Obesidade Grave");
		}
		teclado.close();

	}

}
