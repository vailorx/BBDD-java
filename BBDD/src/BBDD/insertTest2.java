package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class insertTest2 {
	static final String DB_URL =
			"jdbc:mysql://localhost/taller_de_coche";
	static final String USER = "root";
	static final String PASS = "1234";
	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
		){
			System.out.println("Insertando datos ...");
			String sql = "DELETE FROM averias where id='4'";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
