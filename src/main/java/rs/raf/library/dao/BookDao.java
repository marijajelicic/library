package rs.raf.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import rs.raf.library.domain.Book;

public interface BookDao extends JpaRepository<Book, Long>{

}
