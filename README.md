# CRUD Application

## Description
I dedicate this repository to build a simple CRUD REST API.
This API creates products with and ID, a Name and a Description. I built this just to test my skills in Spring and to start a journey into Spring Framework Development.

CRUD is an acronym which each letter stands for an operation in the system.

 - **C** - Create
 - **R** - Read
 - **U** - Update
 - **D** - Delete

## Usage

 - Download the source code;
 - Navigate to the directory;
   
   ``cd {where-you-downloaded-the-repo}/crud-application``
 - Run the following command;
   
    `./mvnw spring-boot:run`

 - Check out the resources folder and import the `crud-application.postman_collection.json` file to your favorite API Client;
    
    `crud-application/src/main/resources`

 - Use the [POST] request to create products;
 - Use the [GET] request to retrieve all products you've created;
 - Use the [PUT] request to update a product;
 - Use the [DELETE] request to delete a product;
