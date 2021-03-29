public class Verificador {
	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		double[] numero = leitor.Ler();

		Retornador retorno = new Retornador();

		System.out.println("Retorno: " + retorno.Verificar(numero));
	}
}
