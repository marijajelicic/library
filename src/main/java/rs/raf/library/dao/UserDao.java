package rs.raf.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.raf.library.domain.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

	
	
}
