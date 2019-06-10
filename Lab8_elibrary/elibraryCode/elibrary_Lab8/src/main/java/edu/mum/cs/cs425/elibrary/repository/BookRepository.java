package edu.mum.cs.cs425.elibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.elibrary.model.Book;

@Repository("bookRepository")

public interface BookRepository extends JpaRepository<Book, Long> {



}







