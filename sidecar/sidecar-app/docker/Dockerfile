FROM java:latest

COPY ./target/*.jar /app/
WORKDIR /app

ENTRYPOINT ["java", "-jar", "sidecar-app-0.0.1-SNAPSHOT.jar"]
