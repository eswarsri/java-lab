# Account System Demo

This project demonstrates core Object-Oriented Programming (OOP) concepts in Java: **Inheritance**, **Abstraction**, and **Interfaces**.

## Project Structure

The project is contained within the `account` package:

-   **`Account.java`** (Abstract Class): The base class for all bank accounts. It defines common properties (`accountNumber`, `balance`) and behaviors (`deposit`, `withdraw`). It cannot be instantiated directly.
-   **`SavingsAccount.java`** (Concrete Class): specific implementation of an account that earns interest.
-   **`CurrentAccount.java`** (Concrete Class): specific implementation that allows overdrafts.
-   **`IAccounting.java`** (Interface): Defines accounting-related capabilities (`generateReport`, `calculateTax`) that must be implemented by conforming classes.
-   **`AccountDemo.java`**: A driver class to demonstrate the functionality.

## Key Concepts

### 1. Abstract Classes (`Account`)
The `Account` class is declared as `abstract`.
-   **Why?** generic "Account" concept shouldn't exist on its own; it must be a specific type (Savings or Current).
-   It provides a partial implementation (storing balance, holder name) but leaves specific logic (`deposit`, `withdraw`) to subclasses.

### 2. Inheritance (`extends`)
`SavingsAccount` and `CurrentAccount` extend `Account`.
-   **Benefit**: Code reuse. They inherit fields and methods from `Account`, focusing only on their unique features (interest rates vs. overdraft limits).

### 3. Interfaces (`implements`)
Both concrete classes implement the `IAccounting` interface.
-   **Why?** This enforces a contract. Any class implementing `IAccounting` *must* provide logic for `generateReport()` and `calculateTax()`, ensuring consistency across different account types.

### 4. Polymorphism
The demo shows how we can treat different objects uniformly:
```java
// Treating a SavingsAccount as a generic Account
Account acc = new SavingsAccount(...);

// Treating a CurrentAccount as an IAccounting object
IAccounting accounting = new CurrentAccount(...);
```

## How to Run

1.  Open a terminal in the project root (the parent directory of `account`).
2.  Compile the code:
    ```bash
    javac account/*.java
    ```
3.  Run the demo:
    ```bash
    java account.AccountDemo
    ```
