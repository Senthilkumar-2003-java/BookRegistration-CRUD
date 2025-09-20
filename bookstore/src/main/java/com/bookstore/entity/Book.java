package com.bookstore.entity;

import jakarta.persistence.Entity; // ✅ Use this if you're using Jakarta / Spring Boot 3+
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String author;
    private String price;
	public Book() {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getlong() {
		// TODO Auto-generated method stub
		return 0;
	}

    // Constructors, getters, setters, etc.
}
