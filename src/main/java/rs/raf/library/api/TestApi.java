package rs.raf.library.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

	@RequestMapping(value="/hello", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String helloWorld() {
		return "Hello!";
	}

}
