FROM maven:3.9.5-eclipse-temurin-17 AS builder
WORKDIR /workspace
COPY . /workspace
RUN sed -e '/<mirrors>/r ali.xml' /usr/share/maven/conf/settings.xml -i
RUN mvn package

FROM eclipse-temurin:17
WORKDIR /app
COPY --from=builder /workspace/target/vo-admin-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]