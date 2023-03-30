FROM openjdk:17-jdk-slim

COPY target/cicd-maven-test-0.0.1-SNAPSHOT.jar ./app.jar
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-Dspring.profiles.active=${USE_PROFILE}", "-jar", "./app.jar"]
