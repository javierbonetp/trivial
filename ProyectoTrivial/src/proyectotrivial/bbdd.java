package trivial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author javpin
 */
import java.sql.*;

public class bbdd {

public static void main(String[] args) throws SQLException {


// Establecemos la conexión con el servidor MySQL

Connection con = null;
String sURL = "jdbc:mysql://localhost:3306/trivial";
con = DriverManager.getConnection(sURL,"root","eroles");
//String sURL = "jdbc:mysql://localhost:3306/nombrebasededatos";
//con = DriverManager.getConnection(sURL,"usuario","contraseña");

// Escribimos la sentencia SQL que posibilita realizar una consulta de los nombres de productos de una tabla productos.


try (PreparedStatement stmt = con.prepareStatement("SELECT nom FROM productos")) {
ResultSet rs = stmt.executeQuery();

while (rs.next())
System.out.println (rs.getString("nom"));

} catch (SQLException sqle) { 
System.out.println("Error en la ejecución:" 
+ sqle.getErrorCode() + " " + sqle.getMessage()); 
}

}
}