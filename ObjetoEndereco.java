package encapsulamento;

public class ObjetoEndereco {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco(123,"Rua Azul", 2324, "casa verde", "Sol Poente", "São Paulo", "183000", "São Paulo" );
		
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradoro());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());
	}

}
