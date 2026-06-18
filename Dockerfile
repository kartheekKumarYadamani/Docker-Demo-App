FROM eclipse-temurin:21-jdk
LABEL maintainer="Kartheek"
WORKDIR /app
COPY target/Docker-Demo-App-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]