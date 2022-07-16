package com.lmg.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lmg.model.Book;
import com.lmg.repository.BookRepository;

@Component
public class BookDao {

	@Autowired
	private BookRepository repository;

	public Book create(Book book) {
		return repository.save(book);
	}

	public List<Book> getBooks() {
		return repository.findAll();

	}
}
