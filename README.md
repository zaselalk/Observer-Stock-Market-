# Observer Pattern in Stock Market Scenario

## Overview
This project demonstrates the implementation of the Observer design pattern in a stock market scenario. The Observer pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. In this project, we have a `Stock` class that represents a stock and an `Investor` class that represents an investor. The `Stock` class notifies all registered investors whenever its price changes.

## Setup Instructions
1. Clone the repository to your local machine using the following command:
   ```
   git clone https://github.com/zaselalk/Observer-Stock-Market-.git
   ```
2. Navigate to the project directory:
   ```
   cd Observer-Stock-Market-
   ```
3. Ensure you have Java Development Kit (JDK) installed on your machine. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
4. Compile the Java files:
   ```
   javac src/*.java
   ```
5. Run the project:
   ```
   java src/Main
   ```

## Usage Examples
Here is an example of how to use the project:

1. Create a stock:
   ```java
   Stock stock = new Stock("TechLanka", 23.2F);
   ```

2. Create investors:
   ```java
   Investor investor1 = new Investor("Saman", 20.2, 25.4);
   Investor investor2 = new Investor("Sunil", 16.5, 19.4);
   Investor investor3 = new Investor("Chamar", 25.3, 28.4);
   ```

3. Register investors with the stock:
   ```java
   stock.registerObserver(investor1);
   stock.registerObserver(investor2);
   stock.registerObserver(investor3);
   ```

4. Simulate a price change:
   ```java
   stock.setPrice(20);
   stock.setPrice(13);
   ```
