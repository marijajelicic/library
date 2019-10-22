package rs.raf.library.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rs.raf.library.domain.User;
import rs.raf.library.domain.dto.UserDto;
import rs.raf.library.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserApi {
	
	private UserService userService;
	
	@Autowired
	public UserApi(UserService userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User save(@RequestBody UserDto userDto) {
		return userService.save(userDto);
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String hello() {
		return "Hello world!";
	}
}
