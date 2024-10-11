# Java-Servlet-handling-Cookies
This repository showcases a basic example of Java Servlets handling HTTP requests and using Cookies for session management. The project demonstrates how servlets can store and retrieve cookies to maintain user sessions across different servlets. It was built using Eclipse IDE, with deployment on Apache Tomcat
# Java Servlet Handling Cookies

This repository showcases a basic example of Java Servlets handling HTTP requests and using cookies for session management. The project demonstrates how servlets can store and retrieve cookies to maintain user sessions across different servlets. It was built using Eclipse IDE and deployed on Apache Tomcat.

## Project Overview

The project consists of two servlets that manage user sessions using cookies:

- **Servlet 1 (CookiesServlet1)**: Handles the initial request, receives user input via an HTML form, and sets a cookie with the user's name. The user is welcomed with a personalized message and provided a button to navigate to the second servlet.

- **Servlet 2 (CookiesServlet2)**: Retrieves the cookie from the request, checks if the user is returning, and displays a customized welcome back message if the cookie is found. Otherwise, it identifies the user as new and directs them back to the home page.

## Project Features

- **Cookie Management**: Demonstrates how cookies can be set and retrieved to maintain a user's session across multiple servlet requests.

- **HTML Forms**: Includes a simple HTML form that allows users to input their name and submit it to the first servlet.

## Technologies Used

- **Java Servlets (Jakarta Servlet API)**: Used for handling HTTP requests and managing cookies.

- **MySQL Database**: While the focus is on cookies, the project structure allows for future database integration using MySQL.

- **Apache Tomcat**: The servlets are deployed on Apache Tomcat, which manages server-side operations.

- **Eclipse IDE**: Developed and managed using the Eclipse IDE for easy modification and extension.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Ensure that JDK 11 or above is installed on your machine. [Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

- **Apache Tomcat**: Download and set up Apache Tomcat. [Download Tomcat](https://tomcat.apache.org/).

- **Eclipse IDE**: Download and install the Eclipse IDE for Java EE Developers. [Download Eclipse](https://www.eclipse.org/downloads/).

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/Java-Servlet-handling-Cookies.git
Open the Project in Eclipse:

Launch Eclipse IDE and select the workspace where you cloned the repository.
Import the project into Eclipse by navigating to File > Import > Existing Projects into Workspace.
Configure the Project to Run on Apache Tomcat:

Right-click on the project, go to Properties, and select Targeted Runtimes.
Check the box for the Apache Tomcat server and apply the changes.
Deploy the Project on Tomcat:

Right-click on the project, go to Run As, and select Run on Server.
Choose the Apache Tomcat server and click Finish.
Usage
Access CookiesServlet1:

Open your web browser and navigate to the URL for the first servlet. Typically, this will be:
http://localhost:8080/Java-Servlet-handling-Cookies/CookiesServlet1
Submit User Input:

Enter your name in the provided HTML form and submit it to create a cookie.
Access CookiesServlet2:

After submitting the form, click the button to navigate to the second servlet, which will greet you based on the cookie retrieved from your session.
Project Structure
src: Contains Java source files, including CookiesServlet1.java and CookiesServlet2.java.
WebContent: Contains HTML files and the WEB-INF directory with the web.xml configuration.
Contributing
Contributions are welcome! Feel free to fork this repository, open issues, or submit pull requests for improvements or bug fixes.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Notes
Screenshots and Links: If you have screenshots or specific links, feel free to add them under the appropriate sections.
Customize Paths: Adjust any paths or project details to fit your specific implementation.
Future Database Integration: If you plan to integrate a MySQL database, consider adding specific instructions in the appropriate section.Additional Resources
Java Servlets Documentation
Apache Tomcat Documentation
MySQL Documentation

### Key Highlights:
- This `README.md` outlines the project details, technologies used, installation instructions, and how to use the servlets.
- It encourages contributions and provides additional resources for further reading.

You can add this file to your GitHub repository, and it will help others understand and get started with your project effectively. Let me know if you need any further modifications!
