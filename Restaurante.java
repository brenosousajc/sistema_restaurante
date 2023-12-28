package sistemaRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante implements Cardapio {
	
	List<String> listaPratos = new ArrayList <>();
//	List<Double> listaValor = new ArrayList <>();
//	
//
//	public void somarValorPratos(double valor) {
//		
//	}
	
	@Override
	public void adicionarPrato(String prato) {
		listaPratos.add(prato);
		
	}

	@Override
	public void removerPrato(String prato) {
		if(listaPratos.contains(prato)) { //aqui uma condição para verificar o que foi digitado(o prato) existe na lista dos pratos.
			listaPratos.remove(prato);
		}else {
			System.out.println("Esse prato não existe na Lista.");
		}
		
	}

	@Override
	public void listaDosPratos() {
		System.out.println(listaPratos);
		
	}

	
	
	
}
