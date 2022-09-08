# springboot

## core

    1. 패키지 관리자를 먼저 호출함
       1. pom.xml, build.gradle

    2. classpath, annotation, java class 구성을 패키지 관리자 설정에 따라서 구성

    3. @SpringBootApplication 정체
       1. @Configuration
       2. @EnableAutoConfiguration
       3. @ComponentScan
          1. @Controller
          2. @Service
          3. @Mapper
          4. @Component
       4. Tomcat(WAS) 실행
       5. @SpringBootApplication(exclude = {ActiveMQAutoConfiguration.class, DataSourceAutoConfiguration.class}) (자동구성 끄고 싶다면)


    4. 호출 순서
       1. main()
       2. SpringApplication.run()
