package switchcase;

public class ValidaIdioma {

	public static void main(String[] args) {

		String pais = "EUA";
		
		switch (pais) {
		case "Brasil" :
		System.out.println("Português");
		break;
		case "Argentinal" :
			System.out.println("Espanhol");
			break;
		case "Uruguai" :
			System.out.println("Espanhol");
			break;
			default:
				System.out.println("Informar Brasil, Argentina ou Uruguai");
		}
		
	}

}
