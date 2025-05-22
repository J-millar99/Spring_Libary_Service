package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.print.Book;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class Loan {
    private Long id;
    private Book book;
    private Member member;
    LocalDate loanDate;
    LocalDate dueDate;
    LocalDate returnDate;
}
