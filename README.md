[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/MdZ8SJ0i)
# tJavaModule08fall24
tJavaModule08fall24

CIT-63 Final Programming Assignment: Java and Spring Boot

Objective: Build a RESTful API using Java and Spring Boot to manage user information. This assignment focuses on creating a backend API for handling user data, interacting with external APIs, and building a full-stack application using the Model-View-Controller (MVC) framework.

Starter Code:
A GitHub Classroom repository containing a basic Spring Boot project with initial configurations and a simple REST endpoint.

Tasks:
1. Create a RESTful API for User Management
Description: Develop REST endpoints to perform CRUD (Create, Read, Update, Delete) operations for user information. The API should handle requests to manage a list of users, including details like name, email, and phone number.
Purpose: Introduces students to the fundamentals of building RESTful APIs and handling user data in a structured manner.
2. Connect to an External API
Description: Create a new endpoint in the API that retrieves additional data about a user by calling an external REST API. For example, fetch location details or weather data for the user based on their provided city.
Purpose: Demonstrates how to interact with external APIs and process JSON responses in Spring Boot.
3. Input Validation and Error Handling
Description: Implement input validation to ensure the API only accepts properly formatted user data (e.g., valid email addresses, non-empty fields). Add error handling to respond with meaningful HTTP status codes (e.g., 400 Bad Request, 404 Not Found) for invalid requests.
Purpose: Teaches students to design robust, user-friendly APIs that can gracefully handle errors and invalid inputs.
4. Implement Paging and Sorting
Description: Add functionality to the "Get All Users" endpoint to support pagination and sorting by user attributes (e.g., name or email). Use query parameters to define the page size, page number, and sorting order.
Purpose: Introduces techniques for handling large datasets in API responses and improves usability for frontend integrations.
5. Security and Authentication
Description: Secure the API endpoints using basic authentication or token-based authentication (e.g., JWT). Restrict access to certain endpoints based on user roles (e.g., admin vs. regular user).
Purpose: Provides practical experience in securing APIs, an essential skill in modern backend development.
6. Frontend Integration
Description: Create a simple frontend using HTML, CSS, and JavaScript (or a framework like React) to interact with the API. The frontend should allow users to:
Add new users.
View, update, and delete existing users.
Access additional data fetched from the external API.
Purpose: Demonstrates full-stack development by integrating a frontend with the backend API.
Expected Outcomes:
By the end of this assignment, students should be able to:

Develop RESTful APIs using Spring Boot for real-world use cases.
Handle user data securely and efficiently.
Integrate external APIs into backend applications.
Build a frontend that interacts with a backend API for a complete full-stack application.
Submission Guidelines:
Students must:

Submit the complete Spring Boot project folder.
Include a README file documenting their API endpoints, how to run the application, and any external APIs used.
Provide a link to their frontend (deployed locally or on a platform like GitHub Pages or Netlify).
Optionally, submit a short video demo of the application showcasing its features.
Assessment Criteria:
Functionality: All required endpoints are implemented and function as specified.
Error Handling: Clear, robust validation and meaningful error messages.
Security: Proper implementation of authentication and role-based access control.
Code Quality: Clean, well-documented, and modular code.
Integration: A working frontend that successfully interacts with the API.
This assignment equips students with the skills to build RESTful APIs, interact with external APIs, and develop full-stack applications using Java and Spring Boot. By completing this assignment, students will gain valuable experience in modern application development.







