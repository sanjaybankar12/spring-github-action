#Creating Jar file
FROM maven:3.6.3-openjdk-17-slim AS stage1
WORKDIR /app/home
COPY . /app/home/
RUN mvn -f /app/home/pom.xml clean package

#Jar file
FROM openjdk:17-ea-17-jdk-slim AS stage2
EXPOSE 8080
COPY --from=stage1 /app/home/target/spring-github-action.jar spring-github-action.jar
ENTRYPOINT [ "sh", "-c", "java -jar /spring-github-action.jar"]