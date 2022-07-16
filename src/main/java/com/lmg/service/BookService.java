package com.lmg.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lmg.base.exception.BusinessException;
import com.lmg.dao.BookDao;
import com.lmg.model.Book;
import com.lmg.repository.BookRepository;

@Component
public class BookService {

	@Autowired
	private BookDao bookdao;

	@Autowired
	private BookRepository repository;

	public Book create(Book book) {
		return repository.save(book);

	}

	public List<Book> getBooks() throws BusinessException, InterruptedException, ExecutionException {
		
		CompletableFuture<List<Book>>  books=	CompletableFuture.supplyAsync(() -> {
			System.out.println("Thread Name -> "+Thread.currentThread().getName());
		return	bookdao.getBooks();
		});
//		List<Book> books = bookdao.getBooks();
//		if (ObjectUtils.isEmpty(books)) {
//			throw new BusinessException("VALIDATION_FAILED","mandatory feild missing",new String[] {"TestDHina"} );
//		}
//		return books;
	return	books.get();
		
	}
}
