package com.example.library.model;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class Member {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private List<Loan> loans;
}
