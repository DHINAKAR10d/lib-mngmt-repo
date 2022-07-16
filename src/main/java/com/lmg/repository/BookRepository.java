package com.lmg.repository;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.lmg.model.Book;

@org.springframework.stereotype.Repository
@Transactional(rollbackFor = Exception.class, noRollbackFor = EntityNotFoundException.class)
public interface BookRepository extends JpaRepository<Book, String> {
}
