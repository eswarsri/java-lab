package account;

public class CurrentAccount extends Account implements IAccounting {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited into Current Account. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Current Account. New Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount.");
        }
    }

    @Override
    public void generateReport() {
        System.out.println("Generating Current Account Report for " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    @Override
    public double calculateTax() {
        // Simple mock tax calculation for current account
        return balance * 0.02;
    }
}
