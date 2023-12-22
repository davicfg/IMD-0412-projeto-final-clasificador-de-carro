package uber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UberBlackTest {

	@Test	
	void numeroDePortasInferior() {
		Carro c = new Carro(true, 3, 5, 2017, Marca.ALFA_ROMEO, Modelo.GIGIULIETTA);
		
		ModeloBlack black = new ModeloBlack();
		
		boolean resultado = black.validar(c);
		
		Assertions.assertFalse(resultado);
	}
	
	@Test	
	void numeroAcentosInFerior() {
		Carro c = new Carro(true, 4, 4, 2018, Marca.ALFA_ROMEO, Modelo.GIGIULIETTA);
		
		ModeloBlack black = new ModeloBlack();
		
		boolean resultado = black.validar(c);
		
		Assertions.assertFalse(resultado);
	}
}
