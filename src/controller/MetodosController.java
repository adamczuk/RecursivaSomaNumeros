package controller;

public class MetodosController {

	public MetodosController() {
		super();
	}

	public int somaNumeros(int n) {

		/*
		 * PARADA: Quando o valor for igual ou menor a 0, retornamos 0. Isso porque
		 * nosso programa nao calcula valores negativos, e por isso nao tem como somar
		 * nada abaixo de 0
		 */
		if (n <= 0) {
			return 0;
		} else {
			return n + somaNumeros(--n);
		}

		/*
		 * Relacionamento com anterior:
		 * 
		 * 
		 * vamos diminuindo a variavel a cada recurs�o, pois concluo que a rela��o � de 
		 * n + soma de todos os anteriores at� 0
		 * 
		 * exemplo:
		 * 
		 * 3 = 3 + (2 + 1 + 0) 
		 * 2 = 2 + (1 + 0) 
		 * 1 = 1 + 0 
		 * 0 = 0 (PARADA - retorna 0) 
		 * 
		 */
	}

}
