package dk.mwl.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping
    public String root(@Value("${greeter.name}") String greeterName) {
        return "Hello " + greeterName;
    }

    @Bean
    public CommandLineRunner cliRunner(@Value("${greeter.name}") String greeterName) {
        return args -> System.out.println("Hello " + greeterName);
    }

    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
