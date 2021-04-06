import java.util.Scanner;

public class CalculadoraEquacao {
	public static void main(String[] args) {

		Executar();

	}

	public static void Executar() {

		Scanner sc = new Scanner(System.in);
		double a, b, c, delta;

		System.out.print("Digite o valor de a: ");
		a = sc.nextDouble();

		System.out.print("Digite o valor de b: ");
		b = sc.nextDouble();

		System.out.print("Digite o valor de c: ");
		c = sc.nextDouble();

		delta = (b * b) - 4 * a * c;

		sc.close();

		Verificar(a, b, c, delta);
	}

	public static void Verificar(double a, double b, double c, double delta) {
		if (delta > 0) {
			CalcularDuasRaizes(a, b, c, delta);
		} else if (delta == 0) {
			CalcularX(a, b);
		} else {
			System.out.println("Equação não possui raiz real!");
		}
	}

	public static void CalcularDuasRaizes(double a, double b, double c, double delta) {
		double x1, x2;
		x1 = (-b - Math.sqrt(delta)) / (2 * a);
		x2 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.println("x1: " + x1 + " | x2: " + x2);
	}

	public static void CalcularX(double a, double b) {
		double x;
		x = -b / (2 * a);
		System.out.println("X = " + x);
	}
}
