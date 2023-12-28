package sistemaRestaurante;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pratos risoto = new RisotoCamarao("001", "Risoto de Camarão", 80.00);
		Pratos strogonofe = new StrogonoffCarne("002", "Strogonof de Carne", 40.00);
		Pratos parmegiana = new FileAparmegiana("003", "Filé a Parmegiana", 50.00);
		Pratos lasanha = new LasanhaBolonhesa("004", "Lasanha Bolonhesa", 60.00);
		Restaurante restaurante = new Restaurante();
		
		System.out.println("*--*--*--*--*--*--*--*--*--*--*--*--*");
		System.out.println("Bem-Vindo ao restaurante Bucho Cheio!");
		System.out.println("*--*--*--*--*--*--*--*--*--*--*--*--*");
		System.out.println("Digite [1] para clientes." + "\nDigite [2] para administrador." + "\nDigite [0] para sair.");
		double total_pagamento = 0; //variável que irá receber os valores dos pratos comprados pelo usuário
		int opcao = scan.nextInt();
		int validador = 99; //condição para deixar o laço "do while" funcionando. Se o validador for = 0 o laço vai parar.
		if(opcao == 1) {
			do {
			System.out.println("Escolha uma das opções:" + "\n[1] Risoto de Camarão" + "\n[2] Strogonofe" + "\n[3] Filé a Parmegiana" + "\n[4] Lasanha a Bolonhesa");
			int opcao2 = scan.nextInt();
			if(opcao2 == 1) {
				risoto.composicaoPrato(); //mostra para cliente o que contém no prato
				System.out.println("Valor R$ " + risoto.getValor());
				System.out.println("Deseja comprar esse prato? [1] Sim ou [0] Voltar ao menu");
				int opcaoComprarRisoto = scan.nextInt();
				if(opcaoComprarRisoto == 1) {
					System.out.println(risoto.getNome() + " adicionado no carrinho. Valor R$ " + risoto.getValor());
					total_pagamento += risoto.getValor();
					restaurante.adicionarPrato(risoto.getNome()); //aqui adiciou o prato na lista de pratos escolhido pelo cliente.
					System.out.println("Digite [1] para pagamento ou [2] para escolher outro prato.");
					int opcaoContCompra = scan.nextInt();
					if(opcaoContCompra == 1 ) {
						validador = 0;
					}// do 3° if do laço.
				}// do 2° if do laço.				
			}//do 1° if do laço.
			else if (opcao2 == 2) {
				strogonofe.composicaoPrato();
				System.out.println("Valor R$ " + strogonofe.getValor());
				System.out.println("Deseja comprar esse prato? [1] Sim ou [0] Voltar ao menu");
				int opcaoComprarStrogonofe = scan.nextInt();
				if(opcaoComprarStrogonofe == 1) {
					System.out.println(strogonofe.getNome() + " adicionado na lista. Valor R$ " + strogonofe.getValor());
					total_pagamento += strogonofe.getValor();
					restaurante.adicionarPrato(strogonofe.getNome());
					System.out.println("Digite [1] para pagamento ou [2] para escolher outro prato.");
					int opcaoContCompra = scan.nextInt();
					if(opcaoContCompra == 1) {
						validador = 0; //aqui encerra o menu e vai para pagamento
					}
				}
			}
			else if(opcao2 == 3) {
				parmegiana.composicaoPrato();
				System.out.println("Valor R$ " + parmegiana.getValor());
				System.out.println("Deseja comprar esse prato? [1] Sim ou [0] Voltar ao menu");
				int opcaoComprarParmegiana = scan.nextInt();
				if(opcaoComprarParmegiana == 1) {
					System.out.println(parmegiana.getNome() + " adicionado na lista. Valor R$ " + parmegiana.getValor());
					total_pagamento += parmegiana.getValor();
					restaurante.adicionarPrato(parmegiana.getNome());
					System.out.println("Digite [1] para pagamento ou [2] para escolher outro prato.");
					int opcaoContCompra = scan.nextInt();
					if(opcaoContCompra == 1) {
						validador = 0; //aqui encerra o menu e vai para pagamento
					}
				}
			}
			else if(opcao2 == 4) {
				lasanha.composicaoPrato();
				System.out.println("Valor R$ " + lasanha.getValor());
				System.out.println("Deseja comprar esse prato? [1] Sim ou [0] Voltar ao menu");
				int opcaoComprarLasanha = scan.nextInt();
				if(opcaoComprarLasanha == 1) {
					System.out.println(lasanha.getNome() + " adicionado na lista. Valor R$ " + lasanha.getValor());
					total_pagamento += lasanha.getValor();
					restaurante.adicionarPrato(lasanha.getNome());
					System.out.println("Digite [1] para pagamento ou [2] para escolher outro prato.");
					int opcaoContCompra = scan.nextInt();
					if(opcaoContCompra == 1) {
						validador = 0; //aqui encerra o menu e vai para pagamento
					}
				}
			}
			
			}while(validador != 0);	
			System.out.println("Pratos escolhidos: " + restaurante.listaPratos);
			System.out.println("Total a pagar RS " + total_pagamento);								
			
		}//do primeiro if do código.
		else if(opcao == 2)	{ // aqui é a opção do 1° menu.
			int senha = 25369;
			System.out.println("Digite a senha:"); // aqui é a 1° tentativa da senha, se errar entrará no laço e repetirá a pergunta
			senha = scan.nextInt();
			if(senha != 25369) { 
				while(senha != 25369) { //se erra a 1° tentativa da senha esse laço será ativado e só vai sair se acertar a senha.
					System.out.println("Senha Inválida. Tente Novamente...");
					senha = scan.nextInt();
				}
			}
			System.out.println("Escolha uma das opções:" + "\n[1] Visualizar modo de praparo" + "\n[2] Adicionar Prato" + "\n[3] Remover Prato");
			int opcao_adm = scan.nextInt();
			if(opcao_adm == 1) {
				System.out.println("Escolha o prato:" + "\n[1] Risoto de Camarão" + "\n[2] Strogonofe" + "\n[3] Filé a Parmegiana" + "\n[4] Lasanha a Bolonhesa");
				int escolhaModoPreparo = scan.nextInt();
				if(escolhaModoPreparo == 1) {
					risoto.Preparar();
				}
				else if(escolhaModoPreparo == 2) {
					strogonofe.Preparar();
				}
				else if(escolhaModoPreparo == 3) {
					parmegiana.Preparar();
				}
				else if(escolhaModoPreparo == 4) {
					lasanha.Preparar();
				}
				else {
					System.out.println("Opção Inválida.");
				}
			}
			else if (opcao_adm == 2) {
				System.out.println("Em construção...");
			}
			else if (opcao_adm == 3) {
				System.out.println("Em construção...");
			}
			
			
		}			
		
			
			

				
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
