public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta1 contaDaMarcela = new Conta1(6646,969060);
		System.out.println(contaDaMarcela.getSaldo());

		contaDaMarcela.setTitular(new Cliente());
		System.out.println(contaDaMarcela.getTitular());

		contaDaMarcela.getTitular().setNome("Marcela");
		System.out.println(contaDaMarcela.getTitular().getNome());

	}
}