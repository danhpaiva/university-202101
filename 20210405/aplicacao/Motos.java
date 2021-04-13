package edyene.aplicacao;

import javax.swing.JOptionPane;

import edyene.entidade.Honda;
import edyene.entidade.Suzuki;
import edyene.entidade.Yamaha;
import edyene.entidade.Moto;

public class Motos {

	public static void main(String[] args) {
		while (true) {
			try {
				String nome = JOptionPane.showInputDialog("Informe a marca [Cancelar] para sair: ");

				if (nome.equalsIgnoreCase("Honda")) {
					Moto moto = new Honda();
					imprimir(moto);
				} else if (nome.equalsIgnoreCase("Yamaha")) {
					Moto moto = new Yamaha();
					imprimir(moto);
				} else if (nome.equalsIgnoreCase("Suzuki")) {
					Moto moto = new Suzuki();
					imprimir(moto);
				}
			} catch (Exception e) {
				break;
			}
		}
		System.out.println("\nPROGRAMA FINALIZADO!");
	}


	public static void imprimir(Moto moto) {
		JOptionPane.showMessageDialog(null, "\nNome: " +
				
				moto.nome
				
				+ "\nCilindrada: " + moto.cilindradas + "\nCor: " + moto.cor, "Dados da moto",
				JOptionPane.CLOSED_OPTION);
		
	}
}
