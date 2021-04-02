# clojure-lacinia

- core : 서버 설정, 서버 시작
- resolver : graphql resolver 목록
- schema : schema.graphql
- schemafy : 스키마를 로딩, 필요한 경우 graphql 객체의 parser와 serializer를 작성
- config : env.edn을 읽어들임

- deps.edn : 의존성 관리
- env.edn : 각종 환경변수