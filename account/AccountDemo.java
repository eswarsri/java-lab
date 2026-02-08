package account;

public class AccountDemo {
    static void printAccountDetails(Account account) {
        System.out.println("Account Details: " + account);
    }
    static void generateReportForAccount(IAccounting accounting) {
        System.out.println("Account Details: " + accounting);
    }
    
    public static void main(String[] args) {
        System.out.println("--- Account Abstraction & Interface Demo ---");

        SavingsAccount sa = new SavingsAccount("SA1001", "Alice", 5000.0, 2.5);
        CurrentAccount ca = new CurrentAccount("CA2001", "Bob", 2000.0, 1000.0);

        System.out.println("\n--- Savings Account Operations ---");
        sa.deposit(1000);
        sa.withdraw(2000);
        sa.applyInterest();
        sa.generateReport();
        System.out.println("Estimated Tax: " + sa.calculateTax());


        System.out.println("\n--- Current Account Operations ---");
        ca.deposit(500);
        ca.withdraw(3000); // Should be allowed due to overdraft
        ca.withdraw(5000); // Should fail
        ca.generateReport();
        System.out.println("Estimated Tax: " + ca.calculateTax());

        printAccountDetails(sa);
        printAccountDetails(ca);

        generateReportForAccount(sa);
        generateReportForAccount(ca);

        System.out.println("\n--- Polymorphism Demo ---");
        Account acc1 = new SavingsAccount("SA1002", "Charlie", 3000, 3.0);
        acc1.deposit(500);
        // acc1.applyInterest(); // Not accessible via Account reference without casting
        System.out.println("Account 1 Balance: " + acc1.getBalance());
        
        // Polymorphic behavior with Interface
        IAccounting accounting = new CurrentAccount("CA2002", "Diana", 4000, 500);
        accounting.generateReport();
    }
}
