## Back to Basics - CRUD 게시판 (1인 개발)

- **프로젝트 개요:**
    
    현 취업시장에서 기업들이 양상형 개발자와 실무에 투입 가능한 개발자를 구별하는데 어려움을 겪고 있다는 것을 알게 되었습니다. 이와 동시에, 많은 개발자들도 자신의 실력을 어떻게 표현하면 좋을지 고민하는 경우가 많습니다. 이러한 배경에서, 저는 “기업이 원하는 ‘백엔드 개발자’의 역량은 어디서부터 어디까지일까? 그리고 이를 어떻게 증명할 수 있을까?”라는 의문을 가지게 되었고, 이러한 의문을 해결하고자 본 프로젝트를 시작하게 되었습니다.
    
- **프로젝트 목표:**

    본 프로젝트의 핵심 목표는 CRUD 게시판의 구축을 통해, Spring과 SQL에 대한 이해도와 숙련도를 보여주는 것입니다.

    첫째, Spring MVC와 JPA, 그리고 Spring Security 등의 기술을 활용하여 CRUD 게시판을 완성하는 것을 목표로 합니다.

    그리고, 각 편의 기능을 하나씩 제거하며 대체 기술과 디자인 패턴 등을 활용합니다.

    예를 들어, JPA를 사용하지 않은 경우에는 Mybatis와 Mapper, 혹은 직접 JDBC를 활용하여 데이터베이스와의 연동을 구현합니다.
    
- **프로젝트 일정:**
    2023.10월 ~ 현재 진행 중
- **프로젝트 팀원:**
    1인개발

## 대표 기능

1. 게시글 생성(Create), 조회(Read), 수정(Update), 삭제(Delete) - CRUD 기능
2. 게시글에 대한 댓글 기능
3. 댓글의 대댓글 기능
4. OAuth 2.0을 이용한 소셜 로그인 기능
5. 소셜 연동이 아닌, 일반 회원가입 및 로그인 기능
6. 사용자 로그인 상태 유지
7. 게시글을 관리하는 Admin 기능

## 사용 기술 & Tools

- Backend: Java, Spring Boot, JPA
- Authentication: OAuth 2.0
- Database: H2, MariaDB
- Tools: IntelliJ, Git, GitHub

## 프로젝트 구조 및 설계

- [기능 구현 목록](docs/README.md)
