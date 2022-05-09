package BBDD;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

	public class Update {

	    public static void main(String[] args) {

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/taller_de_coche", "root", "1234");

	            String query = "update averias set id = 4 where id = 1";
	            PreparedStatement preparedStmt = con.prepareStatement(query);

	            preparedStmt.executeUpdate();
	            con.close();

	        }catch (Exception e) {
	            System.err.println("Error personalizado");
	            System.err.println(e.getMessage());
	        }

	    }

	}

