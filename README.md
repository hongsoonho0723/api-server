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

<!-- # 레이아웃
 -->
# 나의 역할
### 모든 이용자
- 통합검색
  - 통합검색은 4가지 항목(노래, 앨범, 플레이리스트, 가사)에 대한 검색 결과를 보여준다
    1. 노래 검색된 단어가 음악 제목 또는 가수 이름에 포함된 경우
    2. 앨범 검색된 단어가 앨범 이름에 포함된 경우
    3. 플레이리스트 검색된 단어가 플레이리스 제목에 포함된 경우
    4. 가사 검색된 단어가 가사에 포함된 경우
- 다운로드
  - 회원만 다운로드 기능을 이용할 수 있다
  - 다운로드 버튼을 누를 시 해당 음원 파일이 다운로드 된다
### 가수  
- 앨범 등록 신청
  - 가수 권한을 받은 이용자만 신청을 할 수 있다
- 신청 리스트 조회,삭제
  - 본인이 신청한 앨범 리스트를 조회하고 삭제를 할 수 있다
- 파일 업로드
  - 가수가 앨범 등록을 신청할 때 앨범 이미지와 음원 파일을 첨부하고 신청이 완료되면 해당 파일은 AWS S3에 저장이 되고 DB에는 등록한 파일 이름이 저장된다



