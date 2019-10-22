package rs.raf.library.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.raf.library.dao.UserDao;
import rs.raf.library.domain.User;
import rs.raf.library.domain.dto.UserDto;
import rs.raf.library.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private UserDao userDao;

	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User save(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName(userDto.getName());
		user.setLastName(userDto.getLastName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setDatetimeCreated(LocalDateTime.now());
		
		return userDao.save(user);
	}

}
