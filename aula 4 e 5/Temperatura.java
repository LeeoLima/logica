package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
			//variaveis
			double f,media;
			//objetos
			Scanner teclado = new Scanner(System.in);
			DecimalFormat formatador = new DecimalFormat("#0.00");
			//entrada
			System.out.print("Digite o Fahrenheit: ");
			f = teclado.nextDouble();
			//processamento
			media = (f - 32) * 5 / 9;	
			//saida
			System.out.println("");
			System.out.println("Conversão para: ");
			System.out.println("Grau Celsius = " + formatador.format(media) + " C°");
			teclado.close();

	}

}
