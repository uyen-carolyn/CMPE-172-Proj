from maven:3.6.3-jdk-8
COPY src /app/src
COPY pom.xml /app/pom.xml
WORKDIR /app
RUN mvn clean install

ENTRYPOINT ["java", "-jar", "/app/target/dogshelter-0.0.1-SNAPSHOT.jar"]
