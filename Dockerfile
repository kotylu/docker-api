FROM openjdk:18-slim
COPY target/docker-api*.jar docker-api.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/docker-api.jar"]
