package ${{values.java_package_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ${{values.component_id}}Application {

	public static void main(String[] args) {
		SpringApplication.run(${{values.component_id}}Application.class, args);
	}

}
