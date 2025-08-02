# Fase de construção
FROM maven:3.8.6-openjdk-17 AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn -B dependency:resolve
COPY src ./src
RUN mvn -B package

# Fase de produção
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/cep-0.0.1-SNAPSHOT.jar"]
