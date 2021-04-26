package edyene;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();

		double mensalidade = 0;
		double novaMensalidade = 0;
		int mes = 0;
		int mesAtual = 0;
		String sair = "";

		while (!(sair.equalsIgnoreCase("n"))) {
			System.out.println("Valor da mensalidade: ");
			mensalidade = sc.nextDouble();
			System.out.println("Mes de referencia: ");
			mes = sc.nextInt();

			mesAtual = calendario.get(Calendar.MONTH) + 1;

			novaMensalidade = atualizaMensalidade(mensalidade, mes, mesAtual);

			imprimir(mensalidade, novaMensalidade, mes, mesAtual);
			
			System.out.println("Gostaria de continuar? (S/n)");
			sair = sc.next();
		}

		System.out.println("PROGRAMA FINALIZADO");
		sc.close();
	}

	private static double atualizaMensalidade(double mensalidade, int mes, int mesAtual) {
		double novaMensalidade;
		if (mes < mesAtual)
			novaMensalidade = mensalidade * 1.10;
		else {
			novaMensalidade = mensalidade;
		}
		return novaMensalidade;
	}

	private static void imprimir(double mensalidade, double novaMensalidade, int mes, int mesAtual) {
		System.out.println("RESULTADO");
		System.out.println("Mes atual: " + mesAtual);
		System.out.println("Referência: " + mes);
		System.out.println("Mensalidade: " + mensalidade);
		System.out.println("Novo valor: " + novaMensalidade);
	}

}