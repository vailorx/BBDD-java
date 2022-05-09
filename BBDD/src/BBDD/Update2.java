package BBDD;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

	
	    public class Update2 {
	    public static void main(String[] args) {

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/taller_de_coche", "root", "1234");
	// ? son incognitas
	            String query = "update averias set id = ? where matricula = ?";
	            PreparedStatement preparedStmt = con.prepareStatement(query);
	//param to search
	            preparedStmt.setInt(1, 1);
	            // 1º interrogación y lo que la sustituye
	            
	            preparedStmt.setString(2, "4382BPC");
	            //2º interrogación y lo que sustituye
	            preparedStmt.executeUpdate();
	            con.close();

	        }catch (Exception e) {
	            System.err.println("Error personaolizado");
	            System.err.println(e.getMessage());
	        }

	    }

	}


