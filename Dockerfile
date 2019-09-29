FROM adoptopenjdk/openjdk11
ADD build/libs/payment-info-service-0.0.1-SNAPSHOT.jar payment-info-service-0.0.1-SNAPSHOT.jar
EXPOSE 7081
ENTRYPOINT ["java","-jar","payment-info-service-0.0.1-SNAPSHOT.jar"]
