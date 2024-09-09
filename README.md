# 음악 스트리밍 사이트 SURFER
<p align="center">
  <img width="400px", src="https://github.com/user-attachments/assets/0d436172-4aaf-4111-b13c-98b4426f35cc">
</p>

# 프로젝트 소개
- SURFER는 인디 가수들이 자신의 노래를 알릴 수 있고 인디음악을 좋아하는 사용자들이 음악에 대한 정보를 찾고 감상을 할 수 있는 사이트입니다




# 개발기간
2024.05.20 ~ 2024.06.27

# 개발 환경
![image](https://github.com/user-attachments/assets/e3039ee9-df30-477a-ab08-e2c0e58740ab)

# 주요기능
![image](https://github.com/user-attachments/assets/8d3e50d1-2b23-4ed9-b3ad-e689172754ee)
![image](https://github.com/user-attachments/assets/313f19ff-2185-45aa-a772-5f8c0aaff4c7)

# 프로젝트 구조

```
src
    ├─main
    │  ├─generated
    │  │  └─com
    │  │      └─surfer
    │  │          └─apiserver
    │  │              └─domain
    │  │                  └─database
    │  │                      └─entity
    │  ├─java
    │  │  └─com
    │  │      └─surfer
    │  │          └─apiserver
    │  │              ├─api
    │  │              │  ├─admin
    │  │              │  │  ├─controller
    │  │              │  │  ├─dto
    │  │              │  │  └─service
    │  │              │  │      └─impl
    │  │              │  ├─album
    │  │              │  │  ├─controller
    │  │              │  │  ├─dto
    │  │              │  │  └─service
    │  │              │  │      └─impl
    │  │              │  ├─auth
    │  │              │  │  ├─controller
    │  │              │  │  ├─dto
    │  │              │  │  └─service
    │  │              │  │      └─impl
    │  │              │  ├─playlist
    │  │              │  │  ├─controller
    │  │              │  │  ├─dto
    │  │              │  │  └─service
    │  │              │  │      └─impl
    │  │              │  ├─search
    │  │              │  │  ├─controller
    │  │              │  │  ├─dto
    │  │              │  │  └─service
    │  │              │  └─song
    │  │              │      ├─controller
    │  │              │      ├─dto
    │  │              │      └─service
    │  │              │          └─impl
    │  │              ├─common
    │  │              │  ├─constant
    │  │              │  ├─exception
    │  │              │  ├─filter
    │  │              │  ├─jwt
    │  │              │  ├─response
    │  │              │  └─util
    │  │              ├─config
    │  │              └─domain
    │  │                  └─database
    │  │                      ├─entity
    │  │                      └─repository
    │  │                          └─custom
    │  │                              └─impl
    │  └─resources
    └─test
        └─java
            └─com
                └─surfer
                    └─apiserver
                        ├─api
                        │  ├─auth
                        │  │  ├─controller
                        │  │  ├─integration
                        │  │  └─service
                        │  │      └─impl
                        │  └─song
                        │      └─controller
                        └─search

```

