# clojure-lacinia 백엔드 템플릿

## 파일 설명
- core.clj      : 서버 설정, 서버 시작
- resolver.clj  : graphql resolver 목록
- schema.clj    : schema.graphql
- schemafy.clj  : 스키마를 로딩, 필요한 경우 graphql 객체의 parser와 serializer를 작성
- config        : env.edn을 읽어들임
- deps.edn      : 의존성 관리
- env.edn       : 각종 환경변수

## Executable JAR 만들기
- uberdeps 메뉴얼 (https://github.com/tonsky/uberdeps)
- jar 만들기 : make compile
- 실행 (main 필요) : make runjar


