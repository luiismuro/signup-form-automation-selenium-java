# 🤖 SignupFormAutomation - Selenium + Java
This project executes the automation task of a user signup flow on the website
[Automation Exercise](https://automationexercise.com), 
by using Java, Selenium WebDriver and the design pattern Page Object Model (POM).

## 🔧 Tecnologies used on this project
- Java 17+
- Maven
- Selenium WebDriver
- JUnit 5
- IntelliJ IDEA
- Page Object Model - POM

## 🔐 Credential Protection configuration
- Create or edit file credential.properties on the root folder of the project with the following variables:
  signup.password=newpassword123

## Requirements
- JAVA JDK installed
- Maven installed
- Chrome installed
- Stable internet connection

## How to execute
- Clone this project locally
  git clone https://github.com/seu-usuario/signup-form-automation-selenium-java.git
  cd signup-form-automation-selenium-java
- Execute SignupTest file
  mvn test -Dtest=SignupTest
- Execute LoginTest file
  mvn test -Dtest=LoginTest

## Remarks
- If you have IntelliJ IDEA IDE you can run directly on the environment by clicking on "Run"

The file `credentials.properties` contains sensitive data (email and password) **not versioned** on Git. 
It stores used password on the signup form; Create a new one once you have cloned this repository locally.

