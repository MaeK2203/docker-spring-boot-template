FROM adoptopenjdk/openjdk11:alpine-slim

RUN apk add bash

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring


#ARG JAR_FILE=target/*.jar
#ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} app.jar

#ENTRYPOINT ["java","-jar","/app.jar"]

CMD ["/bin/bash"]