package controller;

/**
 * @author Lucas Batista 3 de mar. de 2024
 */
public class BinarioController {

	public BinarioController() {
		super();
	}

	public String converteBinario(int n) {
		//Condições de parada: resultado final é 0 ou 1
		if (n == 0) {
			return "0";
		}
		if (n == 1) {
			return "1";
		}
		//Divide numero por 2 para próxima ocorrência
		int proximaDivisao = n / 2;
		
		//Calcula resto
		int resto = n % 2;
		
		//Chama recursiva levando (numero/2) e concatena com resto
		return converteBinario(proximaDivisao) + resto; 
	}

}
