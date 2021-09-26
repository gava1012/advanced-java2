package exp;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String connectionString = "jdbc:mysql://localhost:3306/people";

		var conn = DriverManager.getConnection(connectionString, "root", "hello");
		
		conn.setAutoCommit(false);

		String query2 = "insert into user (id, name) values (?,?);";

		var stmt2 = conn.prepareStatement(query2);

		stmt2.setInt(1, 6);
		stmt2.setString(2, "Alex");
		stmt2.execute();

		conn.commit();

		var stmt = conn.createStatement();

		String query = "select * from people.user";

		var resultSet = stmt.executeQuery(query);

		while (resultSet.next()) {
			System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name"));
		}

	}

}
