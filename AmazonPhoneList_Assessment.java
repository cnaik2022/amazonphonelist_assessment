package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AmazonPhoneList_Assessment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/amazon_mobilephones";
		String username = "root";
		String password = "root";
		String query = "Select * from phonelist";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			System.out.print("Make: " + rs.getString("Make") + "\t");
			System.out.print("Model: " + rs.getString("Model") + "\t");
			System.out.print("Color: " + rs.getString("Color") + "\t");
			System.out.print("Storage: " + rs.getString("Storage") + "\t");
			System.out.print("Price_USDollars: " + rs.getString("Price_USDollars") + "\t");
			System.out.println();

			      
		}

	}

}