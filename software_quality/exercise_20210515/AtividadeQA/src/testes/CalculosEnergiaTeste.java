package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import atividade.CalculosEnergia;
import atividade.Pessoa;

public class CalculosEnergiaTeste {

	CalculosEnergia calculos;
	
	@Before
	public void setUp() {
		calculos = new CalculosEnergia();
	}

	@Test
	public void testNecessidadeDiaria() {
		assertEquals("Caso 01", 3076.5, calculos.necessidadeDiaria(new Pessoa(80, 1.74, 'm', 15, 3)), 0.1);
		assertEquals("Caso 02", 1534.2, calculos.necessidadeDiaria(new Pessoa(65, 1.6, 'f', 69, 1)), 0.1);
		assertEquals("Caso 03", 3618.2, calculos.necessidadeDiaria(new Pessoa(87, 1.85, 'm', 25, 5)), 0.1);
		assertEquals("Caso 04", 2392.6, calculos.necessidadeDiaria(new Pessoa(62, 1.67, 'f', 28, 5)), 0.1);
		assertEquals("Caso 05", 2036.2, calculos.necessidadeDiaria(new Pessoa(94, 1.78, 'm', 34, 1)), 0.1);
		assertEquals("Caso 06", 2111.7, calculos.necessidadeDiaria(new Pessoa(72, 1.72, 'f', 17, 2)), 0.1);
		assertEquals("Caso 07", 3047.2, calculos.necessidadeDiaria(new Pessoa(105, 2, 'm', 90, 4)), 0.1);
		assertEquals("Caso 08", 1922.1, calculos.necessidadeDiaria(new Pessoa(52, 1.55, 'f', 56, 4)), 0.1);
		assertEquals("Caso 09", 2180.6, calculos.necessidadeDiaria(new Pessoa(78, 1.8, 'm', 46, 2)), 0.1);
		assertEquals("Caso 10", 1908.5, calculos.necessidadeDiaria(new Pessoa(56, 1.63, 'f', 39, 3)), 0.1);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNecessidadeDiariaEx() {
		assertEquals("Caso 11", 1750, calculos.necessidadeDiaria(new Pessoa(50, 1.65, 'm', 7, 2)), 0.1);
	}

}
