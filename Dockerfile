FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} myworkoutmanager.jar
ENTRYPOINT ["java","-jar","/myworkoutmanager.jar"]