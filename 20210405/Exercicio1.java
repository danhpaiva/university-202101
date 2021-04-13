package edyene;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite o mês desejado: ");
			int mes = sc.nextInt();
			System.out.println(retornaMes(mes));
		} catch (Exception e) {
			System.out.println("Favor verificar o número informado.");
		}

		sc.close();
	}

	public static String retornaMes(int numMes) {
		String[] listaMeses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };
		return listaMeses[numMes - 1];

	}

}
