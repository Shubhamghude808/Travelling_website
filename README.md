Web Application Overview:

This web application is developed using Java, JSP (JavaServer Pages), and JDBC (Java Database Connectivity), with SQL serving as the backend database. The system is designed to allow users to manually input their details, which are stored in real-time. Additionally, an admin panel provides a secure space for authorized administrators to log in and view all user records in a tabular form, reminiscent of Java Persistence API (JPA) functionality.



Key Components:

Database Setup:
The application relies on a well-structured SQL database where user details are stored. This involves creating and maintaining the necessary tables to store information securely.

JDBC Connection:
JDBC is utilized to establish a connection between the Java application and the SQL database. This ensures seamless communication for storing and retrieving user data.

User Input Form (JSP):
A user-friendly JSP page is designed to capture user details through an interactive form. Upon submission, the data is processed by a servlet or JSP, utilizing JDBC to store the information in the SQL database.

Data Retrieval Servlet (JDBC):
To facilitate admin access, a servlet or JSP is responsible for retrieving user records from the database using JDBC. The retrieved data is then formatted for presentation in the admin panel.

Admin Panel (JSP):
An administrator-exclusive section is crafted using JSP, incorporating authentication mechanisms to ensure only authorized personnel can access this sensitive area. Robust security practices are implemented to protect against unauthorized access.

Display Records in a Tabular Form (JSP):
Within the admin panel, a dedicated segment is created to display user records in a tabular format. The data is presented in an HTML table, offering a structured and easy-to-read overview of user details.
