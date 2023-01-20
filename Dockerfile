FROM openjdk:17-jdk
COPY . /app
WORKDIR /app
RUN ./mvnw clean package
EXPOSE 9099
CMD ["java", "-jar", "target/USER-0.0.1-SNAPSHOT.jar"]

