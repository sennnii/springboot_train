# 🚀 Spring Boot Mustache Web App

Spring Boot 3과 Mustache 템플릿 엔진을 사용하여 만든 간단한 웹 애플리케이션입니다.  
게시글(Article)과 회원(Member)의 CRUD 기능을 학습하며, MVC 구조, 리다이렉트 처리, 뷰 렌더링 등 웹 개발의 핵심 개념을 실습할 수 있습니다.

![Java](https://img.shields.io/badge/Java-17-blue?style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-brightgreen?style=flat-square)
![Mustache](https://img.shields.io/badge/Mustache-Template-yellow?style=flat-square)

---

## 📌 주요 기능

### 📝 게시글 기능 (Article)
- 게시글 작성, 조회, 수정, 삭제
- `/articles`, `/articles/{id}`, `/articles/new` 등 RESTful 경로 사용

### 👤 회원 기능 (Member)
- 회원 가입, 상세조회, 수정
- 회원 목록 보기

### 💬 기타
- `/hi`, `/bye` URL을 통해 Mustache 뷰 렌더링 연습

---

## 🧩 프로젝트 구조

```bash
src/
 ┣ main/
 ┃ ┣ java/com/example/firstproject/
 ┃ ┃ ┣ controller/         # 컨트롤러 계층 (웹 요청 처리)
 ┃ ┃ ┣ dto/                # 폼 입력 데이터 처리용 DTO
 ┃ ┃ ┣ entity/             # JPA 엔티티 클래스
 ┃ ┃ ┣ repository/         # JPA 리포지토리
 ┃ ┃ ┗ FirstprojectApplication.java  # 메인 클래스
 ┃ ┣ resources/
 ┃ ┃ ┣ templates/          # Mustache 템플릿
 ┃ ┃ ┃ ┣ articles/         # 게시글 관련 뷰
 ┃ ┃ ┃ ┣ members/          # 회원 관련 뷰
 ┃ ┃ ┃ ┣ greetings.mustache / goodbye.mustache
 ┃ ┃ ┣ static/             # 정적 페이지
 ┃ ┃ ┗ application.properties  # 설정 파일
 ┗ test/
   ┗ FirstprojectApplicationTests.java
```


## ⚙️ 실행 방법
```bash

# 빌드 및 실행
./gradlew bootRun
```
브라우저에서 접속:

- 게시글 목록: http://localhost:8080/articles

- 새 게시글 작성: http://localhost:8080/articles/new

- 회원 가입: http://localhost:8080/signup
