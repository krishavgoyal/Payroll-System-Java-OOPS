# Payroll-System-Java-OOPS
An Employee Payroll System built in Java using Object-Oriented Programming (OOP). This project highlights the use of Abstract classes, Inheritance, and the ArrayList collection for dynamic data management and salary calculations.

 *Key Features*
Dynamic Management: Add and remove employees in real-time using ArrayList.
Employment Types: Supports both Full-Time (monthly salary) and Part-Time (hourly wage) employees.
Automated Calculations: Automatically calculates salaries based on the specific employee type logic.
ID-Based Removal: Easily manage the workforce by removing employees using their unique ID.

*OOP Concepts Applied*
This project demonstrates advanced Java concepts:
Abstraction: The Employee class is abstract, ensuring it acts as a template for specific employee types.
Polymorphism: The calculatesalary() method is overridden in different classes to provide custom logic for each type.
Collections (ArrayList): Moving away from fixed-size arrays to a dynamic list for storing employee objects.
Encapsulation: Use of private fields with public getters to maintain data security.
Method Overriding: Customizing the toString() method for clean and readable console output.

*System Architecture*
Employee (Abstract Class): The base class containing ID, Name, and an abstract method for salary.
FullTimeEmployee: A child class specifically for salaried staff.
PartTimeEmployee: A child class for staff working on an hourly basis.
PayrollSystem: The "Engine" of the project that manages the ArrayList and handles business logic.
Main: The entry point where employees are created and the system is tested.
