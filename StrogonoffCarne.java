package sistemaRestaurante;

public class StrogonoffCarne extends Pratos {

	public StrogonoffCarne(String codigo, String nome, double valor) {
		super(codigo, nome, valor);
		
	}

	@Override
	public void composicaoPrato() {
		System.out.println("----------------------");
		System.out.println("Composição do prato:");
		System.out.println("Porção de arroz branco, Cubos de filé de alcatra cozidos ao molho do chefe, Batata palha");


		
	}

	@Override
	public void Preparar() {
		System.out.println("Em uma panela, adicione o óleo, a carne, a cebola, os tomates, o caldo de carne e deixe cozinhar por 20 minutos.");
		System.out.println("Acrescente o ketchup e o champignon e deixe cozinhar até obter um molho consistente e cremoso.");
		System.out.println("Desligue o fogo e acrescente o creme de leite sem soro.");
		System.out.println("Mexa até incorporar o molho ao creme.");
		System.out.println("Coloque em uma forma refratária e decore com tempero e batata palha.");
		
	}

}
