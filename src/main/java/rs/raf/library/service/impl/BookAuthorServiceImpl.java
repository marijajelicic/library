package rs.raf.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.raf.library.dao.BookAuthorDao;
import rs.raf.library.domain.BookAuthor;
import rs.raf.library.service.BookAuthorService;

@Service
public class BookAuthorServiceImpl implements BookAuthorService{
	
	private BookAuthorDao bookAuthorDao;

	@Autowired
	public BookAuthorServiceImpl(BookAuthorDao bookAuthorDao) {
		super();
		this.bookAuthorDao = bookAuthorDao;
	}

	@Override
	public List<BookAuthor> findAll() {
		return bookAuthorDao.findAll();
	}

	@Override
	public BookAuthor findById(Long bookAuthorId) {
		return bookAuthorDao.findById(bookAuthorId).get();
	}

	
	

}
