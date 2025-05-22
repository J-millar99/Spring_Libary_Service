package com.example.library.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false) // 대출에서 필수 값
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false) // 대출에서 필수 값
    private Member member;

    @Column(name = "loan_date", nullable = false) // 대출에서 필수 값
    LocalDate loanDate;

    @Column(name = "due_date")
    LocalDate dueDate;

    @Column(name = "return_date")
    LocalDate returnDate;
}
