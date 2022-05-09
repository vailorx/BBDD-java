package ConexionMYSQL;
import java.sql.*;

public class E2_Conexion {

	public static void main(String[] args) {

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/tallercoches" , "root" , "");	
		// Siempre se le pasa 3 parametros: 1º Donde esta mysql, puerto, y nombre de bbdd. 2º Usuario mysql. 3º Contraseña (no).
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM averias WHERE id = 1"); // ResultSet es un array realmente.
			
			while( rs.next() ) { // Mientras que rs tenga cosas dentro, ejecuta el sysout
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
				// Imprime el primer campo, el segundo y el tercero
			}
			
			con.close(); // La conexión siempre se cierra después
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}