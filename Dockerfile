# Use Amazon Corretto JDK 21 as base image
FROM amazoncorretto:21 as base

LABEL authors="chandrakommuri"

# Set working directory
WORKDIR /app

# Copy built JAR (assuming you’re using Gradle's default location)
COPY build/libs/*.jar app.jar

# Expose port (optional)
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
