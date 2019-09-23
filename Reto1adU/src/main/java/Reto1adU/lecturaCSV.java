package Reto1adU;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class lecturaCSV {
	public static final String SEPARATOR=";";
	public static final String QUOTE="\"";
	public static void funcionesDeLectorCsv(String archivo)  throws IOException 
	{
		/**Lo primero es abrir el fichero para leerlo. Puesto que es un fichero de texto con l�neas, una clase c�moda para leerlo 
	       * es BufferedReader, que admite en su constructor un FileReader. Esto nos permitir� usar el m�todo readLine() para ir leyendo 
	       * l�neas de una en una.
	       */
		
		BufferedReader br = null;
		
		try 
		{     
			br =new BufferedReader(new FileReader(archivo));
			String line = br.readLine();
			
			/**
			 * Un bucle mientras haya l�neas, es decir, mientras readLine() no lea null. 
			 * Puesto que el separador que usamos es el punto y coma, una forma f�cil de partir la cadena es usar el m�todo split() 
			 * de la clase String. 
			 * La l�nea String [] fields = line.split(SEPARATOR); parte la l�nea usando el separador y nos devuelve un array de String
			 * con tantos elementos como campos. Por ejemplo, para la primera l�nea del CSV que contiene "uno";"dos";"tres", nos devolver�a 
			 * un array de tres String, con los valores "uno", "dos" y "tres". 
			 * Un detalle a tener en cuenta, es que nos dejar� las comillas en los valores, as� que tendremos "uno" con sus dos comillas,
			 * una a cada lado, y as� con todos los dem�s valores.
			 */
			
			while (null!=line) 
			{
				String [] fields = line.split(SEPARATOR);
				System.out.println(Arrays.toString(fields));
				/*fields = removeTrailingQuotes(fields);
				System.out.println(Arrays.toString(fields));*/
				line = br.readLine();
			}
   
		}
		catch (Exception e)
		{
			//Insercci�n excepci�n correspondiente
		}
		finally
		{
			if (null!=br) {
          br.close();
			}
		}
	}
	 /*/**Si queremos quitar estas comillas, hemos creado un m�todo removeTrailingQuotes() al que pasamos nuestro array de String
	  * y nos devuelve con los mismos elementos, pero sin comillas.
	  */
	
	/*private static String[] removeTrailingQuotes(String[] fields) 
	{
		/**Creamos un array de String para guardar los resultados con la misma longitud que el array que nos pasan.
		String result[] = new String[fields.length];
		
		/**
		 *  Hacemos un bucle para ir recorriendo cada uno de los elementos.
		 *  Para quitar las comillas, usamos el m�todo replaceAll() de la clase String. Este m�todo admite como primer par�metro
		 *  una expresi�n regular y como segundo par�metro el nuevo valor que queremos poner. En nuestro ejemplo: 
		 *  En expresiones regulares, un ^ indica principio de la cadena. As� que ^" quiere decir unas comillas al principio de la cadena.
		 *  As� que reemplazamos ^" por nada (cadena vac�a "").
		 *  En expresiones regulares, un $ indica final de la cadena. As� que "$ quiere decir unas comillas al final de la cadena. 
		 *  s� que reemplazamos "$ por nada (cadena vac�a "")
		 *  Con esto quitamos las comillas del principio y del final en cada valor. A partir de ah�, s�lo queda hacer lo que tengamos 
		 *  que hacer con cada valor, que en nuestro ejemplo s�lo es sacarlo por pantalla.
		 * 
		for (int i=0;i<result.length;i++)
		{
			result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
		}
		
		return result;
   } */
}
