package proyectotrivial;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MiClienteREST {
	
	// Realiza una peticion REST a la dirURL especificada.
	// Devuelve un String con la respuesta a la peticion.
	// Si se produce una excepcion, muestra el error y devuelve null
	public static String request(String dirURL) {

		try {
			
			// Creamos una URL y una conexion a URL
			URL url = new URL(dirURL);
			URLConnection urlConn = url.openConnection();

			// Creamos un InputStreamReader & BufferedReader para leer la respuesta
			InputStreamReader isr = new InputStreamReader(urlConn.getInputStream());
			BufferedReader br = new BufferedReader(isr);

			// Mientras el buffer no esto vacio, leemos chars y almacenamos en String
			String txt = "";
			int c;
			while ((c = br.read()) != -1) {
				txt = txt + (char) c;
			}

			// Cerramos el BufferedReader y el InputStreamReader
			br.close();
			isr.close();

			// Devolvemos la respuesta
			return txt;
			
		} catch (Exception e) {
			
			// Mostramos informacion de la excepcion
			System.out.println("Se ha producido una excepcion inesperada:");
			e.printStackTrace();
			
			// Devolvemos null
			return null;
		}
	}

}