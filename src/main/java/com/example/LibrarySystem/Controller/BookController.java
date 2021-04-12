package com.example.LibrarySystem.Controller;

import com.example.LibrarySystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.print.Book;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listBook", bookService.getAllbook());
        return "index";
    }

    @RequestMapping("/new")
    public String showNewBookForm(Model model) {
        Book book = new Book();
        model.addAttribute("book",book);
        return "new book";
    }
    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String saveBook(@ModelAttribute("books")Book book) {
        bookService.save(book);
        return "redirect/";
    }

}
