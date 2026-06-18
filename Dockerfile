FROM eclipse-temurin:21-jdk
LABEL maintainer="Kartheek"
WORKDIR /app
COPY target/docker-app app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]