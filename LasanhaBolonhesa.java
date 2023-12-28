package sistemaRestaurante;

public class LasanhaBolonhesa extends Pratos {

	public LasanhaBolonhesa(String codigo, String nome, double valor) {
		super(codigo, nome, valor);
		
	}

	@Override
	public void composicaoPrato() {
		System.out.println("Massa para Lasanha cozida com leve pitada de sal");
		System.out.println("Molho de tomate");
		System.out.println("Molho branco do chef");
		System.out.println("Carne moída cozida com tempero do chef");
		System.out.println("Camadas de queijo muszzarela");
		System.out.println("Camadas de prezunto");
		
	}

	@Override
	public void Preparar() {
		System.out.println("Cozinhe a massa da lasanha em aproximadamente em 2 litros de água por 5 minutos");
		System.out.println("Em uma panela cozinhe a carne moída, depois de cozida coloque molho de tomate, o sal e temperos a gosto");
		System.out.println("Comece montando com uma camada de molho, a massa da lasanha, o presunto e o queijo");
		System.out.println("Faça esse processo até tudo terminar.");
		System.out.println("Aqueça o forno a 180º C durante 5 minutos.");
		System.out.println("Coloque a lasanha no forno de 20 a 30 minutos.");
		
	}

	
}
