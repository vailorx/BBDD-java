package ConexionMYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;			// Esto vale de tos maneras con java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;

public class E4_Consulta {

	static final String DB_URL = "jdbc:mysql://localhost:3306/tallercoches";
	
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * FROM averias";
	
	public static void main(String[] args) {

		try( Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); Statement stmt = conn.createStatement(); ) {
			
			ResultSet rs = stmt.executeQuery(QUERY);
			
			while( rs.next() ) {
				// Display Values
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("Plate: " + rs.getString("matricula"));
				System.out.println("Problem: " + rs.getString("averia") + "\n");
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}	
	}
}