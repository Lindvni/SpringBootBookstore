package com.example.LibrarySystem.service;

import com.example.LibrarySystem.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookService {
    List<Book> getAllbook();
    Book getBookById(long id);
    void deleteBookById(long id);
    void saveBook(Book book);
}
