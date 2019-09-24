package src.test.java.Reto1adU;

import static org.junit.Assert.*;

import org.junit.Test;
import src.main.java.Reto1adU.lecturaXml;

public class TestLectorXML {

	@Test
	public void testLectorXML() {
		boolean boleanoTest = true;
		String archivoXmlTest = "datos.xml";
		
		assertEquals(lecturaXml.funcionDeLectorDeXML(archivoXmlTest),boleanoTest);
	}
	
	@Test
	public void test2LectorXML() {
		boolean boleanoTest = true;
		String archivoXmlTest = "datox.xml";
		
		assertNotEquals(lecturaXml.funcionDeLectorDeXML(archivoXmlTest),boleanoTest);
	}

}
