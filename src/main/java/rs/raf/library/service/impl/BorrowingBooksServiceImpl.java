package rs.raf.library.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.raf.library.dao.BookDao;
import rs.raf.library.dao.BorrowingBooksDao;
import rs.raf.library.dao.UserDao;
import rs.raf.library.domain.Book;
import rs.raf.library.domain.BorrowingBooks;
import rs.raf.library.domain.dto.BorrowingBooksRequestDto;
import rs.raf.library.domain.dto.BorrowingBooksResponseDto;
import rs.raf.library.domain.dto.QuoteDto;
import rs.raf.library.domain.dto.BorrowingBooksQuoteResponseDto;
import rs.raf.library.service.BorrowingBooksService;
import rs.raf.library.service.feign.QuoteFeignClient;

@Service
public class BorrowingBooksServiceImpl implements BorrowingBooksService{

	private BorrowingBooksDao borrowingBooksDao;
	private UserDao userDao;
	private BookDao bookDao;
	private QuoteFeignClient quoteFeignClient;

	@Autowired
	public BorrowingBooksServiceImpl(BorrowingBooksDao borrowingBooksDao, UserDao userDao, BookDao bookDao,
			QuoteFeignClient quoteFeignClient) {
		super();
		this.borrowingBooksDao = borrowingBooksDao;
		this.userDao = userDao;
		this.bookDao = bookDao;
		this.quoteFeignClient = quoteFeignClient;
	}


	@Override
	public BorrowingBooks save(BorrowingBooksRequestDto borrowingBooksRequestDto) {

		BorrowingBooks borrowingBooks = new BorrowingBooks();
		
		borrowingBooks.setUser(userDao.findById(borrowingBooksRequestDto.getUserId()).get());
		borrowingBooks.setBook(bookDao.findById(borrowingBooksRequestDto.getBookId()).get());
		borrowingBooks.setNote(borrowingBooksRequestDto.getNote());
		borrowingBooks.setBorrowingDatetime(borrowingBooksRequestDto.getBorrowingDatetime());
		
		return borrowingBooksDao.save(borrowingBooks);
	}

	@Override
	public BorrowingBooksResponseDto findByUserAndBorrowingDatetime(Long userId, LocalDateTime borrowingDatetime) {

		BorrowingBooksResponseDto borrowingBooksResponseDto = new BorrowingBooksResponseDto();
		
		List<BorrowingBooks> bbs = borrowingBooksDao.findByUserIdAndBorrowingDatetime(userId, borrowingDatetime);
		
//		System.out.println(bbs.toString());
		
		borrowingBooksResponseDto.setUser(bbs.get(0).getUser());
		borrowingBooksResponseDto.setNote(bbs.get(0).getNote());
		borrowingBooksResponseDto.setBorrowingDatetime(bbs.get(0).getBorrowingDatetime());
		borrowingBooksResponseDto.setReturningDatetime(bbs.get(0).getReturningDatetime());
		
		List<Book> books = new ArrayList<Book>();
		for (BorrowingBooks bb : bbs) {
			books.add(bb.getBook());
		}
		borrowingBooksResponseDto.setBook(books);
		
		return borrowingBooksResponseDto;
	}

	@Override
	public BorrowingBooksQuoteResponseDto findByUserWithQuote(Long userId) {

		BorrowingBooksQuoteResponseDto bbQuote = new BorrowingBooksQuoteResponseDto();
		
		List<BorrowingBooks> bbs = borrowingBooksDao.findByUserId(userId);
		bbQuote.setUser(bbs.get(0).getUser());
		List<Book> books = new ArrayList<Book>();
		for (BorrowingBooks bb : bbs) {
			books.add(bb.getBook());
		}
		bbQuote.setBook(books);
		
		QuoteDto quote = quoteFeignClient.getQuote();
		bbQuote.setQuoteText(quote.getQuote());
		bbQuote.setQuoteAuthor(quote.getAuthor());
		
		return bbQuote;
	}
	
}
