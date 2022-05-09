package BBDD;
import java.sql.*;

public class BBDD {
	public static void main(String args []) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//LA CONTRASEÑA CAMBIARLA ES LA DE SIEMPRE EN MINÚSCULAS
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/taller_de_coche","root","");
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from averias");
			//imprimir resultados
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ "  "+ rs.getString(2)+ "  "+rs.getString(3));
			}
			con.close();
		} catch(Exception e){
			System.out.println(e);
		}
	}

}
