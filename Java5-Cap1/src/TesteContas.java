public class TesteContas {

	public static void main(String[] args) {
		
		Conta1 conta = new Conta1(1337, 23334);
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("o total de contas é : " + Conta1.getTotal());
		
	}
	
}
