package sistemaRestaurante;

public class FileAparmegiana extends Pratos {

	public FileAparmegiana(String codigo, String nome, double valor) {
		super(codigo, nome, valor);
		
	}

	@Override
	public void composicaoPrato() {
		System.out.println("----------------------");
		System.out.println("Composição do prato:");
		System.out.println("Alcatra em bifes empanados e fritos, molho de tomate caseiro, queijo parmezão" + "\nqueijo mussarela, purê de batatas, espaguete");

	}

	@Override
	public void Preparar() {
		System.out.println("Tempere os filés com o alho, orégano, sal, pimenta e vinagre.");
		System.out.println("Passe pela farinha de rosca, nos ovos batidos e novamente pela farinha de rosca.");
		System.out.println("Frite em óleo quente.");
		System.out.println("Acomode os filés em um refratário regado com um pouco de molho.");
		System.out.println("Coloque fatias de mussarela sobre os filés e regue com o molho.");
		System.out.println("Polvilhe o queijo parmesão ralado.");
		System.out.println("Leve ao forno pré-aquecido para derreter a mussarela.");
		
		
	}

}
