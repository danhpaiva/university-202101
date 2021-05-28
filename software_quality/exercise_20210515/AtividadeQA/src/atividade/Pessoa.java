package atividade;

public class Pessoa {
	private double peso;
	private double altura;
	private char sexo;
	private int idade;
	private int grauAtividade; // de 1 (mais baixo) a 5 (mais alto, atleta)
	
	public double getPeso() {
		return this.peso;
	}

	public double getAltura() {
		return this.altura;
	}

	public char getSexo() {
		return this.sexo;
	}

	public int getIdade() {
		return this.idade;
	}

	public int getGrauAtividade() {
		return this.grauAtividade;
	}

	public Pessoa(double peso, double altura, char sexo, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
		this.idade = idade;
		this.grauAtividade = 2; // padrao
	}

	public Pessoa(double peso, double altura, char sexo, int idade, int grauAtividade) throws IllegalArgumentException {
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
		this.idade = idade;
		if (grauAtividade < 1 || grauAtividade > 5)
			throw new IllegalArgumentException("O grau de atividade da pessoa deve ser 1, 2, 3 , 4 ou 5.");
		this.grauAtividade = grauAtividade;
	}
	
}
