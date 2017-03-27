package dk.mwl.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Bean
    public CommandLineRunner cliRunner(@Value("${greeter.name}") String greeterName) {
        return args -> System.out.println("Hello " + greeterName);
    }

    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
