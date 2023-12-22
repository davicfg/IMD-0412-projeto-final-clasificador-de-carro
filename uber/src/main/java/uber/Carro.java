package uber;

import java.util.Calendar;
import java.util.Objects;

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

	public int getAnoFabricacao() {
		return this.anoFabricacao.get(Calendar.YEAR);
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoFabricacao, arCondicionado, marca, modelo, quantidadeLugares, quantidadePortas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(anoFabricacao, other.anoFabricacao) && arCondicionado == other.arCondicionado
				&& marca == other.marca && modelo == other.modelo && quantidadeLugares == other.quantidadeLugares
				&& quantidadePortas == other.quantidadePortas;
	}
	
	

}
