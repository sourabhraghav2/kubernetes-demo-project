FROM openjdk:12
EXPOSE 9004
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]