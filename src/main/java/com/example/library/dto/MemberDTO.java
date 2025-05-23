package com.example.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateMemberRequest {
        private String name;
        private String email;
        private String phoneNumber;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UpdateMemberRequest {
        private String name;
        private String email;
        private String phoneNumber;
    }
}
