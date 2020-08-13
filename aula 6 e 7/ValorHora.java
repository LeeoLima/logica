package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorHora {
	public static void main(String[]args) {
		//variavéis
		double remuneracao, custo, hora, total;
		//objetos
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Calculo do valor da hora de serviço: ");
		System.out.println("Valor da remuneração pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.println("Valor do custo operacional: ");
		custo = teclado.nextDouble();
		System.out.println("Valor da carga horária: ");
		hora = teclado.nextDouble();
		//processamento
		total= ((remuneracao*1.3)+(remuneracao*0.2)+custo)/hora;
		//saida
		System.out.println("Valor a ser pago por hora: R$ " + formatador.format(total));
		teclado.close();
	}
	
	
}
