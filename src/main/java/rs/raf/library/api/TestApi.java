package rs.raf.library.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.raf.library.service.TestService;

@RestController
public class TestApi {
	
	TestService testservice;

	@Autowired
	public TestApi(TestService testservice) {
		super();
		this.testservice = testservice;
	}

	@RequestMapping(value="/hello", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String helloWorld() {
		return "Hello!";
	}



}
