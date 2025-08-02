# Use uma imagem base com Java 17
FROM eclipse-temurin:17-jdk-alpine

# Crie e defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo pom.xml e outros arquivos necessários
COPY pom.xml ./

# Baixe as dependências do Maven
RUN ./mvnw dependency:go-offline

# Copie o código da aplicação para a imagem
COPY src ./src

# Compile a aplicação
RUN ./mvnw package -DskipTests

# Exponha a porta configurada na aplicação
EXPOSE 8090

# Comando para rodar a aplicação
CMD ["java", "-jar", "target/cep-0.0.1-SNAPSHOT.jar"]
