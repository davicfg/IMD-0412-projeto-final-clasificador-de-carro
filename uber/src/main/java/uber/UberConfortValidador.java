package uber;

import java.util.ArrayList;

public class UberConfortValidador {
	private ArrayList<Carro> carros = new ArrayList<Carro>();
	private final static boolean arCondicionado= true;
	private final static int quantidadePortas= 4;
	private final static int quantidadeLugares= 5;
	private final static int anoFabricacao = 2015;
	

	UberConfortValidador() {
		Carro c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.FIAT, Modelo.PULSE);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.ONIXPLUS);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.SPIN);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHERRY, Modelo.TIGGO);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHERRY, Modelo.TIGGO8);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.CAPTIVA);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.CRUZE);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.TRACKER);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.CHEVROLET, Modelo.TRAILBLAZER);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.FIAT, Modelo.IDEAATTRACTIVE);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.FIAT, Modelo.CRONOS);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.FORD, Modelo.BRONCO);
		this.carros.add(c);
		c = new Carro(arCondicionado, quantidadePortas, quantidadeLugares, anoFabricacao, Marca.FORD, Modelo.ECOSPORT);
		this.carros.add(c);
	}
	
	
	public boolean validar(Carro c) {
		if(this.quantidadePortas(c) && this.quantidadeLugares(c) && this.anoFrabricao(c) && this.MarcaModelo(c)) {
			return true;
		}
		return false;
	}

	private boolean quantidadePortas(Carro c) {
		return c.getQuantidadePortas() == quantidadePortas;
	}
	
	private boolean quantidadeLugares(Carro c) {
		return c.getQuantidadeLugares() == quantidadeLugares;
	}
	
	private boolean anoFrabricao(Carro c) {
		return c.getAnoFabricacao() >= anoFabricacao;
	}
	
	private boolean MarcaModelo(Carro c) {
		for (Carro carro : this.carros) {
			if(carro.equals(c))
				return true;
		}
		
		return false;
	}
	
}
