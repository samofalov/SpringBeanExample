package connectionbean;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {


	public static void main(String[] args) throws SQLException {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("app config loaded");
		
		ExampleService exampleService = appContext.getBean(ExampleService.class);
		
		System.out.println("Service Bean: " + exampleService);
		System.out.println("Repository Bean: " + exampleService.repository);
		System.out.println("Repository Connection Bean: " + exampleService.repository.conn);
		
		
	}

}
