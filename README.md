# Reactive Project README
==========================

## Overview
------------

This is a reactive project built using Java and Maven. The project appears to be a RESTful API for managing students.

## Directory Structure
-----------------------

* `reactive/`: Root directory of the project
* `src/`: Source code directory
	+ `main/`: Main source code directory
		- `java/`: Java source code directory
			- `com/`: Package directory
				- `abidi/`: Package directory
					- `reactive/`: Package directory
						- `student/`: Package directory containing student-related classes

## Files
---------

* `mvnw` and `mvnw.cmd`: Maven wrapper scripts
* `StudentController.java`: REST controller for managing students

## StudentController
--------------------

The `StudentController` class is a REST controller that provides methods for managing students. The following methods are available:

### Find All Students

* HTTP Method: GET
* URI: /students
* Returns: A list of all students

### Find Student by ID

* HTTP Method: GET
* URI: /students/{id}
* Returns: A single student with the specified ID

### Create New Student

* HTTP Method: POST
* URI: /students
* Request Body: Student object
* Returns: The newly created student

### Find Students by Author

* HTTP Method: GET
* URI: /students/author/{author}
* Returns: A list of students written by the specified author

### Delete Student

* HTTP Method: DELETE
* URI: /students/{id}
* Returns: No content

## Building and Running the Project
------------------------------------

To build and run the project, navigate to the project root directory and run the following command:

```bash
./mvnw spring-boot:run
