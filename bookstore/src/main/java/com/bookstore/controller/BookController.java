package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	 @GetMapping("/book_register")
	    public String bookRegister() {
	        return "bookRegister"; // maps to bookReg.html in templates
	    }
	 
      	 @GetMapping("/available_books")
	 public String getAllBook() {
		 return "bookList";
	 }
	
}
 