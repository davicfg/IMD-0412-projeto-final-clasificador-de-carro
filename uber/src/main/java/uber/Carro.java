package uber;

import java.util.Calendar;

public class Carro {
	private boolean arCondicionado;
	private int quantidadePortas;
	private int quantidadeLugares;
	private Calendar anoFabricacao;
	private Modelo modelo;
	private Marca marca;

	public Carro(boolean arCondicionado, int quantidadePortas, int quantidadeLugares, Calendar anoFabricacao,
			Modelo modelo, Marca marca) {
		this.arCondicionado = arCondicionado;
		this.quantidadePortas = quantidadePortas;
		this.quantidadeLugares = quantidadeLugares;
		this.anoFabricacao = anoFabricacao; //TODO https://stackoverflow.com/a/6678850 fazer uma função baseado nessa resposta
		this.modelo = modelo;
		this.marca = marca;
	}
}
