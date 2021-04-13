package edyene;

public class Pessoa {
	String nome, sexo;
	int idade, altura, peso;

	public Pessoa(String nome, int idade, String sexo, int altura, int peso) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int calculaImc() {
		if (this.sexo == "m") {
			return (72 * (this.altura/100) - 58);
		} else {
			return (62 * (this.altura/100) - 44);
		}	
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso
				+ "]";
	}
}
