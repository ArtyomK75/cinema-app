# Cinema-app
# Description
Cinema app it's a service which allows register customers and reservation a cinema tickets. This app supports 
authentication, registration, CRUD (Create, Read, Update,Delete) operations with entity of database. 

# Features:
- registration user with relevant role;
- authentication user;
- create/get list of a cinema hall;
- create/get list of a movies;
- create/update/remove/get available a movie sessions;
- add a tickets on chosen a movie sessions and get tickets for an authenticated user;
- complete an order and get list of orders for an authenticated user;
- get info about user by e-mail;

# Technologies Used
- Spring framework 5.3.20
- Hibernate 5.6.14.Final
- jackson databind (JSON) 2.14.1
- Java 11
- Maven 3.1.1
- Apache Tomcat
- Java Servlet API
- MySQL 8.0.28

# Instructions:
- Before running the app, you need to feel database connection parameters in resources/db.properties file.
- adjust debug configuration options on TomCat 8.5.- or 9.5.-
- then run app, it creates two roles "ADMIN" and "USER" and create a user with login "admin@i.ua" and 
  password "admin123" without quotes. 
