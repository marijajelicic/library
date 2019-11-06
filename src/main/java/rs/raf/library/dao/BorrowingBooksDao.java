package rs.raf.library.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.raf.library.domain.BorrowingBooks;

@Repository
public interface BorrowingBooksDao extends JpaRepository<BorrowingBooks, Long>{
	
	public List<BorrowingBooks> findByUserId(Long userId);

	public List<BorrowingBooks> findByUserIdAndBorrowingDatetime(Long userId, LocalDateTime borrowingDatetime);

}
