/*
 * Daniel Henrique Matos de Paiva - 319226054
 * Douglas Ramos Rodrigues - 319210212
 * Francisco Augusto Fontoura - 319230771
 * Rafael Ferreira Pedrosa - 319228038
 * */

package edyene;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade;
		String sexo;
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		System.out.println("Digite o sexo: ");
		sexo = sc.next();

		System.out.println("O valor da mensalidade é " + calcularMensalidade(idade, sexo));

		sc.close();
	}

	public static int calcularMensalidade(int idade, String sexo) {
		int valor;

		if (sexo.equalsIgnoreCase("m")) {
			if (idade > 40) {
				valor = 80;
			} else if (idade >= 31) {
				valor = 85;
			} else if (idade >= 19) {
				valor = 90;
			} else if (idade >= 16) {
				valor = 75;
			} else {
				valor = 60;
			}

		} else {
			if (idade > 40) {
				valor = 80;
			} else if (idade >= 26) {
				valor = 85;
			} else if (idade >= 19) {
				valor = 90;
			} else {
				valor = 60;
			}
		}
		return valor;
	}

}
