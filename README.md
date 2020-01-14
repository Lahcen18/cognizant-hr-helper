## Steps to follow
1. start the mysql server on your local host
1. import the project in Eclipse or your favorite IDE, as a maven project
1. modify the properties file if needed based on your local environment: **/newcomeratcognizant/src/main/resources/persistence-mysql.properties**. This file holds all DB properties
1. create a custom mysql database table : use the script **/newcomeratcognizant/sql-scripts/newcomer_database.sql** to create a newcomers database table ( the **MySQLWorkBench** app is neded to do this)
1. launch the application
Right click on :
the **/newcomeratcognizant/src/main/java/com/cognizant/springsecurity/demo/config/DemoAppConfig.java** class, Run As -> Java Application.
