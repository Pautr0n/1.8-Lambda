# **Sprint 1, Task 8 - Lambda Expressions**

## Exercise Description:
### Level 1
- **Exercise 1**
  - From a list of Strings, write a method that returns a list of all strings containing the letter ‘o’. Print the result.
- **Exercise 2**
  - Do the same as in the previous point, but now the method must return a list of Strings that contain the letter ‘o’ and have more than 5 characters. Print the result.
- **Exercise 3**
  - Create a list with the names of the months of the year. Print all elements of the list using a lambda.
- **Exercise 4**
  - Perform the same print operation as the previous point, but using method reference.
- **Exercise 5**
  - Create a Functional Interface with a method named getPiValue() that returns a double. From the main() method of the main class, instantiate the interface and assign it the value 3.1415. Invoke the getPiValue() method and print the result.
- **Exercise 6**
  - Create a list with numbers and text strings, and sort the list from shortest to longest strings.
- **Exercise 7**
  - Using thelist from the previous exercise, now sort it in reverse: from longest to shortest strings.
- **Exercise 8**
  - Create a Functional Interface containing a method named reverse(). This method must receive and return a String. In the main() method of the main class, inject the method body into the interface using a lambda so that it returns the same string received as a parameter, but reversed. Invoke the interface instance by passing a string and check if the result is correct.

### Level 2
- **Exercise 1**
  - Create a list of strings with proper names. Write a method that returns a list of all strings that start with the letter 'A' (uppercase) and have exactly 3 letters. Print the result.
- **Exercise 2**
  - Write a method that returns a comma-separated string based on a list of Integers. Each element must be preceded by the letter “e” if the number is even, or by the letter “o” if the number is odd. For example, if the input list is (3, 55, 44), the output should be “o3, o55, e44”. Print the result.
- **Exercise 3**
  - Create a Functional Interface containing a method named operacio() that returns a float. Inject the method body into the interface using a lambda, so that the operation can be transformed into addition, subtraction, multiplication, and division.
- **Exercise 4**
  - Create a list containing some text strings and numbers. Sort them by:
    - Alphabetically by the first character. (Note: charAt(0) returns the numeric code of the first character)
    - Strings containing an "e" first, the rest afterward. Write the code directly in the lambda. 
    - Modify all list elements that contain an ‘a’. Replace ‘a’ with ‘4’. 
    - Show only the elements that are numeric (even if stored as Strings).
### Level 3
- **Exercise 1**
  - Create a class Student with the attributes: name, age, course, and grade. 
  - Fill a list with 10 students.
    - Display the name and age of each student. 
    - Filter the list for all students whose name starts with ‘a’. Assign these students to another list and display the new list (all using lambdas). 
    - Filter and display students with a grade of 5 or higher. 
    - Filter and display students with a grade of 5 or higher who are not enrolled in PHP. 
    - Display all students who study JAVA and are of legal age.


## **Technologies Used**
- JDK 21
- IntelliJ IDE
- Git & GitHub
- Maven

## **Requirements**
- JDK 21 or greater. (JRE 21 +)
- Maven dependencies:
  - 

## **Installation**
n/a

## **Execution**
- **Using an IDE (from source code without building the project):**
    - Download the repository.
    - Open the project with the IDE
    - Execute the main or the testing classes inside test/java directory.

## **Deployment**
n/a

## **Contributions**
This code has been written by a novice, I will really appreciate your contributions:
1. Fork the repository
2. Create a new branch
3. Commit your contributions
4. Upload them to your branch
5. Execute a pull request
