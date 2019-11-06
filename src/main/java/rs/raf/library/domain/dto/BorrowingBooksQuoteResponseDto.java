package rs.raf.library.domain.dto;

import java.util.List;

import rs.raf.library.domain.Book;
import rs.raf.library.domain.User;

public class BorrowingBooksQuoteResponseDto {

	private User user;

	private List<Book> book;

	private String quoteText;

	private String quoteAuthor;

	public BorrowingBooksQuoteResponseDto() {
		super();
	}

	public BorrowingBooksQuoteResponseDto(User user, List<Book> book, String quoteText, String quoteAuthor) {
		super();
		this.user = user;
		this.book = book;
		this.quoteText = quoteText;
		this.quoteAuthor = quoteAuthor;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public String getQuoteText() {
		return quoteText;
	}

	public void setQuoteText(String quoteText) {
		this.quoteText = quoteText;
	}

	public String getQuoteAuthor() {
		return quoteAuthor;
	}

	public void setQuoteAuthor(String quoteAuthor) {
		this.quoteAuthor = quoteAuthor;
	}

	@Override
	public String toString() {
		return "BorrowingBooksResponseQuoteDto [user=" + user + ", book=" + book + ", quoteText=" + quoteText
				+ ", quoteAuthor=" + quoteAuthor + "]";
	}

}
