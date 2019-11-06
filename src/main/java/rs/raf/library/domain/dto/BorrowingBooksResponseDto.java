package rs.raf.library.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

import rs.raf.library.domain.Book;
import rs.raf.library.domain.User;

public class BorrowingBooksResponseDto {
	
	private User user;

	private List<Book> book;
	
	private LocalDateTime borrowingDatetime;
	
	private LocalDateTime returningDatetime;
	
	private String note;

	public BorrowingBooksResponseDto() {
		super();
	}

	public BorrowingBooksResponseDto(User user, List<Book> book, LocalDateTime borrowingDatetime,
			LocalDateTime returningDatetime, String note) {
		super();
		this.user = user;
		this.book = book;
		this.borrowingDatetime = borrowingDatetime;
		this.returningDatetime = returningDatetime;
		this.note = note;
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

	public LocalDateTime getBorrowingDatetime() {
		return borrowingDatetime;
	}

	public void setBorrowingDatetime(LocalDateTime borrowingDatetime) {
		this.borrowingDatetime = borrowingDatetime;
	}

	public LocalDateTime getReturningDatetime() {
		return returningDatetime;
	}

	public void setReturningDatetime(LocalDateTime returningDatetime) {
		this.returningDatetime = returningDatetime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "BorrowingBooksResponseDto [user=" + user + ", book=" + book + ", borrowingDatetime=" + borrowingDatetime
				+ ", returningDatetime=" + returningDatetime + ", note=" + note + "]";
	}

}
