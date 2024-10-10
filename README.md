# Java-Servlet-handling-Cookies
This repository showcases a basic example of Java Servlets handling HTTP requests and using Cookies for session management. The project demonstrates how servlets can store and retrieve cookies to maintain user sessions across different servlets. It was built using Eclipse IDE, with deployment on Apache Tomcat
Project Features:
Servlet 1 (CookiesServlet1): Handles the initial request, receives user input via an HTML form, and sets a cookie with the user's name. The user is welcomed with a personalized message, and the servlet provides a button to navigate to the second servlet.

Servlet 2 (CookiesServlet2): Retrieves the cookie from the request, checks if the user is returning, and displays a customized welcome back message if the cookie is found. Otherwise, it identifies the user as new and directs them back to the home page.

Cookie Management: Demonstrates how cookies can be set and retrieved to maintain a user's session across multiple servlet requests.

HTML Forms: The project includes a simple HTML form that allows users to input their name and submit it to the first servlet.

Technologies Used:
Java Servlets (Jakarta Servlet API): Used for handling HTTP requests and managing cookies.
MySQL Database: While the focus is on cookies, the project structure allows for future database integration using MySQL.
Apache Tomcat: The servlets are deployed on Apache Tomcat, which manages the server-side operations.
Eclipse IDE: Developed and managed using the Eclipse IDE for easy modification and extension
