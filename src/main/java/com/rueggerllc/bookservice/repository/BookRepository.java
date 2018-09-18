package com.rueggerllc.bookservice.repository;


import org.springframework.data.repository.CrudRepository;

import com.rueggerllc.bookservice.beans.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
	
	public Book findByIsbn(String isbn);

}
