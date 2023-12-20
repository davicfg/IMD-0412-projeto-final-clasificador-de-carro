package uber;

import java.util.ArrayList;

public class ModeloBlack {
	private ArrayList<Carro> carros = new ArrayList<Carro>();
	private final static int anoFabricacao = 2016;

	ModeloBlack(){
		// preecher o arraylist com os carros abaixo
		//      Marca       Modelo
		//		Alfa Romeo	Giulietta
		//		Chevrolet	Bolt
		//		Chevrolet	Captiva
		//		Chevrolet	Cruze
		//		Chevrolet	Equinox
		//		Chevrolet	Grand Vitara
		//		Chevrolet	Malibu
		//		Chevrolet	Tracker
		//		Chevrolet	Trailblazer
		//		Fiat	Fastback
		//		Fiat	Freemont
		//		Ford	Bronco
		//		Ford	Fusion
		
		Carro c = new Carro(true, 4, 5, anoFabricacao, Marca.ALFA_ROMEO, Modelo.GIGIULIETTA);
		this.carros.add(c);
		
		c = new Carro(true, 4, 5, anoFabricacao, Marca.CHEVROLET,Modelo.BOLT
		c = new Carro(true, 4, 5, anoFabricacao, Marca.CHEVROLET,Modelo.CAPTIVA
		c = new Carro(true, 4, 5, anoFabricacao, Marca.CHEVROLET,Modelo.
		c = new Carro(true, 4, 5, anoFabricacao, Marca.CHEVROLET,Modelo.
		c = new Carro(true, 4, 5, anoFabricacao, Marca.CHEVROLET,Modelo.
		c = new Carro(true, 4, 5, anoFabricacao, Marca.CHEVROLET,Modelo.
		c = new Carro(true, 4, 5, anoFabricacao, Marca.CHEVROLET,Modelo.
		c = new Carro(true, 4, 5, anoFabricacao, Marca.CHEVROLET,Modelo.
		c = new Carro(true, 4, 5, anoFabricacao, Marca.FIAT,Modelo.
		c = new Carro(true, 4, 5, anoFabricacao, Marca.FIAT,Modelo.
		c = new Carro(true, 4, 5, anoFabricacao, Marca.FORD,Modelo.
		c = new Carro(true, 4, 5, anoFabricacao, Marca.FORD,Modelo.
		
	}
}
