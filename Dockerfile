# the container
FROM openjdk:28-ea-trixie

# copy source and destinate
ADD target/student-app.jar student-app.jar

# the command
ENTRYPOINT [ "java", "-jar", "/student-app.jar" ]
