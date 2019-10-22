package rs.raf.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import rs.raf.library.domain.User;
@RepositoryRestResource
public interface UserDao extends JpaRepository<User, Long>{

}
