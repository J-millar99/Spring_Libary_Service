# Spring_Libary_Service
# 📚 도서관 관리 시스템 (Library Management System)

스프링부트를 활용한 도서관 관리 시스템 API 프로젝트입니다. 이 프로젝트는 스프링부트의 핵심 개념을 학습하고 실습하기 위한 목적으로 개발되었습니다.

## 프로젝트 개요

이 프로젝트는 도서관의 책 관리, 회원 관리, 대출 관리 기능을 제공하는 RESTful API 서버를 구현합니다. 주요 기능으로는 책 등록/조회/수정/삭제, 회원 등록/조회/수정/삭제, 책 대출/반납 기능 등이 있습니다.

## 기술 스택

- **Backend**: Spring Boot 3.x
- **Database**: H2 Database (개발용)
- **Build Tool**: Maven
- **ORM**: Spring Data JPA
- **Documentation**: Springdoc OpenAPI (Swagger)
- **Etc**: Lombok, Validation

## 아키텍처

이 프로젝트는 전통적인 다계층 아키텍처(Layered Architecture)를 따르며, MVC 패턴을 적용했습니다:

- **Controller Layer**: HTTP 요청 처리 및 응답 반환
- **Service Layer**: 비즈니스 로직 처리
- **Repository Layer**: 데이터 접근 및 저장
- **Entity**: 데이터베이스 테이블과 매핑되는 객체
- **DTO**: 계층 간 데이터 전송을 위한 객체

## 기능 목록

### 책 관리
- 책 등록, 조회, 수정, 삭제
- 제목 또는 작가로 책 검색
- 상태별 책 필터링

### 회원 관리
- 회원 등록, 조회, 수정, 삭제
- 이름으로 회원 검색

### 대출 관리
- 책 대출 및 반납
- 회원별 대출 기록 조회
- 책별 대출 기록 조회
- 현재 대출 중인 목록 조회
- 연체된 대출 목록 조회

## 데이터 모델

### 주요 엔티티
- **Book**: 책 정보 (제목, 작가, ISBN, 출판연도, 상태 등)
- **Member**: 회원 정보 (이름, 이메일, 전화번호 등)
- **Loan**: 대출 정보 (대출일, 반납예정일, 반납일 등)

### 엔티티 관계
- **Book - Loan**: 일대다 관계 (한 권의 책은 여러 번 대출될 수 있음)
- **Member - Loan**: 일대다 관계 (한 명의 회원은 여러 권의 책을 대출할 수 있음)
- **Loan - Book/Member**: 다대일 관계 (하나의 대출은 하나의 책과 하나의 회원에 속함)

## 실행 방법

### 요구사항
- JDK 17 이상
- Maven 3.6 이상

### 프로젝트 클론 및 실행
```bash
# 프로젝트 클론
git clone https://github.com/username/library-management-system.git
cd library-management-system

# 프로젝트 빌드
./mvnw clean package

# 애플리케이션 실행
./mvnw spring-boot:run
```

### API 문서 확인
- 브라우저에서 http://localhost:8080/swagger-ui.html 접속

### H2 콘솔 접속
- 브라우저에서 http://localhost:8080/h2-console 접속
- JDBC URL: jdbc:h2:mem:librarydb
- 사용자명: sa
- 비밀번호: (빈 칸)

## API 엔드포인트

### 책 API
- `GET /api/books` - 모든 책 조회
- `GET /api/books/{id}` - ID로 책 조회
- `POST /api/books` - 새 책 등록
- `PUT /api/books/{id}` - 책 정보 수정
- `DELETE /api/books/{id}` - 책 삭제
- `GET /api/books/search/title?title={keyword}` - 제목으로 책 검색
- `GET /api/books/search/author?author={keyword}` - 작가로 책 검색
- `GET /api/books/filter/status?status={status}` - 상태로 책 필터링

### 회원 API
- `GET /api/members` - 모든 회원 조회
- `GET /api/members/{id}` - ID로 회원 조회
- `POST /api/members` - 새 회원 등록
- `PUT /api/members/{id}` - 회원 정보 수정
- `DELETE /api/members/{id}` - 회원 삭제
- `GET /api/members/search/name?name={keyword}` - 이름으로 회원 검색

### 대출 API
- `GET /api/loans` - 모든 대출 기록 조회
- `GET /api/loans/{id}` - ID로 대출 기록 조회
- `GET /api/loans/member/{memberId}` - 회원별 대출 기록 조회
- `GET /api/loans/book/{bookId}` - 책별 대출 기록 조회
- `GET /api/loans/current` - 현재 대출 중인 목록 조회
- `GET /api/loans/overdue` - 연체된 대출 목록 조회
- `POST /api/loans/borrow` - 책 대출
- `POST /api/loans/return` - 책 반납

## 학습 포인트

이 프로젝트를 통해 다음과 같은 스프링부트 핵심 개념을 학습할 수 있습니다:

1. **스프링부트 기본 구조**
   - 의존성 주입(DI)
   - 제어의 역전(IoC)
   - 자동 설정(Auto Configuration)

2. **MVC 패턴**
   - 컨트롤러, 서비스, 리포지토리의 역할 분리
   - RESTful API 설계

3. **DTO 패턴**
   - 계층 간 데이터 전송 객체 설계
   - 요청/응답 DTO 분리

4. **JPA/Hibernate**
   - 엔티티 설계
   - ORM 개념
   - 연관관계 매핑

5. **트랜잭션 관리**
   - `@Transactional` 어노테이션
   - 트랜잭션 전파 및 격리 수준

## 프로젝트 확장 방향

이 프로젝트를 더 확장하려면 다음 기능을 추가해볼 수 있습니다:

- Spring Security를 통한 인증 및 권한 관리
- 예외 처리 강화 및 글로벌 예외 핸들러 구현
- 페이징 및 정렬 기능 추가
- 테스트 코드 작성 (단위 테스트, 통합 테스트)
- 프론트엔드 개발 (React, Vue.js 등)
- 데이터베이스 마이그레이션 툴 도입 (Flyway, Liquibase)
- CI/CD 파이프라인 구축
