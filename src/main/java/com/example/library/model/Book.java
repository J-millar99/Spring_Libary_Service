package com.example.library.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class Book {
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private BookStatus status;
    private Integer publicationYear;
    private List<Loan> loans;
}
