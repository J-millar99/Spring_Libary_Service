package com.example.library.repository;

import com.example.library.model.Book;
import com.example.library.model.BookStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // 제목(부분 문자열)을 통해 해당하는 모든 도서를 검색
    public List<Book> findByTitleContaining(String title);

    // 저자(부분 문자열)를 통해 해당하는 모든 도서를 검색
    public List<Book> findByAuthorContaining(String author);

    // 도서 상태를 통해 해당하는 모든 도서를 검색
    public List<Book> findByStatus(BookStatus status);

    // 저자와 제목을 통해 일치하는 도서를 검색
    public Book findByAuthorAndTitle(String author, String title);
}
