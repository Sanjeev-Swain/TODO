# Todo_model
This project is Todo Application project based on springboot .
Frameworks used : MVC and Springboot 
Languages used : Java 

Application properties : 
spring.datasource.url=jdbc:h2:mem:Tododb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource--initialization=true

Dependencies : 
Devtools
Spring web
Lombok
H2 database
hibernate

Data Flow : 
Controller : Consists of all end points of the crud operations 
Service : Consists of all the functions and methods are defined under it for performing all the crud operations (create,read,update,delete)
Model : Consists of the model structure of the application . All the variables are defined in it.
Repository : Jpa repository is defined.

Project Summary : It is a todo application which provides to list all your todo list , you can see all your to-do's , create new todo , update your todo and delete it
