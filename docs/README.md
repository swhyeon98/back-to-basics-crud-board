## 📝 기능 구현 목록

### 핵심 비즈니스 로직

1. **게시글**
    - 게시글은 제목, 내용, 작성자, 생성 일자 및 시간, 마지막 수정 일자 및 시간 정보를 포함한다.
    - 게시글 생성(Create), 조회(Read), 수정(Update), 삭제(Delete) 기능을 제공한다.
2. **댓글**
    - 각 댓글은 게시글에 종속되며, 사용자 이름과 댓글 내용, 생성 일자 및 시간, 마지막 수정 일자 및 시간 정보를 포함한다.
    - 사용자가 게시글에 댓글을 달 수 있는 기능을 제공한다.
3. **대댓글**
    - 댓글에 대한 대댓글(댓글의 댓글)을 작성할 수 있는 기능을 제공한다.
    - 대댓글은 원 댓글 아래에 계층적으로 표시되며, 각 대댓글은 사용자 이름과 내용, 생성 일자 및 시간, 마지막 수정 일자 및 시간 정보를 포함한다.
4. **회원**
    - 회원은 로그인 아이디, 비밀번호, 이름, 이메일, 생성 일자 및 시간, 마지막 수정 일자 및 시간 정보를 포함한다.
5. **소셜 로그인 기능 (OAuth 2.0)**
    - OAuth 2.0을 활용한 다양한 소셜 미디어 플랫폼(Google, Naver)을 통한 로그인 기능을 제공한다.
6. **일반 회원가입 및 로그인 기능**
    - 소셜 연동이 아닌 일반 이메일과 비밀번호를 사용한 회원가입 및 로그인 기능을 제공한다.
7. **사용자 로그인 상태 유지**
    - 사용자가 웹사이트에 로그인한 상태를 지속적으로 유지하는 기능을 제공한다.
    - 세션을 활용하여 사용자의 로그인 정보를 관리한다.
8. **관리자**
    - 관리자는 아이디, 비밀번호, 행동 이력 정보를 포함한다.
    - 관리자는 모든 게시글과 댓글을 관리(조회, 수정, 삭제)할 수 있는 권한을 가진다.
    - 관리자 페이지를 통해 사이트의 전체적인 활동을 모니터링하고 관리할 수 있다.

### 입력 기능

- 게시글 및 댓글 작성 시, 사용자로부터 필요한 정보(제목, 내용, 댓글 내용 등)를 입력받는다.
- 회원가입 및 로그인 시, 사용자로부터 필요한 정보(로그인 아이디, 비밀번호, 이메일, 이름)를 입력받는다.
- 소셜 로그인 시, 사용자는 해당 소셜 미디어 플랫폼을 통해 인증을 받아야 한다.
### 변경 가능성

### 에러 핸들링 및 예외 처리
