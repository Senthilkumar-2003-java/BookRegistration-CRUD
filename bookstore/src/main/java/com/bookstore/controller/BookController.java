package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")   // <-- base path for all endpoints in this controller
public class BookController {

    @GetMapping("/")
    public String home() {
        return "index";   // templates/index.html
    }

    @GetMapping("/register")
    public String bookRegister() {
        return "bookRegister"; // templates/bookRegister.html
    }

    @GetMapping("/available")
    public String getAllBook() {
        return "bookList"; // templates/bookList.html
    }
}
