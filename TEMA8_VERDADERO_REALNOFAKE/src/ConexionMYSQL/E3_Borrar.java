package ConexionMYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;			// Esto vale de tos maneras con java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;

public class E3_Borrar {

	static final String DB_URL = "jdbc:mysql://localhost:3306/tallercoches";
	
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * FROM averias";
	
	public static void main(String[] args) {

		try( Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); Statement stmt = conn.createStatement(); ) {
			
			String sql = "DELETE FROM averias";
			stmt.executeUpdate(sql);
			System.out.println("Registros borrados");
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}	
	}
}