package rs.raf.library.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book_author")
public class BookAuthor {

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;

	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;

	public BookAuthor() {
		super();
	}

	public BookAuthor(Long id, Author author, Book book) {
		super();
		this.id = id;
		this.author = author;
		this.book = book;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "BookAuthor [id=" + id + ", author=" + author + ", book=" + book + "]";
	}

	
	
}
