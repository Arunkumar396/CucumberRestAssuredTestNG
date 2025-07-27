
# CucumberRestAssuredTestNG

Project designed to run automated BDD tests using Cucumber, Rest Assured, and TestNG in Java. Instead of writing complicated test code, Cucumber enables mapping ordinary language to code for easy collaboration between testers and developers. This repository allows users to quickly set up and execute REST API and UI tests, supporting robust reporting and utilities for common testing tasks.

**Note:** This project includes utility methods (click, fill, waits, DB connection, file management, etc.) for end-to-end test automation.

---

## Requirements

- **Java JDK** (version 8 or higher)
- **Maven** (for dependency and build management)
- **Supported browsers** (for WebDriver-based UI tests)
- **ChromeDriver/GeckoDriver** (for local UI tests)
- **Test data files** in Excel/JSON format
- **Properties/config file** (`config.properties`) for environment configuration

---

## Technologies Used

- Java 8+
- Maven
- Cucumber
- TestNG
- Rest Assured
- Selenium WebDriver
- ExtentReports
- Apache POI
- JSON

> Additional dependencies:  
> - [Cucumber](https://cucumber.io/)  
> - [Rest Assured](https://rest-assured.io/)  
> - [TestNG](https://testng.org/)  
> - [Selenium WebDriver](https://www.selenium.dev/)  
> - [ExtentReports](https://extentreports.com/) for reporting

---

## Quick Start

1. **Clone the repository**
   ```bash
   git clone https://github.com/Arunkumar396/CucumberRestAssuredTestNG.git
   cd CucumberRestAssuredTestNG
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Configure test environment**
   - Edit `config.properties` for browser, base URL, etc.
   - Place test data in `testData.xlsx` and/or `ObjectRepository.json` as referenced in `Constants.java`.

4. **Run tests**
   - To run all tests (UI & API):
     ```bash
     mvn test
     ```
   - For specific features/scenarios, update your `CucumberOptions` in `MyTestRunner.java`.

---

## Project Structure

```bash
CucumberRestAssuredTestNG/
│
├── src/
│   └── test/
│       ├── java/
│       │   ├── api/                    # API request/response handling
│       │   ├── apiPojo/               # POJO classes for API payloads
│       │   ├── pages/                 # Page Object Model (UI elements/actions)
│       │   │   └── LoginPage.java
│       │   ├── setup/                 # Setup hooks & drivers
│       │   │   ├── ApplicationHooks.java
│       │   │   ├── ConfigReader.java
│       │   │   └── DriverFactory.java
│       │   ├── stepDefinition/        # Step definitions for BDD
│       │   │   ├── AppPlaceApi.java
│       │   │   └── LoginPageSteps.java
│       │   ├── testrunners/           # Cucumber TestNG runners
│       │   │   └── MyTestRunner.java
│       │   └── util/                  # Utility classes (Excel, Waits, JSON, Constants)
│       │       ├── Constants.java
│       │       ├── ElementUtil.java
│       │       ├── ExcelData.java
│       │       ├── SoftAssert.java
│       │       ├── StatusResult.java
│       │       ├── Status.java
│       │       └── Utility.java
│       │
│       └── resources/
│           └── features/              # Gherkin feature files and configs
│               ├── cucumber.properties
│               ├── extent.properties
│               └── extent-config.xml
│
├── test-input/                         # Input files (if any)
├── test-output/                        # Output, reports, logs
├── pom.xml                             # Maven project file (dependencies, plugins)
├── testng.xml                          # TestNG suite file
├── config.properties                   # Global configuration file
├── logging.txt                         # Log file
└── ObjectRepository.json               # JSON object repository
```

---

## Features

- **BDD with Cucumber**: Write test scenarios in Gherkin for easy communication
- **REST API Testing**: Use Rest Assured for robust API validation
- **UI Testing**: Selenium WebDriver integration for browser automation
- **TestNG Integration**: Parallel execution, reporting, and advanced assertions
- **Utilities**: File management, DB connection, random data generation, Excel/JSON data reading
- **Reporting**: ExtentReports for rich, interactive test reports

---

## References

- [Cucumber Documentation](https://cucumber.io/docs/)
- [Rest Assured Documentation](https://rest-assured.io/)
- [TestNG Documentation](https://testng.org/doc/)
- [ExtentReports Documentation](https://extentreports.com/docs/versions/5/java/)

---

## Contributors

[Arunkumar396](https://github.com/Arunkumar396)

---

## License

This project currently does not specify a license. Please add one if required.

---

## Major Components & Their Purpose

- **Feature Files**: Gherkin scenarios for behavior definition
- **Step Definitions**: Java implementation for each step
- **Test Runner**: Executes tests via TestNG
- **Setup & Hooks**: Manages browser setup, teardown, diagnostics
- **Utilities**: File, DB, waits, random data generation
- **Data & Config**: `.properties`, `.json`, `.xlsx` support
- **Reporting**: ExtentReports and TestNG XML reports

---

## Workflow & Use Cases

- Write scenarios → Implement steps → Configure data → Run tests → View reports
- API regression, UI automation, data-driven testing, reusable libraries, CI integration

---

## Summary

This project accelerates robust, maintainable test automation for APIs and web UIs, offering built-in tools for common test needs and detailed reporting.
