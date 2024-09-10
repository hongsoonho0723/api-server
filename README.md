# 음악 스트리밍 사이트 SURFER
<p align="center">
  <img width="400px", src="https://github.com/user-attachments/assets/0d436172-4aaf-4111-b13c-98b4426f35cc">
</p>

# 프로젝트 소개
- SURFER는 인디 가수들이 자신의 노래를 알릴 수 있고 인디음악을 좋아하는 사용자들이 음악에 대한 정보를 찾고 감상을 할 수 있는 사이트입니다


# 개발기간
2024.05.20 ~ 2024.06.27

<p>
  <img width="450px", src="https://github.com/user-attachments/assets/cb7a6a86-b654-4b58-b6d1-b1d869ffa764">
</p>
<p>
  <img width="450px", src="https://github.com/user-attachments/assets/7e3772a7-3128-4dbe-ad6a-408cdda252ff">
</p>

# 개발 환경
![image](https://github.com/user-attachments/assets/e3039ee9-df30-477a-ab08-e2c0e58740ab)

# 주요기능

- 회원가입, 로그인
- 최신앨범
- 인기차트
- 장르별 음악
- 음악 스트리밍 기능
- 통합검색
- 가수 신청
- 앨범 및 음악 등록 신청
- 앨범 조회, 심사, 삭제
- 가수 신청 심사
- 신청된 앨범 및 음악 심사후 등록여부 결정

<!-- 
![image](https://github.com/user-attachments/assets/8d3e50d1-2b23-4ed9-b3ad-e689172754ee)
<p>
  <img width="500px", src="https://github.com/user-attachments/assets/313f19ff-2185-45aa-a772-5f8c0aaff4c7">
</p>
-->
# 프로젝트 구조

```
src
    ├─main
      ├─generated
      │  └─com
      │      └─surfer
      │          └─apiserver
      │              └─domain
      │                  └─database
      │                      └─entity
      ├─java
      │  └─com
      │      └─surfer
      │          └─apiserver
      │              ├─api
      │              │  ├─admin
      │              │  │  ├─controller
      │              │  │  ├─dto
      │              │  │  └─service
      │              │  │      └─impl
      │              │  ├─album
      │              │  │  ├─controller
      │              │  │  ├─dto
      │              │  │  └─service
      │              │  │      └─impl
      │              │  ├─auth
      │              │  │  ├─controller
      │              │  │  ├─dto
      │              │  │  └─service
      │              │  │      └─impl
      │              │  ├─playlist
      │              │  │  ├─controller
      │              │  │  ├─dto
      │              │  │  └─service
      │              │  │      └─impl
      │              │  ├─search
      │              │  │  ├─controller
      │              │  │  ├─dto
      │              │  │  └─service
      │              │  └─song
      │              │      ├─controller
      │              │      ├─dto
      │              │      └─service
      │              │          └─impl
      │              ├─common
      │              │  ├─constant
      │              │  ├─exception
      │              │  ├─filter
      │              │  ├─jwt
      │              │  ├─response
      │              │  └─util
      │              ├─config
      │              └─domain
      │                  └─database
      │                      ├─entity
      │                      └─repository
      │                          └─custom
      │                              └─impl
      └─resources
  

```

# 레이아웃

# 나의 역할
### 모든 이용자
- 통합검색
- 다운로드
### 가수  
- 앨범 등록 신청
- 신청 리스트 조회,삭제
- 파일 등록




