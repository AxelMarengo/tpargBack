FROM amazoncorretto:20-alpine-jdk

COPY D:/Users/PC/Documents/NetBeansProjects/demo/target/demo-0.0.1-SNAPSHOT app.jar

ENTRYPOINT ["java","-jar","/app.jar"]