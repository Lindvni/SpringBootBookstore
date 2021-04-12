package com.example.LibrarySystem.Service;

import com.example.LibrarySystem.Model.book;
import com.example.LibrarySystem.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Book;
import java.util.List;

public class BookServiceImple implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public List<book> getAllbook() {
        return bookRepo.findAll();
    }

    @Override
    public void save(Book book) {

    }
}
