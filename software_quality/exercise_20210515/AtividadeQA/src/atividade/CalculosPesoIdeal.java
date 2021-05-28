package atividade;

/**
 * @author 
 * 		Daniel Henrique Matos de Paiva
 * 		Felipe Pedrosa
 * 		Francisco Fontoura
 *   	Douglas Ramos Rodrigues
 *   	Christiano Deslandes Ribeiro
 */

public class CalculosPesoIdeal {

	public double calculaPesoIdeal(Pessoa pessoa) throws IllegalArgumentException {
		if (pessoa.getIdade() > 3 && pessoa.getIdade() <= 10)
			return calculaPesoIdealInfantil(pessoa.getIdade());
		else if (pessoa.getIdade() > 18 && pessoa.getIdade() <= 64)
			return calculaPesoIdealAdulto(pessoa.getAltura(), pessoa.getSexo());
		else if (pessoa.getIdade() > 64)
			return calculaPesoIdealIdoso(pessoa.getIdade(), pessoa.getAltura(), pessoa.getSexo());
		else
			throw new IllegalArgumentException("Valor inválido para a idade.");
	}

	private double calculaPesoIdealInfantil(double idade) {
		return (idade * 2) + 9;
	}

	private double calculaPesoIdealAdulto(double altura, char sexo) {
		if (sexo == 'm')
			return 22 * Math.pow(altura, 2);
		else
			return 21 * Math.pow(altura, 2);
	}

	private double calculaPesoIdealIdoso(int idade, double altura, char sexo) {
		double imcPercentil = 0;
		if (sexo == 'm') {
			if (idade < 70)
				imcPercentil = 24.3;
			else if (idade < 75)
				imcPercentil = 25.1;
			else if (idade < 80)
				imcPercentil = 23.9;
			else if (idade < 85)
				imcPercentil = 23.7;
			else
				imcPercentil = 23.1;
		} else {
			if (idade < 70)
				imcPercentil = 26.5;
			else if (idade < 75)
				imcPercentil = 26.3;
			else if (idade < 80)
				imcPercentil = 26.1;
			else if (idade < 85)
				imcPercentil = 25.5;
			else
				imcPercentil = 23.6;
		}
		return imcPercentil * Math.pow(altura, 2);
	}

	public double calcularIMC(Pessoa pessoa) {
		return pessoa.getPeso() / (Math.pow(pessoa.getAltura(), 2));
	}

	public String classificar(Pessoa pessoa) {
		double imc = calcularIMC(pessoa);
		if (imc < 20)
			return "Abaixo do Peso";
		if (imc < 25)
			return "Peso Normal";
		if (imc < 30)
			return "Sobrepeso";
		if (imc < 40)
			return "Obeso";
		return "Obeso Mórbido";
	}
}
