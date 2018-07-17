package br.edu.unifessapa.engsoft.calculadora.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.unifessapa.engsoft.calculadora.Calculadora;

public class CalculadoraTest {
	private Calculadora calculadora;
	private Double result;
	
	@Before
	public void setup() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testDividir() {
		result = calculadora.dividir(20.0, 2.0);
		assertEquals(10.0, result, 0);
	}
	@Test
	public void testDividirNumeroGrande() {
		result = calculadora.dividir(8000000000000000000000000000000000000000000000000.0, 2.0);
		assertEquals(4000000000000000000000000000000000000000000000000.0, result, 0);
	}@Test
	public void testDivisorNegativo() {
		result = calculadora.dividir(-5.0, 2.0);
		assertEquals(-2.5, result, 0);
	}
	@Test
	public void testDividendoNegativo() {
		result = calculadora.dividir(24.0, -2.0);
		assertEquals(-12.0, result, 0);
	}
	
	@Test
	public void testDivisorIsFracionario() {
		result = calculadora.dividir(8.0, 0.5);
		assertEquals(16.0, result, 0);
	}
	@Test
	public void testDividendoIsFracionario() {
		result = calculadora.dividir(0.1, 2.0);
		assertEquals(0.05, result, 0);
	}
	@Test(expected=RuntimeException.class)
	public void testDividendoIsZero() {
		result = calculadora.dividir(10.0, 0.0);
	}

}
