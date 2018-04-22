# Definition

Sidecar is an application that runs next to the other application on the same host, as new process and provides some information about the main app like statistics, etc. Should be used 
by the application that is organized into microservices that use different programming languages.

Benefits:
- sidecar is separated so it is easier to maintain it
- sidecar is isolated so main app doesn't now anything about it
- sidecar provides isolation and encapsulation

# Example

Application is divided into two microservices. One is written in Python and the other in Java. We want to have statistics stored for each of the microservices. To achieve 
it each application is docerized and executed with additional application that provides application statistics.

```
+--Docker 1------+      +--Docker 2 -----+
| Python app     | <--> | Java pp        |
| Statistics app |      | Statistics app |
+----------------+      +----------------+
```

Python and java application is exchanging some data through REST api. Thanks to the statistics-app we can measure performance of the app.

# Links
- https://docs.microsoft.com/pl-pl/azure/architecture/patterns/sidecar
- https://getpocket.com/a/read/1812100957
- http://projects.spring.io/spring-cloud/spring-cloud.html#_polyglot_support_with_sidecar
