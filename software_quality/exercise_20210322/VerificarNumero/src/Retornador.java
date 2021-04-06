public class Retornador {

	public String Verificar(double[] numero) {
		String resposta = "";

		if (numero[0] > numero[1]) {
			resposta = "Verdadeiro";
		} else {
			resposta = "Falso";
		}
		return resposta;
	}
}
