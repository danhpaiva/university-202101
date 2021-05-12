package edyene;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite o m�s desejado: ");
			int mes = sc.nextInt();
			System.out.println(retornaMes(mes));
		} catch (Exception e) {
			System.out.println("Favor verificar o n�mero informado.");
		}

		sc.close();
	}

	public static String retornaMes(int numMes) {
		String[] listaMeses = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };
		return listaMeses[numMes - 1];

	}

}
