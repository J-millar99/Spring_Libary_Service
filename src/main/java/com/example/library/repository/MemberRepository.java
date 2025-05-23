package com.example.library.repository;

import com.example.library.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // 이메일을 통해 해당하는 회원을 검색
    Optional<Member> findByEmail(String email);

    // 전화번호를 통해 해당하는 회원을 검색
    Optional<Member> findByPhoneNumber(String phoneNumber);

    // 이름(부분 문자열)을 통해 해당하는 회원을 검색
    List<Member> findByNameContaining(String name);
}
