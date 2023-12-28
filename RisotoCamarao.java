package sistemaRestaurante;

public class RisotoCamarao extends Pratos {

	public RisotoCamarao(String codigo, String nome, double valor) {
		super(codigo, nome, valor);
		
	}

	@Override
	public void composicaoPrato() {
		System.out.println("----------------------");
		System.out.println("Composição do prato:");
		System.out.println("Arroz cozido junto com filé de camarão ao molho da casa, queijo mussarela de búfola e batatas gratinadas.");

	
		
	}

	@Override
	public void Preparar() {
		System.out.println("Tempere o camarão com limão e sal, reserve por 10 minutos.");
		System.out.println("Enquanto isso, faça o arroz, fritando-o muito bem.");
		System.out.println("Em seguida, coloque água em uma panela, o suficiente para cobrir o arroz.");
		System.out.println("Coloque pouco sal, pois o molho do camarão levará o cubo de caldo de camarão.");
		System.out.println("Cozinhe em fogo baixo até que toda água seque.");
		System.out.println("E uma frigideira grande, que caiba todo o camarão, doure o alho e coloque todo o camarão sem o suco do limão.");
		
	}
	

}
