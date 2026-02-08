package account;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String accountHolder;
    protected int age;
    protected String branch;

    public Account(String accountNumber, String accountHolder, double initialBalance, int age, String branch) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.branch = branch;
        this.age= age;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountHolder='" + accountHolder + '\'' +
                '}';
    }
}
