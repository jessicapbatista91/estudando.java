package aprendendoif;

public class CondicaoComMaisCondicoes {

	public static void main(String[] args) {

		String usuario = "admin";
		String usuarioCadastrado = "admin";
		int senha = 123;
		int senhaCadastrada = 123;

		if (usuario.equalsIgnoreCase(usuarioCadastrado) && senha == senhaCadastrada) {
			System.out.println("Login com sucesso");
		} else {
			System.out.println("Login invalido");
		}
	}
}
