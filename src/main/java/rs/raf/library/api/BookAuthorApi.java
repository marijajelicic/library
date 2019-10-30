package rs.raf.library.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rs.raf.library.domain.BookAuthor;
import rs.raf.library.service.BookAuthorService;

@RestController
@RequestMapping(value = "/bookAuthor")
public class BookAuthorApi {

	private BookAuthorService bookAuthorService;

	@Autowired
	public BookAuthorApi(BookAuthorService bookAuthorService) {
		super();
		this.bookAuthorService = bookAuthorService;
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<BookAuthor> findAll() {
		System.out.println("hej!");
		return bookAuthorService.findAll();
	}
	
}
