package rs.raf.library.service;

import rs.raf.library.domain.User;
import rs.raf.library.domain.dto.UserDto;

public interface UserService {

	public User save(UserDto userDto);

}
