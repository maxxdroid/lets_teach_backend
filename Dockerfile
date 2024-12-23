#build the app
FROM maven:3.8.1-openjdk-17 AS BUILD
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

#create final image
FROM openjdk:17.0.1-slim
WORKDIR /app
COPY --from=BUILD /app/target/backend-0.0.1-SNAPSHOT.jar backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "backend.jar"]