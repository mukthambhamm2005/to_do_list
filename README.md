📝 To-Do List Application

A simple To-Do List REST API built using Spring Boot, Spring Data JPA, and MySQL. This application allows users to create, view, update, and delete tasks.

🚀 Features
Create a new task
View all tasks
View a task by ID
Update an existing task
Delete a task
Store task data in a MySQL database
RESTful API architecture
🛠️ Tech Stack
Java
Spring Boot
Spring Data JPA
MySQL
Maven
Hibernate
📁 Project Structure
src
├── main
│   ├── java
│   │   └── com.example.demo
│   │       ├── controller
│   │       ├── entity
│   │       ├── repository
│   │       ├── service
│   │       └── ToDoListApplication.java
│   └── resources
│       └── application.properties
└── test
⚙️ Prerequisites

Before running the project, ensure you have:

Java 17 or later (or the version used by your project)
Maven
MySQL Server
Git
🗄️ Database Configuration

Create a MySQL database named:

CREATE DATABASE todo_db;

Update src/main/resources/application.properties with your database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
▶️ Running the Application

Clone the repository:

git clone https://github.com/mukthambhamm2005/java_application.git

Navigate to the project directory:

cd java_application

Run the application:

mvn spring-boot:run

The application will start at:

http://localhost:8080
📌 Example API Endpoints
Method	Endpoint	Description
GET	/todos	Get all tasks
GET	/todos/{id}	Get task by ID
POST	/todos	Create a new task
PUT	/todos/{id}	Update a task
DELETE	/todos/{id}	Delete a task

Note: Replace the endpoints above if your controller uses a different base path.

📷 API Testing

You can test the API using:

Postman
Insomnia
cURL

If Swagger/OpenAPI is configured in the project, you can also access the API documentation through the Swagger UI.

📌 Future Improvements
User authentication
Task categories
Due dates and reminders
Task priorities
Search and filtering
Frontend using React or Angular
👩‍💻 Author

Muktha

GitHub: https://github.com/mukthambhamm2005

📄 License

This project is available for learning and educational purposes.
