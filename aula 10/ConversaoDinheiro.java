package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoDinheiro {

	public static void main(String[] args) {
		//variáveis
		double real, dolar, resultado;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Digite o valor em Real: R$");
		real=teclado.nextDouble();
		System.out.println("Digite o valor da cotação do Dólar: US");
		dolar=teclado.nextDouble();
		//processamento
		resultado = real*dolar;
		//saida
		System.out.println("Valor em Dólar: US " + formatador.format(resultado));
		teclado.close();
	}

}
