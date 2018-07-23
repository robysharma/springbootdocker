FROM openjdk:nanoserver
ADD target/spring-boot-docker.jar spring-docker.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","spring-docker.jar"]