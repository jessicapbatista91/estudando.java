package aprendendowhile;

public class Mensagem {

	public static void main(String[] args) {

		boolean mensagem = true;

		while (mensagem) {
			System.out.println("Entrei no while");
			mensagem = false;
		}
		System.out.println("Saiu do while");
	}

}
