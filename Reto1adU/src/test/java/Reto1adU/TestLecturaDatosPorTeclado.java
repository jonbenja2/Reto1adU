package src.test.java.Reto1adU;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Scanner;

import org.junit.Test;
import src.main.java.Reto1adU.LectorDatosPorTeclado;

public class TestLecturaDatosPorTeclado {

	
	@Test
	public void test1() {

		boolean boleanoTest = true;
		assertEquals(LectorDatosPorTeclado.LectorDeAlfabetico(),boleanoTest);
		
	}
	@Test
	public void test1Falso() {

		boolean boleanoTest = true;
		assertNotEquals(LectorDatosPorTeclado.LectorDeAlfabetico(),boleanoTest);
		
	}

}
