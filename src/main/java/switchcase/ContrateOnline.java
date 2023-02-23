package switchcase;

public class ContrateOnline {

	public static void main(String[] args) {
		
int opcao = 10;
switch (opcao) {
case 1:
	System.out.println("Acessando Emprestimo pessoal Bradesco");
	break;
case 2:
	System.out.println("Acessando Cartoes de Credito");
	break;
case 3:
	System.out.println("Consorcios");
	break;
case 4:
	System.out.println("Seguro Dental");
	break;
case 5:
	System.out.println("Acessando Seguro auto");
	break;
case 6:
	System.out.println("Acessando Ágora Investimentos");
	break;
case 7:
	System.out.println("Acessando Veloe");
	break;
case 8:
	System.out.println("Acessando Bitz");
	break;
	
default:
	System.out.println("Opçao invalida. Informe de 1 a 8 ");
	break;
}

	}

}
