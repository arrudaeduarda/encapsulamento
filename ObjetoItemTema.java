package encapsulamento;

public class ObjetoItemTema {

	public static void main(String[] args) {

		ItemTema ItemTema1 = new ItemTema(1234, "Carla", "legal");
		ItemTema ItemTema2 = new ItemTema(2345, "Diana", "gentil");
		
		System.out.println(ItemTema1.getId());
		System.out.println(ItemTema1.getNome());
		System.out.println(ItemTema1.getDescricao());
		
		System.out.println(ItemTema2.getId());
		System.out.println(ItemTema2.getNome());
		System.out.println(ItemTema2.getDescricao());
		
	}

}
