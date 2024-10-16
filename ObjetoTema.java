package encapsulamento;

public class ObjetoTema {

	public static void main(String[] args) {
	 
		Tema tema1 = new Tema (1234, "Alicia", 1000.00, "Verde");
		Tema tema2 = new Tema (2345, "Bianca", 2000.00, "Vermelho");
				
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCor());
		
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCor());
	}

}
