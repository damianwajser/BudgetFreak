# BudgetFreak

| Build | Code Quality |
|---|---|
| [![CircleCI](https://circleci.com/gh/BudgetFreak/BudgetFreak.svg?style=svg)](https://circleci.com/gh/BudgetFreak/BudgetFreak)| [![SonarCloud](https://sonarcloud.io/api/project_badges/measure?project=de.budgetfreak%3Abudgetfreak&metric=alert_status)](https://sonarcloud.io/dashboard?id=de.budgetfreak%3Abudgetfreak) |
 
## Code Quality

* Builds on CircleCI
* Linting by sonarcloud: https://sonarcloud.io/organizations/budgetfreak-github/projects

## How to contribute

See our [contribution guide](https://github.com/BudgetFreak/BudgetFreak/blob/master/.github/CONTRIBUTING.md).
```plantuml
@startuml
    skinparam backgroundColor #EEEBDC
    skinparam handwritten true
    actor Customer
    Customer -> "login()" : username & password
    "login()" -> Customer : session token
    activate "login()"
    Customer -> "placeOrder()" : session token, order info
    "placeOrder()" -> Customer : ok
    Customer -> "logout()"
    "logout()" -> Customer : ok
    deactivate "login()"
@enduml
```
