package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_example_2 {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			//establish Connection object
			Connection conn = DriverManager.getConnection(url, "root", "pancyparkinson@2000");
			
			//create a statement object to send to the database
			
			Statement statement = conn.createStatement();
			
			//execute the Statement object
			
			int rowsAffected = statement.executeUpdate("insert into employees_tbl(id, name, dept, salary) values(1200, 'Kaykay', 'HR', 8000)");
			
			//display a message
			
			System.out.println("Executed an Insert statement.");
			System.out.println("\nNo. of rows affected: " + rowsAffected);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while updating.");
		}

	}
}
