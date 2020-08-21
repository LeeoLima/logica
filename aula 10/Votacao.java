package exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Votacao {

	public static void main(String[] args) {
		//variável de apoio para votar novamente
		char novoVoto = 's';
		//variáveis
		double candidato;
		//objetos
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("#0");
		//entrada
		do {
		System.out.println("VOTAÇÃO PARA PREFEITO");
		System.out.println("");
		System.out.println("Para o canditado nº 1 digite o número 11111");
		System.out.println("Para o canditado nº 2 digite o número 22222");
		System.out.println("Para o canditado nº3 digite o nímero 33333");
		System.out.println("Para o o seu voto ser em branco digite o 4");
		System.out.println("");
		System.out.println("Digite o número do seu canditado:");
		candidato = teclado.nextDouble();
		System.out.println("");
		System.out.println("Seu candidato selecionado foi o " + formatador.format(candidato));
		System.out.println("Tem certeza do seu voto(s/n)?");
		novoVoto = teclado.next().charAt(0);
		} while (novoVoto == 'n');
		//saida
		System.out.println("");
		System.out.println("PARABÉNS, VOTO CONCLUIDO!" );
		//estrutura de controle condicional
		if (candidato <=11111 && candidato >11110) {
			System.out.println("---- CANDIDADO Nº 1 ----");
		} else if (candidato <=22222 && candidato >22220) {
			System.out.println("---- CANDIDADO Nº 2 ----");
		} else if ( candidato <=33333 && candidato >33330) {
			System.out.println("---- CANDIDADO Nº 3 ----");
		} else if (candidato <=4 && candidato >3) {
			System.out.println("---- VOTO EM BRANCO ----");
		} else {
			System.out.println("---- VOTO IRREGULAR ----");
		}
		teclado.close();
	}

}
