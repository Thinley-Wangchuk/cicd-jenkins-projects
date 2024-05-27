FROM openjdk:17-oracle


EXPOSE 8086


ADD target/docker-jenkins-integration-sample.jar docker-jenkins-integration-sample.jar


ENTRYPOINT ["java", "-jar", "/docker-jenkins-integration-sample.jar"]