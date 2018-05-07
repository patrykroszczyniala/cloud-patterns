# Definition

Sidecar is an application that runs next to the other application on the same host, as new process and extends functionality of the the main app. The example may be 
application statistics, service discovery, logging. Mostly used by the application that is organized into microservices and implemented in several programming languages.

Benefits:
- sidecar is separated so it is easier to maintain
- sidecar is isolated so main app doesn't now anything about it
- sidecar provides isolation and encapsulation

# Example

Application is divided into two microservices. One is written in Python and the other in Java. We want to register each of the applications in Eureka (service discovery).
As I don't know python well I want to use java to implement service discovery.
- java application has built in service discovery client
- python uses sidecar application written in java application

```
+--Docker 1------+      +--Docker 2---------------------------------------+                         +--Docker 2------+
| Python app     | <--> | Sidecar app that registers python app in eureka | <--> Eureka server <--> | Java app       |
+----------------+      +-------------------------------------------------+                         +----------------+
```

As you see sidecar app is not on the same host as python app. That's becase docker container should have one process started (https://docs.docker.com/develop/develop-images/dockerfile_best-practices/#each-container-should-have-only-one-concern).

# Links
- https://docs.microsoft.com/pl-pl/azure/architecture/patterns/sidecar
- https://getpocket.com/a/read/1812100957
- http://projects.spring.io/spring-cloud/spring-cloud.html#_polyglot_support_with_sidecar
- http://ispyker.blogspot.co.uk/2014/08/a-netflixoss-sidecar-in-support-of-non.html
