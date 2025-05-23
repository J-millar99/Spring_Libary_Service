package com.example.library.dto;

import com.example.library.model.BookStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private BookStatus status;
    private Integer publicationYear;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CreateBookRequest {
        private String title;
        private String author;
        private String isbn;
        private Integer publicationYear;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateBookRequest {
        private String title;
        private String author;
        private String isbn;
        private BookStatus status;
        private Integer publicationYear;
    }
}
