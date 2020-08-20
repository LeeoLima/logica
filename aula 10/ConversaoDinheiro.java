package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoDinheiro {

	public static void main(String[] args) {
		//variáveis
		double real, dolar, euro, libra, iene;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Digite o valor em Real: R$");
		real=teclado.nextDouble();
		//processamento
		dolar = real * 0.18;
		euro = real * 0.15;
		libra = real * 0.72;
		iene = real * 105.72;
		//saida
		System.out.println("Valor em Dólar: US " + formatador.format(dolar));
		System.out.println("Valor em Euro: EUR " + formatador.format(euro));
		System.out.println("Valor em Libra: GBP " + formatador.format(libra));		
		System.out.println("Valor em Iene: JPY " + formatador.format(iene));
		teclado.close();
	}

}
