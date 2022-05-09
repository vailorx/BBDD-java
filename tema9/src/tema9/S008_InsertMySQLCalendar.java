package tema9;
import java.sql.*;
import java.util.Calendar;

public class S008_InsertMySQLCalendar {

  public static void main(String[] args)
  {
    try
    {
      // create a mysql database connection
      String myDriver = "com.mysql.cj.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/tallercochesPRO";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
    
      // create a sql date object so we can use it in our INSERT statement
      Calendar calendar = Calendar.getInstance();
      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

      // the mysql insert statement
      String query = " insert into averias (id, date, matricula, averia, status)"
        + " values (?, ?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setInt (1, 1);
      preparedStmt.setDate (2, startDate);
      preparedStmt.setString   (3, "zzz");
      preparedStmt.setString(4, "cristales");
      preparedStmt.setBoolean(5, false);

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
}