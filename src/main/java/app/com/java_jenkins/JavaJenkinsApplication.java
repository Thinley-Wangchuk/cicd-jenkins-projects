package app.com.java_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Hello world1 ");
		System.out.println("Hello world2 ");
		System.out.println("Hello world3 ");
		SpringApplication.run(JavaJenkinsApplication.class, args);
	}

}
