package rs.raf.library.service;

import java.time.LocalDateTime;

import rs.raf.library.domain.BorrowingBooks;
import rs.raf.library.domain.dto.BorrowingBooksRequestDto;
import rs.raf.library.domain.dto.BorrowingBooksResponseDto;
import rs.raf.library.domain.dto.BorrowingBooksQuoteResponseDto;

public interface BorrowingBooksService {

	public BorrowingBooks save(BorrowingBooksRequestDto borrowingBooksRequestDto);
	
	public BorrowingBooksResponseDto findByUserAndBorrowingDatetime(Long userId, LocalDateTime borrowingDatetime);
	
	public BorrowingBooksQuoteResponseDto findByUserWithQuote(Long userId);

}
