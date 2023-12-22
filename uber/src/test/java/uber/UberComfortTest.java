package uber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UberComfortTest {
    
    @Test	
	void numeroDePortasInferior() {
		Carro c = new Carro(true, 3, 5, 2015, Marca.FIAT, Modelo.PULSE);
		
		UberConfortValidador confort = new UberConfortValidador();
		
		boolean resultado = confort.validar(c);
		
		Assertions.assertFalse(resultado);
	}
	
	@Test	
	void numeroAcentosInFerior() {
		Carro c = new Carro(true, 4, 4, 2018, Marca.CHERRY, Modelo.TIGGO);
		
		UberConfortValidador confort = new UberConfortValidador();
		
		boolean resultado = confort.validar(c);
		
		Assertions.assertFalse(resultado);
	}
	
	@Test	
	void anoDoVeiculoInferior() {
		Carro c = new Carro(true, 4, 5, 2011, Marca.CHEVROLET, Modelo.ONIXPLUS);
		
		UberConfortValidador confort = new UberConfortValidador();
		
		boolean resultado = confort.validar(c);
		
		Assertions.assertFalse(resultado);
	}
	
	@Test	
	void marcaEModeloNaoAceito() {
		Carro c = new Carro(true, 4, 5, 2018, Marca.FORD, Modelo.ECOSPORT);
		
		UberConfortValidador confort = new UberConfortValidador();
		
		boolean resultado = confort.validar(c);
		
		Assertions.assertFalse(resultado);
	}

}