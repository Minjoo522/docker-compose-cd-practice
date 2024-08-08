FROM openjdk:21

ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Dbackend.test=${BACKEND_TEST}", \
                "-jar", "/app.jar"]
