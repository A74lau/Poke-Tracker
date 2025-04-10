# Pokemon Cards Tracker

A Spring Boot web application that allows users to track and display Pokemon cards using the TCGdex API.

## Features

- Display Pokemon cards from the TCGdex API
- Search and filter Pokemon cards
- Modern web interface using Thymeleaf
- RESTful API endpoints for card data

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- Internet connection (for API access)

## Tech Stack

- Spring Boot 2.7.0
- Thymeleaf (Template Engine)
- TCGdex Java SDK 2.0.1
- Lombok
- Maven

## Getting Started

1. Clone the repository:
```bash
git clone [repository-url]
cd pokemon-cards
```

2. Build the project:
```bash
mvn clean install
```

3. Run the application:
```bash
mvn spring-boot:run
```

4. Access the application:
   - Open your web browser and navigate to `http://localhost:8080`


## API Documentation

The application provides the following endpoints:

- `/cards` - Get all Pokemon cards
- `/cards/{id}` - Get a specific card by ID
- `/search` - Search for cards with various filters

## Acknowledgments

- TCGdex API for providing Pokemon card data