# 🎉 FirstProject - Spring Boot Mustache Web App

나도코딩 Spring Boot 3 강의의 실습 프로젝트입니다.  
Mustache 템플릿 엔진을 사용해 동적인 페이지를 렌더링하며,  
기본적인 컨트롤러 매핑을 통해 `/hi`, `/bye` 경로에서 메시지를 출력합니다.

![Java](https://img.shields.io/badge/Java-17-blue?style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-brightgreen?style=flat-square)
![Mustache](https://img.shields.io/badge/Mustache-Template-yellow?style=flat-square)

---

## 🧩 프로젝트 구조

```bash
📁 src/
 ┣ 📂main
 ┃ ┣ 📂java/com/example/firstproject
 ┃ ┃ ┣ 📄FirstprojectApplication.java      # 메인 실행 클래스
 ┃ ┃ ┗ 📂controller
 ┃ ┃   ┗ 📄FirstController.java            # /hi, /bye 요청 처리
 ┃ ┣ 📂resources
 ┃ ┃ ┣ 📄application.properties            # 설정 파일
 ┃ ┃ ┣ 📂templates
 ┃ ┃ ┃ ┣ 📄greetings.mustache              # "세은" 출력 뷰
 ┃ ┃ ┃ ┣ 📄goodbye.mustache               # "박세은" 출력 뷰
 ┃ ┃ ┃ ┗ 📂layouts                         # header/footer 레이아웃
 ┃ ┃ ┗ 📂static
 ┃ ┃   ┗ 📄hello.html                      # 정적 웹페이지
 ┗ 📂test
   ┗ 📄FirstprojectApplicationTests.java   # 테스트 코드
