 **Author :** Yeltay Olzhas
 
 **Group:** SE-2518

## Vehicle Management System

## Project Overview
This system is designed to manage various vehicles and their drivers. It demonstrates core OOP principles: inheritance, abstraction, and association .


## Class Hierarchy

Vehicle (Abstract): The base class containing brand, year fields and abstract methods startEngine(), stopEngine() .

Subclasses (Car, Motorcycle, Truck): Specific vehicle types that call the super() constructor and override abstract methods to define unique behaviors .
 
Driver: Stores the driver's name and license number. Each vehicle is associated with a driver object .

## How to Run
Compile files: javac *.java

Run program: java Main

## Reflection

Inheritance: Simplified the design by allowing shared code to be stored in one superclass.


Overriding: Helped customize engine behaviors for different vehicle types.


Access Modifiers: Data was secured using protected and private modifiers to ensure proper encapsulation.

