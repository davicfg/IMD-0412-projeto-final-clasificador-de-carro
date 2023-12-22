package uber;

import java.util.Calendar;

public class Carro {
	private boolean arCondicionado;
	private int quantidadePortas;
	private int quantidadeLugares;
	private Calendar anoFabricacao;
	private Marca marca;
	private Modelo modelo;

	public Carro(boolean arCondicionado, int quantidadePortas, int quantidadeLugares, int anoFabricacao,
			Marca marca, Modelo modelo) {
		this.arCondicionado = arCondicionado;
		this.quantidadePortas = quantidadePortas;
		this.quantidadeLugares = quantidadeLugares;
		this.anoFabricacao = Calendar.getInstance();
		this.anoFabricacao.set(Calendar.YEAR, anoFabricacao);
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public int getQuantidadePortas() {
		return this.quantidadePortas;
	}

	public int getQuantidadeLugares() {
		// TODO Auto-generated method stub
		return this.quantidadeLugares;
	}

}
