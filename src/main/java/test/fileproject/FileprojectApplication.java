package test.fileproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FileprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileprojectApplication.class, args);
	}

}
