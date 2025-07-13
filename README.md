# HealthService Automation Testing

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=JUnit5&logoColor=white)

> Automation Testing Project for CURA Healthcare Web using Java, Cucumber, Selenium, and JUnit.

---

## 📌 Website Under Test

**CURA Healthcare Service**  
🔗 [https://katalon-demo-cura.herokuapp.com](https://katalon-demo-cura.herokuapp.com)

---

## 🧰 Tech Stack

- Java 11
- Maven
- Selenium WebDriver
- Cucumber (Gherkin)
- JUnit 4
- WebDriverManager
- ExtentReports (for reporting)
- Page Object Model (POM)

---

## 📁 Project Structure

```
HealthService-AutomationTesting/
├── src/
│   └── test/
│       ├── java/
│       │   ├── pages/                # Page Object classes
│       │   ├── stepdefinitions/      # Step Definitions (Cucumber steps)
│       │   ├── runners/              # Test Runner classes
│       │   └── utils/                # DriverSingleton, Helpers, etc.
│       └── resources/
│           └── features/             # Gherkin Feature files
├── pom.xml                           # Maven dependencies
└── README.md
```

---

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/HealthService-AutomationTesting.git
cd HealthService-AutomationTesting
```

### 2. Install Dependencies
```bash
mvn clean install
```

### 3. Run Tests
```bash
mvn test
```

📄 Cucumber HTML Report will be generated at:
```
target/cucumber-report.html
```

---

## 🧪 Test Scenarios

### ✅ Successful Login
```gherkin
Scenario: Successful login with valid credentials
Given User is on the login page
When User enters valid username and password
And User clicks the login button
Then User should be redirected to the Make Appointment page
```

(Coming soon: negative login, book appointment, logout)

---

## 📊 Reports

- ✅ Cucumber HTML Report → `target/cucumber-report.html`
- 🧪 (Coming soon) ExtentReports for advanced reporting

---

## 📌 To Do

- [x] Implement login scenario
- [ ] Add negative login test
- [ ] Add book appointment test
- [ ] Add logout scenario
- [ ] Integrate ExtentReports
- [ ] Configure CI/CD pipeline (GitHub Actions)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).