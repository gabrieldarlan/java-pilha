
public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (Exception e) {
			System.out.println("deu erro");
		}

// Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			con.fecha();
//		}
	}
}
