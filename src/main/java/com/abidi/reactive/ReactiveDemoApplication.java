package com.abidi.reactive;

import com.abidi.reactive.student.Student;
import com.abidi.reactive.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner(StudentRepository repository) {
		return args -> {
			for (int i = 0; i < 3000; i++) {
				repository.save(
						Student.builder()
								.firstname("Test" + i)
								.lastname("test" + i)
								.age(i)
								.build()
				).subscribe();
			}
		};
	}
}
