package rs.raf.library.domain.dto;

import java.time.LocalDateTime;

public class BorrowingBooksRequestDto {

	private Long userId;

	private Long bookId;
	
	private LocalDateTime borrowingDatetime;
		
	private String note;

	public BorrowingBooksRequestDto() {
		super();
	}

	public BorrowingBooksRequestDto(Long userId, Long bookId, LocalDateTime borrowingDatetime, String note) {
		super();
		this.userId = userId;
		this.bookId = bookId;
		this.borrowingDatetime = borrowingDatetime;
		this.note = note;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public LocalDateTime getBorrowingDatetime() {
		return borrowingDatetime;
	}

	public void setBorrowingDatetime(LocalDateTime borrowingDatetime) {
		this.borrowingDatetime = borrowingDatetime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "BorrowingBooksRequestDto [userId=" + userId + ", bookId=" + bookId + ", borrowingDatetime="
				+ borrowingDatetime + ", note=" + note + "]";
	}
	
}
