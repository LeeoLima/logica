package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SistemaVendas {
	public static void main(String[] args) {
		//variáveis
		double valor, desconto, total, pago, troco;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//Entrada
		System.out.println("Digite o valor: ");
		valor = teclado.nextDouble();
		System.out.println("Digite o Desconto (%): ");
		desconto = teclado.nextDouble();
		//processamento
		total = valor - (valor*desconto) / 100 ;
		//saida
		System.out.println("Valor total com desconto: " + formatador.format(total));

		//entrada
		System.out.println("Digite o valor pago: ");
		pago = teclado.nextDouble();
		//processamento
		troco= pago - total;
		//saida
		System.out.println("Troco: R$" + formatador.format(troco));
		teclado.close();
	}
}
