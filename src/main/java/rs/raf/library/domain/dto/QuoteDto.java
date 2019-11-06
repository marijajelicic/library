package rs.raf.library.domain.dto;

import java.util.Arrays;

public class QuoteDto {

	private String copyright;

	private String quote;

	private String author;

	private String length;

	private String category;

	private String title;

	private String[] tags;

	public QuoteDto() {
		super();
	}

	public QuoteDto(String copyright, String quote, String author, String length, String category,
			String title, String[] tags) {
		super();
		this.copyright = copyright;
		this.quote = quote;
		this.author = author;
		this.length = length;
		this.category = category;
		this.title = title;
		this.tags = tags;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "QuoteDto [copyright=" + copyright + ", quote=" + quote + ", author=" + author + ", length=" + length
				+ ", category=" + category + ", title=" + title + ", tags=" + Arrays.toString(tags) + "]";
	}

	

	
	
}
