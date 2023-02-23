package aprendendoif;

public class CondicaoComString {

	public static void main(String[] args) {

		String email = "teste@e2etreinamentos.com.br";
		String emailCadastrado = "teste@e2etreinamentos.com.br";

		if (email.equalsIgnoreCase(emailCadastrado)) {
			System.out.println("Login aprovado");
		} else {
			System.out.println("Login invalido");
		}
	}
}
