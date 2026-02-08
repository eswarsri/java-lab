package account;

public class SavingsAccount extends Account implements IAccounting {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited into Savings Account. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Savings Account. New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    @Override
    public void generateReport() {
        System.out.println("Generating Savings Account Report for " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    
    @Override
    public double calculateTax() {
        // Simple mock tax calculation on balance
        return balance * 0.05; 
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied: " + interest + ". New Balance: " + balance);
    }
}
