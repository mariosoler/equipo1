package Equipo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculos {
	
	private Calculos calculos= new Calculos();
	private int resultado;
	
	@Test
	public void test_suma() {
		resultado=calculos.suma(3, 4);
		org.junit.Assert.assertEquals(7, resultado);
	}
	@Test
	public void test_resta() {
		resultado=calculos.resta(3, 2);
		org.junit.Assert.assertEquals(1, resultado);
	}
	@Test
	public void test_multiplicar() {
		resultado=calculos.multiplicar(2, 2);
		org.junit.Assert.assertEquals(4, resultado);
	}

}
