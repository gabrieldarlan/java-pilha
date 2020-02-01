
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		Conta conta = new Conta();
		try {
			System.out.println("conta");
			conta.deposita();
		} catch (MinhaExcecao e) {
			System.out.println("tratamento...");
		}
	}
}
