public class TesteSacaNeagivo {
	public static void main(String[] args) {
		Conta1 conta = new Conta1(6646,969060);
		conta.deposita(100);
		System.out.println(conta.saca(101));

		conta.saca(101);

		System.out.println(conta.getSaldo());

	}
}