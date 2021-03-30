package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Books;
import com.example.repository.BooksRepository;

@Service
public class BooksServiceImple implements BooksService {
	
	@Autowired
	private BooksRepository booksRepository;

	@Override
	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub
		return booksRepository.findAll();
	}

	@Override
	public void addBook(Books book) {
		// TODO Auto-generated method stub
		
		booksRepository.save(book);
		
	}
	public Books getBookbyISBN(long ISBN) {
		Optional<Books> optional = BooksRepository.findByISBN(ISBN);
		Books books = null;
		if(optional.isPresent()) {
			books =optional.get();
			}else {
				throw new RuntimeException("Book not found for ::"+ ISBN);
				}
		return books;
	}

	@Override
	public void save(Books books) {
		// TODO Auto-generated method stub
		
	}

}
