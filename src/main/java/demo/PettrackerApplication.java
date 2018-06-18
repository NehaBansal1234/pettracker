package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller","service"})
public class PettrackerApplication {

	public static void main(String[] args) {
		System.out.println("Hello Main");
		SpringApplication.run(PettrackerApplication.class, args);
	}
}
