package com.example.service;

import java.util.List;
import com.example.model.Books; 

public interface BooksService {
	
	List<Books>getAllBooks();
	void addBook(Books book);
	void save(Books books);

}
