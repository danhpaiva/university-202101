package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import atividade.CalculosPesoIdeal;
import atividade.Pessoa;

public class CalculosPesoIdealTeste {
	CalculosPesoIdeal calculos;

	@Before
	public void setUp() {
		calculos = new CalculosPesoIdeal();
	}

	@Test
	public void testCalculosPesoIdeal() {
		assertEquals("Caso 01", 25, calculos.calculaPesoIdeal(new Pessoa(50, 1.65, 'm', 8)), 0.1);
		assertEquals("Caso 02", 52.8, calculos.calculaPesoIdeal(new Pessoa(70, 1.55, 'm', 25)), 0.1);
		assertEquals("Caso 03", 50.4, calculos.calculaPesoIdeal(new Pessoa(70, 1.55, 'f', 25)), 0.1);
		assertEquals("Caso 04", 97.2, calculos.calculaPesoIdeal(new Pessoa(80, 2.00, 'm', 65)), 0.1);
		assertEquals("Caso 05", 106, calculos.calculaPesoIdeal(new Pessoa(80, 2.00, 'f', 65)), 0.1);
		assertEquals("Caso 06", 100.4, calculos.calculaPesoIdeal(new Pessoa(80, 2.00, 'm', 73)), 0.1);
		assertEquals("Caso 07", 105.2, calculos.calculaPesoIdeal(new Pessoa(80, 2.00, 'f', 73)), 0.1);
		assertEquals("Caso 08", 95.6, calculos.calculaPesoIdeal(new Pessoa(80, 2.00, 'm', 79)), 0.1);
		assertEquals("Caso 09", 104.4, calculos.calculaPesoIdeal(new Pessoa(80, 2.00, 'f', 79)), 0.1);
		assertEquals("Caso 10", 94.8, calculos.calculaPesoIdeal(new Pessoa(80, 2.00, 'm', 81)), 0.1);
		assertEquals("Caso 11", 102, calculos.calculaPesoIdeal(new Pessoa(80, 2.00, 'f', 81)), 0.1);
		assertEquals("Caso 12", 92.4, calculos.calculaPesoIdeal(new Pessoa(80, 2.00, 'm', 96)), 0.1);
		assertEquals("Caso 13", 94.4, calculos.calculaPesoIdeal(new Pessoa(80, 2.00, 'f', 96)), 0.1);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCalculosPesoIdealEx() {
		assertEquals("Caso 14", 25, calculos.calculaPesoIdeal(new Pessoa(50, 1.65, 'm', 15)), 0.1);
	}

	@Test
	public void testCalcularIMC() {
		assertEquals("Caso 15", 29.4, calculos.calcularIMC(new Pessoa(90, 1.75, 'm', 45)), 0.1);
		assertEquals("Caso 16", 22, calculos.calcularIMC(new Pessoa(60, 1.65, 'f', 35)), 0.1);
	}

	@Test
	public void testClassificar() {
		assertEquals("Caso 17", "Abaixo do Peso", calculos.classificar(new Pessoa(50, 1.65, 'm', 25)));
		assertEquals("Caso 18", "Peso Normal", calculos.classificar(new Pessoa(60, 1.63, 'm', 25)));
		assertEquals("Caso 19", "Sobrepeso", calculos.classificar(new Pessoa(70, 1.63, 'm', 25)));
		assertEquals("Caso 20", "Obeso", calculos.classificar(new Pessoa(80, 1.63, 'm', 25)));
		assertEquals("Caso 21", "Obeso Mórbido", calculos.classificar(new Pessoa(150, 1.63, 'm', 25)));
	}

}
