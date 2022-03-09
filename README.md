# Crud-Operations-Scala

This project performs the following activities on a database created on
Postgres database.
* Creating a new data entry.
* Reading a data entry from DB.
* Updating a data entry from DB.
* Deleting a data entry from DB.

## Pre-requisite


* Install Intellij
* Install Postgres and create a table name (Employee).

##Configure


Set DB configuration parameters in conf/application.conf.


##Steps to run


Run the app with sbt run. The app will be available.

* For Insertion: http://localhost:9000/empCreationForm
* For Updation: http://localhost:9000/updateEmployee
* For delete : http://localhost:9000/empDelete
* For reading an employee: http://localhost:9000/empView



