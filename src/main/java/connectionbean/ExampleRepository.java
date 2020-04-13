package connectionbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ExampleRepository {

	public SqliteConnection conn;
	
	public ExampleRepository(SqliteConnection conn) {
		this.conn = conn;
	}
	
}
