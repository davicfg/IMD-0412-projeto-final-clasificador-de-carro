package uber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UberBlackTest {

	@Test	
	void validarCarroUberBlack() {
		Carro c = new Carro(true, 4, 5, 2010, Marca.ALFA_ROMEO, Modelo.GIGIULIETTA);
		
		ModeloBlack black = new ModeloBlack();
		
		boolean resultado = black.validar();
		
		Assertions.assertNull(resultado);
	}
}
