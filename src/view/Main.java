package view;

import javax.swing.JOptionPane;

import controller.BinarioController;

/**
 * @author Lucas Batista 3 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {
		int n = 0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (maior que 0 menor que 2000): "));
			if (n <= 0 || n > 2000) {
				JOptionPane.showMessageDialog(null, "Número inválido, digite novamente!");
			}
		} while (n <= 0 || n > 2000);

		BinarioController bCont = new BinarioController();
		String resultado = bCont.converteBinario(n);
		System.out.println("Binário de " + n + " é " + resultado);
	}

}
