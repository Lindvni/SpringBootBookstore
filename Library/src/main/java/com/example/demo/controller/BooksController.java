package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Books;
import com.example.service.BooksService;


@Controller
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listBooks", booksService.getAllBooks());
		return "index";
	}
	@RequestMapping("/new")
	public String showNewBookForm(Model model) {
		Books books = new Books();
		model.addAttribute("books",books);
		return "new books";
	}
	@RequestMapping(value="/save", method =RequestMethod.POST)
	public String saveBook(@ModelAttribute("books")Books books) {
		booksService.save(books);
		return "redirect/";
	}
//	@RequestMapping("/edit/{id}")
//	public ModelAndView showEditProductForm(@PathVariable (name ="id") Long id){
//		ModelAndView mod = new ModelAndView("edit_books");
//		
//		Books books = booksService.get(id);
//		mod.addObject("books",books);
//		return mod;
//	}
	


}
