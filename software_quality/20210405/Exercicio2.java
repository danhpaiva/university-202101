package edyene;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
		public static void main(String[] args) {
			try {
				String nome, sexo;
				int idade, altura, peso;

				ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
				Scanner s = new Scanner(System.in);
				
				System.out.println("Insira os dados dos 10 pacientes");
				
				for (int i = 0; i < 1; i++) {
					System.out.println("Insira nome");
					nome = s.nextLine();
					
					
					System.out.println("Insira sexo");
					sexo = s.nextLine();
					while (!(sexo.equals("m") || sexo.equals("f"))) {
						System.out.println("Favor inserir corretamente.");
						sexo = s.nextLine();
					}
					
					
					System.out.println("Insira idade");
					idade = s.nextInt();
					
					System.out.println("Insira altura");
					altura = s.nextInt();
					
					System.out.println("Insira peso");
					peso = s.nextInt();
					
					s.nextLine();
					
					Pessoa a = new Pessoa(nome, idade, sexo, altura, peso);
					pessoas.add(a);
				}
				
				System.out.println("lista dos dados dos clientes");
				for (Pessoa a : pessoas) {
					System.out.println(a);
				}
				
				System.out.println("o cliente menos magro é:");
				int pesoMaior = 0;
				String nomeCarai = "";
				for (Pessoa a : pessoas) {
					if (a.peso > pesoMaior) {
						pesoMaior = a.peso;
						nomeCarai = a.nome;
					}
				}
				System.out.println(nomeCarai);
				
				System.out.println("clientes com peso acima do ideal");
				for (Pessoa a : pessoas) {
					if (a.peso > a.calculaImc()) {
						System.out.println("cliente " + a.nome + " de " + a.idade + " anos está acima do peso.");
					}
				}
				s.close();
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}


}
