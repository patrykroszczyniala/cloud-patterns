FROM java:latest

COPY ./target/*.jar /app/
WORKDIR /app

ENTRYPOINT ["java", "-jar", "java-web-app-0.0.1-SNAPSHOT.jar"]
