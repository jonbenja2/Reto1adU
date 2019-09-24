package src.main.java.Reto1adU;

import java.io.IOException;

import src.main.java.Reto1adU.LectorDatosPorTeclado;

public class Launcher {

	public static void main(String[] args)throws IOException {
		
		String archivoCsv = "ArchivoCSV.csv";
		String archivoTxt = "ArchivoTxt.txt";
		String archivoXml = "datos.xml";
		LectorDatosPorTeclado.LectorDeAlfabetico();

		lecturaCSV.funcionesDeLectorCsv(archivoCsv);;
		lecturaTxt.funcionDeLectorDeTxt(archivoTxt);;
		lecturaXml.funcionDeLectorDeXML(archivoXml);
	}

}