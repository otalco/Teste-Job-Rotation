
public class AtividadeCinco {
	
	public static void main(String[] args) {
		String palavra = "contratado";
		String invertida = "";
        
        
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        
        
        System.out.println("Palavra invertida: " + invertida);
    }
        System.out.println("Palavra original: " + palavra);
	}	
}
