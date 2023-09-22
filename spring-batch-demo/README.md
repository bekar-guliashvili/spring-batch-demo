# Spring Boot Batch Demo
This is a Spring Boot project that shows how we can use spring batch job to enter large volume of data in db efficiently.
Example shows one million records inserted in H2 Database.

## Dependencies:
* Spring Boot 3.1.4 
* Java 17
* Lombok
* Spring Web
* Spring Data JPA
* H2 Database
* Spring Batch

## API Endpoints
Project has two different api endpoints one demonstrates embedded csv file inserted in bd and another endpoint allows us upload our own csv file

### Trigger Batch job to insert embedded csv file
* Method: POST
* URI: http:/localhost:8080/api/v1/job/importData

### Upload csv file and trigger batch job
* Method: POST
* URI: http:/localhost:8080/api/v1/job/uploadData

## To Access H2 DB
* URI: http://localhost:8080/h2-console
* DB Name: person-manager
* Table: Persons