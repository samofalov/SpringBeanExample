package connectionbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class SqliteConnection {

	Connection conn;
	
	public SqliteConnection() throws SQLException {
		conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/Database.db");
	}
}
