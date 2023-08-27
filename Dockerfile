FROM openjdk:17-jdk

VOLUME /tmp

ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS

COPY build/libs/*.jar apiproject.jar

EXPOSE 8080

#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar apiproject.jar
# ENTRYPOINT exec java $JAVA_OPTS -jar apiproject.jar
ENTRYPOINT [ "java","-jar","/apiproject.jar" ]
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar apiproject.jar
