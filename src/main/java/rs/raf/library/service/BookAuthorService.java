package rs.raf.library.service;

import java.util.List;

import rs.raf.library.domain.BookAuthor;

public interface BookAuthorService {

	public List<BookAuthor> findAll();
	
	public BookAuthor findById(Long bookAuthorId);
	
}
