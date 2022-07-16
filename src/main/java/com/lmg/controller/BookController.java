package com.lmg.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmg.base.exception.BusinessException;
import com.lmg.model.Book;
import com.lmg.service.BookService;

@RestController
@RequestMapping("/v1")
public class BookController {

	@Autowired
	private BookService service;

	@PostMapping("/book")
	public Book create(@RequestBody Book book) {
		return service.create(book);

	}

	@GetMapping("/book")
	public List<Book> getBooks() throws BusinessException, InterruptedException, ExecutionException {
		return service.getBooks();

	}
}
