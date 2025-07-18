# Spring Kafka Wikimedia

This project demonstrates how to use Spring Boot with Apache Kafka to consume Wikimedia recent changes events in real-time.

## Features

- Consumes Wikimedia recent changes stream using Kafka.
- Spring Boot-based application for easy configuration and deployment.
- Example of integrating external event sources with Kafka.

## Prerequisites

- Java 17 or higher
- Apache Kafka (local or remote)
- Maven

## Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/uy-nguyen00/spring-kafka-wikimedia.git
   cd spring-kafka-wikimedia
   ```

2. **Start Kafka (if not already running):**
   - You can use Docker or your local Kafka installation.

3. **Configure application properties:**
   - Edit `src/main/resources/application.properties` to set your Kafka broker address and topic.

4. **Build the project:**
   ```bash
   mvn clean install
   ```

5. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

## Usage

- The application will start consuming Wikimedia events and send them to the configured Kafka topic.
- You can monitor the Kafka topic using a Kafka consumer.

## Project Structure

- `src/main/java`: Java source code
- `src/main/resources`: Configuration files
- `pom.xml`: Maven build file

## License

This project is licensed under the MIT License.

