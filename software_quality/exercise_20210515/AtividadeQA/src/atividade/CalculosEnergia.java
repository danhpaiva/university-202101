package atividade;

/**
 * @author 
 * 		Daniel Henrique Matos de Paiva
 * 		Felipe Pedrosa
 * 		Francisco Fontoura
 *   	Douglas Ramos Rodrigues
 *   	Christiano Deslandes Ribeiro
 */

public class CalculosEnergia {
	public double necessidadeDiaria(Pessoa pessoa) throws IllegalArgumentException {
		// fiz desse jeito pro sonar parar de encher o saco falando pra refatorar!
		double tmb;
		double fa;
		if (pessoa.getIdade() < 10)
			throw new IllegalArgumentException("Valor inválido para a idade.");
		if (pessoa.getSexo() == 'm') {
			tmb = defineTMBHomem(pessoa.getIdade(), pessoa.getPeso());
			fa = defineFAHomem(pessoa.getGrauAtividade());
		}
		else {
			tmb = defineTMBMulher(pessoa.getIdade(), pessoa.getPeso());
			fa = defineFAMulher(pessoa.getGrauAtividade());
		}
		return tmb * fa;
	}
	
	private double defineTMBHomem(int idade, double peso) {
		double tmb;
		if (idade >= 10 && idade < 18)
			tmb = 17.5 * peso + 651;
		else if (idade >= 18 && idade < 30)
			tmb = 15.3 * peso + 679;
		else if (idade >= 30 && idade < 60)
			tmb = 8.7 * peso + 879;
		else
			tmb = 13.5 * peso + 487;
		return tmb;
	}
	
	private double defineTMBMulher(int idade, double peso) {
		double tmb;
		if (idade >= 10 && idade < 18)
			tmb = 12.2 * peso + 746;
		else if (idade >= 18 && idade < 30)
			tmb = 14.7 * peso + 496;
		else if (idade >= 30 && idade < 60)
			tmb = 8.7 * peso + 829;
		else
			tmb = 10.5 * peso + 596;
		return tmb;
	}
	
	private double defineFAHomem(int grau) {
		double fa;
		if (grau == 1)
			fa = 1.2;
		else if (grau == 2)
			fa = 1.4;
		else if (grau == 3)
			fa = 1.5;
		else if (grau == 4)
			fa = 1.6;
		else
			fa = 1.8;
		return fa;
	}
	
	private double defineFAMulher(int grau) {
		double fa;
		if (grau == 1)
			fa = 1.2;
		else if (grau == 2)
			fa = 1.3;
		else if (grau == 3)
			fa = 1.45;
		else if (grau == 4)
			fa = 1.5;
		else
			fa = 1.7;
		return fa;
	}
	
}
