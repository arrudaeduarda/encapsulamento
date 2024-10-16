package encapsulamento;

public class ObjetoCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(1234, "Amanda", "159968762", "390286", "8635426");
		Cliente cliente2 = new Cliente(2345, "Diana", "15627399", "8392038", "827394729");
				
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		
	}

}
