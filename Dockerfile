# Use official OpenJDK 17 image as base
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/tsp-app-server.jar /app/tsp-app-server.jar

# Expose port 8080 to the host
EXPOSE 8080

# Set default values for environment variables
ARG DB_HOST=default_host
ARG DB_PORT=default_port
ARG DB_NAME=default_name
ARG DB_USERNAME=default_username
ARG DB_PASSWORD=default_password

# Set environment variables
ENV DB_HOST=$DB_HOST \
    DB_PORT=$DB_PORT \
    DB_NAME=$DB_NAME \
    DB_USERNAME=$DB_USERNAME \
    DB_PASSWORD=$DB_PASSWORD

# Install PostgreSQL client
RUN apk --no-cache add postgresql-client

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "tsp-app-server.jar"]
