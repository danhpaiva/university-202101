import java.util.Scanner;

public class Leitor {
	public double[] Ler() {

		Scanner sc = new Scanner(System.in);

		double[] numero = new double[2];
		int contador = 1;

		for (int i = 0; i <= 1; i++) {
			System.out.print("Digite o " + contador + "º número: ");
			numero[i] = sc.nextDouble();
			contador++;
		}
		sc.close();

		return numero;
	}
}
