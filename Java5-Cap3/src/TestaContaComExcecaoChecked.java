
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta1 c = new Conta1();
		try {
			c.deposita();
		} catch(MinhaExcecao ex) {
			System.out.println("tratamento ....");
		}
	
	}

}
