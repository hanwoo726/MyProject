[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fhanwoo726&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com)
<div align="center">
<h2>[2024] 웹 쇼핑몰 제작 🛒</h2>
공공데이터와 커뮤니티를 활용한 옷 쇼핑몰 웹사이트는 직관적이고 편리한 웹 옷쇼핑을 위해서 사용자들이 다양한 옷을 조회 할 수 있고, 구매할 수 있으며<br> 자신만의 코디로 게시글을 작성하고 다른 사용자들과 소통할 수 있는 옷 쇼핑몰 웹 사이트입니다 🍀
</div>

## 목차

- [개요](#개요)
- [팀원](#팀원)
- [기술 스택](#기술-스택)
- [기능 설명](#기능-설명)
- [페이지 구성](#페이지-구성)
- [프로젝트 구조](#프로젝트-구조)
- [테스트](#테스트)
- [참고 자료](#참고-자료)


## 개요
- 프로젝트 이름: NullBrainException 🏠
- 프로젝트 지속기간: 2024.06-2024.07

## 팀원

- 한승욱 (본인)
  - 회원 활성화/비활성화 관리 구현
  - 회원의 등급관리 구현
  - 상품 문의 구현
  - 상품 취소 문의 구현
  - 주문 처리 관리 구현
  - 관리자 페이지 구현
  
- 진민장
  - 지속 가능한 배경화면 애니메이션 구현
  - 배송지 추가/수정 및 연락처 수정과 같은 회원정보 관리 구현
  - 슬라이드 쇼를 겸한 인스타그램 기반의 커뮤니티 구현
  - AJAX를 활용한 다른 계정과 공유가 가능한 좋아요 기능 구현
  - AJAX를 이용한 도로명주소 공공데이터 활용을 구현
  - AJAX를 활용한 페이징 구현
  - Github 세팅 및 관리

- 신성태
  - 회원가입 구현
  - Spring Security를 활용한 Naver, 카카오톡, Google, 그리고 Facebook 등의 OAuth2 로그인 및 로그아웃 등을 구현
  - 유저별 권한 설정 구현
  - 로그인 실패 및 성공 시 동작 구현

- 조창성
  - RestTemplate으로 외부의 API를 사용하여 데이터 수집
  - EC2 RDS를 활용한 배포
  - 상품 구매 및 취소 구현 카드 결제
  - API를 AJAX로 활용한 결제 구현
  - 상품 상세 페이지 및 카테고리 구현

- 이가영
  - 장바구니 구현
  - 배송 조회 페이지 구현
  - 리뷰 페이지 구현
  - 주문 페이지 구현
 

  ## 기술 스택

| Front-End          | Back-End              | ETC                   | Version Control |
|--------------------|-----------------------|-----------------------|-----------------|
| ![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black) | ![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)  | ![EC2](https://img.shields.io/badge/Amazon_EC2-FF9900?style=for-the-badge&logo=amazon-ec2&logoColor=white)  | ![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white) |
| ![Ajax](https://img.shields.io/badge/Ajax-007FFF?style=for-the-badge&logo=ajax&logoColor=white) | ![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)  | ![RDS](https://img.shields.io/badge/Amazon_RDS-527FFF?style=for-the-badge&logo=amazon-rds&logoColor=white)  | ![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white) |
| ![HTML](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)  | ![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=spring&logoColor=white)  | ![POSTMAN](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)  |  |
| ![CSS](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)  | ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)  | ![ERD Editor](https://img.shields.io/badge/ERD_Editor-5C2D91?style=for-the-badge&logo=erd&logoColor=white)  |  |
| ![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)  | ![MyBatis](https://img.shields.io/badge/MyBatis-007396?style=for-the-badge&logo=mybatis&logoColor=white)  | ![jsoup](https://img.shields.io/badge/jsoup-333333?style=for-the-badge&logo=jsoup&logoColor=white)  |  |
| ![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)  | ![Lombok](https://img.shields.io/badge/Lombok-323330?style=for-the-badge&logo=lombok&logoColor=white)  | ![Trello](https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white)  |  |
| ![Tailwind CSS](https://img.shields.io/badge/Tailwind_CSS-38B2AC?style=for-the-badge&logo=tailwind-css&logoColor=white)  | ![Validator](https://img.shields.io/badge/Validator-000000?style=for-the-badge&logo=validator&logoColor=white)  | ![selenium-java](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)  |  |
| ![Slick](https://img.shields.io/badge/Slick-1E2923?style=for-the-badge&logo=slick&logoColor=white)  |  | ![commons-csv](https://img.shields.io/badge/commons_csv-007396?style=for-the-badge&logo=apache&logoColor=white)  |  |
|  |  | ![commons-lang3](https://img.shields.io/badge/commons_lang3-007396?style=for-the-badge&logo=apache&logoColor=white)  |  |
|  |  | ![commons-text](https://img.shields.io/badge/commons_text-007396?style=for-the-badge&logo=apache&logoColor=white)  |  |


## 기능 설명
팀 내에서 백엔드를 담당하며, 쇼핑몰 관리자 페이지 개발을 진행했습니다. 이 프로젝트에서는 웹 회원 정보를 조회하고, 등급 변경, 계정 활성/비활성화, 상품 문의사항 답변 등의 기능을 구현하여 회원과 관리자 간의 원활한 의사소통을 가능하게 했습니다.
MVC 패턴을 기반으로 MyBatis와 Thymeleaf를 활용하여 SQL과 객체 지향 언어를 매핑하고, 데이터를 HTML로 표현하는 구조를 처음으로 경험한 프로젝트입니다.


### 회원 아이디 검색 기능
![녹화_2025_02_20_16_12_36_750 (1)](https://github.com/user-attachments/assets/5de39af7-2dfa-4541-b83b-4351d2beeb0e)

Thymeleaf를 이용하여 표현하고 text 타입으로 유저의 아이디 값을 받아 일치하는 값이 해당하는 모든 유저들의 리스트를 뽑게 작용시키고 
그에 맞는 페이지네이션도 Controller단에서 검색된 유저 수를 10 단위로 나누어 페이지를 계산하여 동적으로 반영하였습니다.

#### 어려웠던 점
검색 기능은 GET 방식으로 구현하여 파라미터를 받아 처리했습니다.
하지만 검색 결과에 따라 동적으로 페이지네이션을 생성하는 과정에서 어려움을 느꼈습니다.
어떻게 하면 유연하고 동적인 페이지네이션을 만들 수 있을까 고민하다가, 여러 참고 자료를 찾아보며 해결 방법을 모색했습니다.
그 결과, if 문을 활용하여 검색이 실행된 경우에는 검색된 유저 수를 기준으로 (유저 수 / 10),
그렇지 않을 경우 전체 회원 수를 기준으로 (전체 회원 수 / 10) 페이지를 계산하는 방식을 적용하여 문제를 해결했습니다.












## 페이지 구성
| ![image](https://github.com/hanwoo726/MyProject/blob/master/Main.png) | ![image](https://github.com/hanwoo726/MyProject/blob/master/LoginPage.png) |
|:---------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------:|
|                                                      메인 화면                                                      |                                                     로그인 화면                                                      |



- 회원 페이지

| MyPage| CART| ShoppingDetail|
|:----------------------------------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------------:|
| ![image](https://github.com/hanwoo726/MyProject/blob/master/img.png) | ![image](https://github.com/hanwoo726/MyProject/blob/master/Cart.png) | ![image](https://github.com/hanwoo726/MyProject/blob/master/ShoppingDetail.png) |
|                                           마이페이지                |                         장바구니                         |         상품 정보   |

- 관리자 페이지

| Main| OrderList| UserList| Required|
|-----------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|
| ![image](https://github.com/hanwoo726/MyProject/blob/master/AdminMain.png) | ![image](https://github.com/hanwoo726/MyProject/blob/master/Order.png) | ![image](https://github.com/hanwoo726/MyProject/blob/master/userList.png) | ![image](https://github.com/hanwoo726/MyProject/blob/master/inquiry.png) |                                                                      |


## 프로젝트 구조(ERD)
![image](https://github.com/user-attachments/assets/aa740f1d-5fcd-460d-8aa5-09f553632071)


