package com.example.library.repository;

import com.example.library.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    // 도서 ID를 통해, 대출된 기록을 검색
    List<Loan> findByBookId(Long bookId);

    // 회원 ID를 통해, 대출한 기록을 검색
    List<Loan> findByMemberId(Long memberId);

    // 아직 반납되지 않는 모든 기록을 검색 = 대출중인 모든 기록 검색
    List<Loan> findByReturnDateIsNull();

    // 반납 예정일이 지났는데 아직 반납하지 않은 연체 기록 조회
    List<Loan> findByDueDateBeforeAndReturnDateIsNull(LocalDate date);
}
