package exercicios;

import java.util.Scanner;

public class Combustivel {
		public static void main(String[] args) {
			//variáveis
			double gasolina,alcool,resultado;
			//objetos
			Scanner teclado = new Scanner(System.in);
			//Entrada
			System.out.println("GASOLINA x ALCOOL");
			System.out.println("Digite o valor da Gasolina: ");
			gasolina = teclado.nextDouble();
			System.out.println("Digite o valor do Alcóol: ");
			alcool = teclado.nextDouble();
			//processamento
			resultado = (alcool * 10) / (gasolina * 10);
			//saida
			System.out.println("O mais barato é...");
			
			//estrutura de controle condicional
			if (resultado <= 0.70) {
				System.out.println("Alcool");
			} else {
				System.out.println("Gasolina");
			}
			teclado.close();
	}

}
