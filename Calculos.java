package exerciciosLivro;

import javax.swing.JOptionPane;

public class Calculos {

	public static void operacaoDivisao(int primeiroNumero, int segundoNumero) {

		try {

			primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));

			segundoNumero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));

			if (primeiroNumero <= 0 || segundoNumero <= 0) {

				throw new ArithmeticException("Voce nao pode inserir um numero negativo ou igual a 0");

			}

			else {

				JOptionPane.showMessageDialog(null, "Resultado Final = " + primeiroNumero / segundoNumero);
			}

		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null, "Você inseriu dados inválidos ou fechou o programa incorretamente");
		}

	}

}
