package rs.raf.library.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="borrowing_books")
public class BorrowingBooks {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="user_id", updatable=false)
	private User user;

	@ManyToOne
	@JoinColumn(name="book_id", updatable=false)
	private Book book;
	
	@Column(name="borrowing_datetime")
	private LocalDateTime borrowingDatetime;
	
	@Column(name="returning_datetime")
	private LocalDateTime returningDatetime;
	
	@Column(name="note")
	private String note;

	public BorrowingBooks() {
		super();
	}

	public BorrowingBooks(Long id, User user, Book book, LocalDateTime borrowingDatetime,
			LocalDateTime returningDatetime, String note) {
		super();
		this.id = id;
		this.user = user;
		this.book = book;
		this.borrowingDatetime = borrowingDatetime;
		this.returningDatetime = returningDatetime;
		this.note = note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
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
		return "BorrowingBooks [id=" + id + ", user=" + user + ", book=" + book + ", borrowingDatetime="
				+ borrowingDatetime + ", returningDatetime=" + returningDatetime + ", note=" + note + "]";
	}
	
}
