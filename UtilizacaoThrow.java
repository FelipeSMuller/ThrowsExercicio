package exerciciosLivro;

import javax.swing.JOptionPane;

public class UtilizacaoThrow {

	public static void main(String[] args) {

		int primeiroNumero = 0, segundoNumero = 0;

		String resposta;

		while (true) {

			Calculos.operacaoDivisao(primeiroNumero, segundoNumero);

			resposta = JOptionPane.showInputDialog(null, "Deseja continuar?");

			resposta = resposta.toLowerCase();

			switch (resposta) {

			case "sim":

				Calculos.operacaoDivisao(primeiroNumero, segundoNumero);

				break;

			case "nao":

				JOptionPane.showMessageDialog(null, "A aplicação foi encerrada");

				break;

			default:

				JOptionPane.showMessageDialog(null, "Nenhuma opção foi escolhida, o programa foi finalizado!!");

				break;

			}

		}

	}

}
