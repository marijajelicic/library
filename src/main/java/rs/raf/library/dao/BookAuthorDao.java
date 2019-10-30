package rs.raf.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.raf.library.domain.BookAuthor;

@Repository
public interface BookAuthorDao extends JpaRepository<BookAuthor, Long>{

}
