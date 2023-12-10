#Base Docker Image
FROM openjdk:17
LABEL maintainer "docker-compose"
ADD target/docker-compose-0.0.1-SNAPSHOT.jar docker-compose.jar
ENTRYPOINT ["java", "-jar", "docker-compose.jar"]