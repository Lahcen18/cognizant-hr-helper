## Steps to follow
### 1- start the mysql server on your local host
### 2- import the project in Eclipse or your favorite IDE (as a maven project)

#### modify the properties file if needed based on your local environment:
/newcomeratcognizant/src/main/resources/persistence-mysql.properties :
this file holds all DB properties

### 3- custom mysql database table ( the MySQLWorkBench app is neded to do this):
#### use the script ( the MySQLWorkBench app is neded to do this):
##### /newcomeratcognizant/sql-scripts/newcomer_database.sql
to create a newcomers database table

### 4- launch the application

Right click on :
the 
##### /newcomeratcognizant/src/main/java/com/cognizant/springsecurity/demo/config/DemoAppConfig.java class,
Run As -> Java Application.
