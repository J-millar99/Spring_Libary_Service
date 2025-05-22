package com.example.library.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // 필수 값
    private String title;

    @Column(nullable = false) // 필수 값
    private String author;

    @Column(nullable = false, unique = true) // 필수, 고유 값
    private String isbn;

    @Enumerated(EnumType.STRING)
    private BookStatus status = BookStatus.AVALIABLE; // 이용 가능 상태로 초기화

    @Column(name = "publication_year", nullable = false) // 필수 값
    private Integer publicationYear;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Loan> loans;
}
