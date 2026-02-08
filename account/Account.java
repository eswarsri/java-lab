package account;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String accountHolder;
    protected int age;
    protected String branch;
    protected String securityQuestion;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public Account(String accountNumber, String accountHolder, double initialBalance, int age, String branch, String question) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.branch = branch;
        this.age= age;
        this.securityQuestion= question;
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

    public void setAge(int age){
        this.age = age;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    public void setQuestion(String securityQuestion){
        this.securityQuestion = securityQuestion;
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
