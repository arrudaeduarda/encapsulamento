package encapsulamento;

public class PessFunPrincipal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario ("João", "123.456.789-00", 2500.00);
		funcionario.exibirInfo();
		
		funcionario.aumentaSalario(10);
		funcionario.exibirInfo();
		
	}

}
