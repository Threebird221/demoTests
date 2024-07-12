package test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.demo.Library.Library;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
		Library library = new Library();
		library.loadBooksFromJson("books_seed_data.json");
		System.out.println("Total books in library: " + library.getTotalBooks());
	}
}
