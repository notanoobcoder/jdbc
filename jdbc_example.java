package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_example {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			//establish Connection object
			Connection conn = DriverManager.getConnection(url, "root", "pancyparkinson@2000");
			
			//create a Statement object to send to the database
			
			Statement statement = conn.createStatement();
			
			//execute the Statement object
			
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
			
			//process the result
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("salary "));
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
