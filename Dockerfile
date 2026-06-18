FROM eclipse-temurin:21-jdk
MAINTAINER Kartheek <90909090>
COPY target/Docker-Demo-App.jar /usr/app
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","Docker-Demo-App.jar"]