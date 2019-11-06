package rs.raf.library.api;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rs.raf.library.domain.BorrowingBooks;
import rs.raf.library.domain.dto.BorrowingBooksQuoteResponseDto;
import rs.raf.library.domain.dto.BorrowingBooksRequestDto;
import rs.raf.library.domain.dto.BorrowingBooksResponseDto;
import rs.raf.library.service.BorrowingBooksService;

@RestController
@RequestMapping(value = "/borrowingBooks")
public class BorrowingBooksApi {

	private BorrowingBooksService borrowingBooksService;

	@Autowired
	public BorrowingBooksApi(BorrowingBooksService borrowingBooksService) {
		super();
		this.borrowingBooksService = borrowingBooksService;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody BorrowingBooks save(@RequestBody BorrowingBooksRequestDto borrowingBooksRequestDto) {
		return borrowingBooksService.save(borrowingBooksRequestDto);
	}
	
	@RequestMapping(value = "/findByUserAndBorrowingDatetime", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody BorrowingBooksResponseDto findByUserAndBorrowingDatetime(@RequestParam Long userId,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime borrowingDatetime) {
		return borrowingBooksService.findByUserAndBorrowingDatetime(userId, borrowingDatetime);
	}
	
	@RequestMapping(value = "/findByUserWithQuote", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody BorrowingBooksQuoteResponseDto findByUserWithQuote(@RequestParam Long userId) {
		return borrowingBooksService.findByUserWithQuote(userId);
	}
	
}
