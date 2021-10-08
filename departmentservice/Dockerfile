FROM openjdk:16
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} department-service.jar
ENTRYPOINT ["java","-jar","/department-service.jar"]
EXPOSE 9002

#gradle build (for creating department-service.jar under /build/lib directory)
#sudo docker build --build-arg JAR_FILE=build/libs/\*.jar -t department-service . (for creating docker image)
#sudo docker tag user-service:latest amirdoc/user-service:latest (tagging for docker hub)
#sudo docker push amirdoc/user-service (pushing to docker hub)