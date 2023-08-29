FROM amazoncorretto:17

CMD ["./gradlew", "build"]

VOLUME /tmp

COPY build/libs/apiproject-0.0.1-SNAPSHOT.jar apiproject.jar

COPY src/main/resources/uploads src/main/resources/uploads

EXPOSE 8080

ENTRYPOINT [ "java","-jar","/apiproject.jar" ]
