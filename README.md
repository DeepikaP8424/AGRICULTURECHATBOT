## PROJECT TITLE
Agricultural Chatbot

## Table of contents
* Description
* Tech Stack
* Features
* Working Procedure


## Description
The Agriculture Chatbot is a web-based application developed using Spring Boot, Java, and MySQL that helps farmers get instant answers to common agricultural queries. The chatbot allows users to ask questions related to sowing season, harvest time, fertilizer usage, soil type, pest control, and weather updates.
It is designed to assist farmers—especially from rural areas—by providing accurate agricultural information through a simple chat interface.

## Tech Stack
| Category                 | Technology                      | Purpose                                            |
| ------------------------ | ------------------------------- | -------------------------------------------------- |
| **Programming Language** | **Java**                        | Core language for backend logic                    |
| **Framework**            | **Spring Boot**                 | To build and run RESTful web services              |
| **Web Module**           | **Spring Web**                  | For creating REST APIs (ChatController, endpoints) |
| **Database**             | **MySQL**                       | To store question–answer data                      |
| **ORM**                  | **Spring Data JPA**             | For connecting and interacting with MySQL          |
| **Build Tool**           | **Maven**                       | For managing dependencies and building the project |
| **Server**               | **Apache Tomcat (embedded)**    | Automatically runs the application via Spring Boot |
| **Testing Tool**         | **Postman**                     | To test API endpoints like `/api/chat`             |
| **IDE**                  |  **Eclipse**                    | For coding and running your project                |

## Features
1)Users can ask agriculture-related questions.
2)The chatbot gives instant answers from the database.
3)Questions and answers are stored in a MySQL database.
4)Uses Spring Boot REST API to handle user queries.
5)Displays a message if the answer is not available.
6)Easy to add new questions and answers to the database.
7)Tested using Postman for API responses.

## Working Principle
1)The user types an agriculture-related question (like “When should I sow rice?”).
2)The question is sent to the Spring Boot REST API through the ChatController.
3)The controller checks the MySQL database using Spring Data JPA to find a matching question.
4)If the question exists, the corresponding answer is fetched from the database.
5)The chatbot then sends the answer back to the user as a response.
6)If no match is found, the chatbot replies with a message like “Sorry, I don’t have information on that yet.”
