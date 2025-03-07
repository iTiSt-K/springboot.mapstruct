# MapStruct Example Project

이 프로젝트는 **Spring Boot 3.4.3**와 **Gradle** 기반의 샘플 애플리케이션으로, **MapStruct**를 활용하여 Entity와 DTO 간의 변환을 쉽게 처리하는 예제를 포함하고 있습니다. 또한, **Lombok**을 사용하여 보일러플레이트 코드를 줄였으며, 단위 테스트와 통합 테스트 코드도 함께 작성되어 있습니다.

## 프로젝트 개요

- **프로젝트 목적**: MapStruct를 활용한 객체 간 변환(mapping) 예제 구현
- **주요 기능**:
  - `User` 엔티티를 `UserDTO`로 변환하는 매핑 기능
  - MapStruct를 통한 컴파일 타임 매핑 코드 자동 생성
  - Spring Boot 기반 REST API 엔드포인트 제공 (`/users/dto`)
  - Lombok을 통한 Getter/Setter 및 기타 메서드 자동 생성
  - 단위 테스트와 통합 테스트를 통한 매핑 및 API 검증

## 사용 기술

- **Spring Boot 3.4.3**: 애플리케이션의 기본 프레임워크
- **Gradle**: 빌드 자동화 도구
- **MapStruct**: 컴파일 타임 객체 매핑 라이브러리
- **Lombok**: 보일러플레이트 코드를 줄여주는 라이브러리
- **JUnit 5**: 테스트 프레임워크

## MapStruct에 대한 자세한 설명

MapStruct는 컴파일 타임에 객체 간의 매핑 코드를 자동으로 생성해 주는 라이브러리입니다. 주요 특징은 다음과 같습니다.

1. **컴파일 타임 코드 생성**  
   - MapStruct는 애노테이션 프로세서를 사용하여, 인터페이스에 정의된 매핑 메서드를 기반으로 실제 매핑 코드를 생성합니다.  
   - 이로 인해 런타임 오버헤드 없이 빠른 객체 변환이 가능합니다.

2. **유연한 매핑 설정**  
   - `@Mapper` 애노테이션과 `@Mapping` 애노테이션을 활용하여, 서로 다른 속성 이름이나 구조를 가진 객체 간의 매핑을 쉽게 정의할 수 있습니다.
   - 단순히 같은 이름의 필드를 변환하는 경우, 추가 설정 없이 자동 매핑이 가능합니다.

3. **Lombok과의 연동**  
   - Lombok과 함께 사용할 때, Lombok이 생성한 getter/setter를 MapStruct가 올바르게 인식하도록 의존성 순서를 주의해야 합니다.
   - 일부 환경에서는 `lombok-mapstruct-binding` 의존성을 추가하여, Lombok이 생성한 코드를 MapStruct가 정상적으로 활용할 수 있도록 도와줍니다.
   - 현재 프로젝트에서는 Lombok 의존성을 MapStruct보다 먼저 선언하는 방식으로 문제를 해결하였습니다.

4. **안정성 및 유지보수**  
   - 컴파일 타임에 코드를 생성하기 때문에, 잘못된 매핑이 있을 경우 컴파일 에러로 즉시 확인할 수 있습니다.
   - 유지보수가 쉽고, IDE 지원도 우수합니다.

## 프로젝트 구조

```
mapstruct-example/
├── build.gradle
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/yeppplus/example/mapstruct
│   │   │       ├── controller
│   │   │       │   └── UserController.java   // REST API 제공
│   │   │       ├── dto
│   │   │       │   └── UserDTO.java          // DTO 클래스
│   │   │       ├── entity
│   │   │       │   └── User.java             // Entity 클래스
│   │   │       ├── mapper
│   │   │       │   └── UserMapper.java       // MapStruct 매퍼
│   │   │       └── service
│   │   │           └── UserService.java      // 비즈니스 로직 담당
│   └── test
│       ├── java
│       │   ├── com/yeppplus/example/mapstruct/mapper/UserMapperTest.java   // 단위 테스트
│       │   └── com/yeppplus/example/mapstruct/controller/UserControllerTest.java  // 통합 테스트
└── README.md
```

## Getting Started

### 1. 프로젝트 빌드 및 실행

터미널에서 아래 명령어를 실행해 주세요.

```sh
    ./gradlew clean build
    ./gradlew bootRun
```

애플리케이션이 실행되면 http://localhost:8080/users/dto 에 접속하여 결과를 확인할 수 있습니다.

### 2. 테스트 실행  
   테스트를 실행하려면 아래 명령어를 사용해 주세요.

```sh
   ./gradlew test
```

## 참고 사항

- **Lombok과 MapStruct 연동**:  
  Lombok 의존성이 MapStruct보다 먼저 선언되어야 하며, 일부 상황에서는 `lombok-mapstruct-binding` 의존성을 추가하여 Lombok이 생성한 메서드를 MapStruct가 인식하도록 할 수 있습니다.

- **IDE 설정**:  
  Lombok을 사용 중인 경우, 사용하는 IDE에 Lombok 플러그인이 설치되어 있어야 하며, annotation processor가 활성화되어 있는지 확인해 주시기 바랍니다.

## License

이 프로젝트는 MIT 라이선스 하에 배포됩니다.
