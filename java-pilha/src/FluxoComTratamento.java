//Aula 2 completa2
public class FluxoComTratamento {
	public static void main(String[] args) throws MinhaExcecao {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (MinhaExcecao e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("deu muito errado");
//		System.out.println("Fim do metodo2");
	}
}
