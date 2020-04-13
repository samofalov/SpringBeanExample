package connectionbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"connectionbean"})
public class AppConfig {

	/*
	@Bean(name = "connection")
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/Database.db");
		return conn;
	}
	*/
}
