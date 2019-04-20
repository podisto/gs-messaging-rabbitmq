FROM java:8
MAINTAINER "omardione1991@gmail.com"
WORKDIR /app
COPY target/gs-messaging-rabbitmq-0.0.1-SNAPSHOT.jar /app/gs-messaging-rabbitmq.jar
ENTRYPOINT ["java", "-jar", "gs-messaging-rabbitmq.jar"]