FROM eclipse-temurin:21-jre
WORKDIR /app
COPY build/libs/kratos-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]