package edu.mum.cs.cs425.elibrary.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.elibrary.model.Book;
import edu.mum.cs.cs425.elibrary.repository.BookRepository;
import edu.mum.cs.cs425.elibrary.service.BookService;;

	
	@Service("bookService")
	public class BookServiceImpl implements BookService {

		@Autowired
		BookRepository bookRepository;
		
		@Override
		public List<Book> findAll() {
			return bookRepository.findAll();
		}

		@Override
		public Book save(Book book) {
			return bookRepository.save(book);
		}

		@Override
		public Book findOne(Long bookID) {
			Optional b=bookRepository.findById(bookID);
			
			
			return (Book) b.orElse(new Book());
		}

		@Override
		public void delete(Long id) {
			bookRepository.deleteById(id);
		}


}






