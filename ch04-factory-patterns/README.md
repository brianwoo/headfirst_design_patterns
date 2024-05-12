# Factory Patterns


## Factory Method Pattern

The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

## Abstract Factory Pattern

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.


## Creator
- Creator is a class that contains the implementations for all of the methods to manipulate products, excpet for the factory method.
- Has a abstract factoryMethod()
- Concreate Creator implements the factoryMethod()

## Product
- Product interface
- ConcreteProduct implements Product

## Dependency Inversion Principle
- No variable should hold a reference to a concrete class.
  - If you use new, you’ll be holding a reference to a concrete class. Use a factory to get around that!
- No class should derive from a concrete class.
  - Derive from an abstraction, like an interface or an abstract class
- No method should override an implemented method of any of its base classes.
- NOTE: Keep this in mind when designing classes that are likely to change.



## Classes

### Subject (interface)
- WeatherData implements Subject

### Observer (interface)
- CurrentConditionsDisplay implements Observer


## Diagram
![Class Diagram 1](./images/f0052-01.png)

![Class Diagram 2](./images/f0057-01.png)