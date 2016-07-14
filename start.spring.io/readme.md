1. At [start.spring.io](http://start.spring.io) configure a war project (not jar) with "Jpa, MySql, and Web". Unpack it and import in eclipse.
2. After it imports, run maven update on the project.
3. Under src/main/resources, copy these values into application.properties:
	spring.datasource.initialize=true
	spring.datasource.url=jdbc:mysql://localhost:3306/DATABASE_NAME
	spring.datasource.username=APP_DBA_NAME
	spring.datasource.password=APP_DBA_PASSWORD
	spring.datasource.driverClassName=com.mysql.jdbc.Driver
	spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
	spring.jpa.generate-ddl=true
	spring.jpa.show-sql=true

	_In our case, we are using "root" and "bondstone" for username and password on the mysql database. And in this project the database is named "spring_jparepo"_