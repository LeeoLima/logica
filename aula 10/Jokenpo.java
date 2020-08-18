package exercicios;

import java.util.Scanner;

public class Jokenpo {
	public static void main(String[] args) {
		//variáveis
		double numero,resultado;
		int contra = (int) (Math.random() * 3 + 1);
		//objetos
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("Digite 1 para Pedra");
		System.out.println("Digite 2 para Papel");
		System.out.println("Digite 3 para Tesoura");
		System.out.println("Digite o seu número:");
		numero=teclado.nextDouble();
		System.out.println("Número da máquina:");
		switch(contra) {
		case 1:
			System.out.println("1 Pedra");
			break;
		case 2:
			System.out.println("2 Papel");
			break;
		case 3:
			System.out.println("3 Tesoura");
			break;}
		//processamento
		resultado = numero + contra;
		//saida
		System.out.println("====== Jokenpo =======");
		System.out.println("");
		System.out.println("Resultado: " );
		
		//estrutura de controle condicional
		if (resultado >=3 && resultado <4) {
			System.out.println("Pepel ganhou");
		} else if (resultado >=4 && resultado <5) {
			System.out.println("Pedra ganhou");
		} else if (resultado >=5 && resultado <6) {
			System.out.println("Tesoura ganhou");
		} else {
			System.out.println("Empate");
		}
		teclado.close();
	}
}