FROM openjdk:8-jdk-alpine

WORKDIR /usr/src/app

COPY build/libs/calculator-0.0.1-SNAPSHOT.jar ./app.jar


ENTRYPOINT [ "sh", "-c", "java  -jar ./app.jar" ]