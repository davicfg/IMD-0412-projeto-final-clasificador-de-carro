package uber;

import java.util.ArrayList;

public class UberBlackValidador {
	private ArrayList<Carro> carros = new ArrayList<Carro>();
	private final static boolean arCondicionado= true;
	private final static int quantidadePortas= 4;
	private final static int quantidadeLugares= 5;
	private final static int anoFabricacao = 2016;
	

	UberBlackValidador() {
		Carro c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.ALFA_ROMEO, Modelo.GIGIULIETTA);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.BOLT);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.CAPTIVA);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.EQUINOX);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.GRAND_VITARA);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.MALIBU);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.CRUZE);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.TRACKER);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.TRAILBLAZER);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.FIAT, Modelo.FASTBACK);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.FIAT, Modelo.FREEMONT);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.FORD, Modelo.BRONCO);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.FORD, Modelo.FUSION);
		this.carros.add(c);
	}
	
	
	public boolean validar(Carro c) {
		if(this.quantidadePortas(c) && this.quantidadeLugares(c) && this.anoFrabricao(c) && this.MarcaModelo(c)) {
			return true;
		}
		return false;
	}

	private boolean quantidadePortas(Carro c) {
		return c.getQuantidadePortas() == 4;
	}
	
	private boolean quantidadeLugares(Carro c) {
		return c.getQuantidadeLugares() == 5;
	}
	
	private boolean anoFrabricao(Carro c) {
		return c.getAnoFabricacao() >= 2016;
	}
	
	private boolean MarcaModelo(Carro c) {
		for (Carro carro : this.carros) {
			if(carro.equals(c))
				return true;
		}
		
		return false;
	}
	
}
