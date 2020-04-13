package connectionbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
	
	@Autowired
	ExampleRepository repository;
	
	public void getResponseFromRepository() {
		
		System.out.println("Repository bean: " + repository);
		System.out.println("Connection bean: " + repository.conn);
		
	}
}
