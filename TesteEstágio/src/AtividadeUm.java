
public class AtividadeUm {

	public static void main(String[] args) {
		
		int indice = 13;
		int soma = 0;
		int k = 0;
		
		while(k< indice) {
			k = k + 1;
			soma = soma + k;
		}
		System.out.println(soma);
	}
}
//No código apresentado, a variável K é definida como 0 no início e é aumentada em cada passo do laço de repetição while.
//A variável SOMA também começa com valor 0 e é atualizada a cada iteração do laço adicionando o valor atual de K.
//O laço de repetição continuará até que K seja igual ao valor definido na variável INDICE.