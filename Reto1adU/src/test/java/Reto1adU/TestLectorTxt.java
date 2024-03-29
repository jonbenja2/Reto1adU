package src.test.java.Reto1adU;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Test;
import src.main.java.Reto1adU.lecturaTxt;

public class TestLectorTxt {


	@Test
	public void testLectorTxt() throws IOException {
		boolean boleanoTest = true;
		String archivoTxtTest1 = "ArchivoTxt.txt";
		
		assertEquals(lecturaTxt.funcionDeLectorDeTxt(archivoTxtTest1),boleanoTest);
	}
	@Test
	public void test2LectorTxt() throws IOException {
		boolean boleanoTest = true;
		String archivoTxtTest2 = "ArchivoCsv.txt";
		
		assertNotEquals(lecturaTxt.funcionDeLectorDeTxt(archivoTxtTest2),boleanoTest);
	}
}
	  

