package com.example.library.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanDTO {
    Long id;

    Long bookId;
    String bookTitle;

    Long memberId;
    String memberName;

    LocalDate loanDate;
    LocalDate dueDate;
    LocalDate returnDate;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateLoanRequest {
        Long bookId;
        Long memberId;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ReturnLoanRequest {
        Long bookId;
        LocalDate returnDate;
    }
}
