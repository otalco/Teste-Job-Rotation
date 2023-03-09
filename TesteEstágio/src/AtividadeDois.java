import java.util.Scanner;

public class AtividadeDois {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        int anterior = 0;
        int atual = 1;
        int proximo = anterior + atual;
        
        boolean pertence = false;
        while (proximo <= numero) {
            if (proximo == numero) {
                pertence = true;
                break;
            }
            anterior = atual;
            atual = proximo;
            proximo = anterior + atual;
        }
        
        if (pertence) {
            System.out.println("O numero " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O numero " + numero + " não pertence à sequência de Fibonacci.");
        }
    }		
}
