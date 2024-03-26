FROM openjdk:17-jdk
EXPOSE 8080
ADD target/address-ms-02.jar address-ms-02.jar
ENTRYPOINT ["java", "-jar", "/address-ms-02.jar"]

#Command to build image from docker file using Terminal
#docker build -t address-ms-02.jar .

#Command to run docker image and create a container using Terminal
#docker run -p 9090:8080 address-ms-02.jar

#Command to see the list of docker images using Terminal
#docker image ls