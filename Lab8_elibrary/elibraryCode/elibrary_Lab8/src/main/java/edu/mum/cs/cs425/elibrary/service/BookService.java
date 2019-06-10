package edu.mum.cs.cs425.elibrary.service;
import java.util.List;
import edu.mum.cs.cs425.elibrary.model.Book;
public interface BookService {
	 List<Book> findAll();
	 Book save(Book book);
	 Book findOne(Long id);
	 void delete(Long id);
}




