package com.udemy.springboot.firstBootApp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/book")
	public List<Book> getBooks() {
		return Arrays.asList(new Book(1, "book1", "author2"));
	}

}
