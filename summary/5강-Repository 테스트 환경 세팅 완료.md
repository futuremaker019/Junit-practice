### 테스트 방법

| |테스트 사항|
|---|---|
|Controller|- 클라이언트와 테스트|
|Service|- 기능들이 트랜잭션을 잘 타는지|
|Repository|- DB 쪽 관련 테스트|

Controller와 Service, Repository 모두를 메모리에 띄우고 테스트하는 것을 통합테스트라고 한다.

Repository 단위 테스트를 하기 위해서는 Repository class에 `@DataJpaTest`를 붙여준다.