FROM eclipse-temurin:21
LABEL authors="woong"

WORKDIR /app

COPY ./build/libs/woongserver-0.0.1-SNAPSHOT.jar docker-springboot.jar

ENTRYPOINT ["java", "-jar", "docker-springboot.jar"]
