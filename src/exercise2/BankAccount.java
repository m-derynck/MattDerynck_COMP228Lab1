package exercise2;

public class BankAccount {
    //Properties
    private int accountNumber;
    private String ownerName;
    private double balance;

    //returns the account number.
    public int getAccountNumber() {
        return accountNumber;
    }
    //returns the owner of this account.
    public String getOwnerName() {
        return ownerName;
    }
    //returns the balance of this account.
    public double getBalance() {
        return balance;
    }

    //BankAccount constructor
    public BankAccount(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //Withdraw money from account. *Note -  No overdraft protection.
    public void withdraw(double amount) {
        balance -= amount;
    }

    //Deposit money into account. *Note - I wish it was this easy to get free money.
    public void deposit(double amount) {
        balance += amount;
    }

    //returns all account info in a formatted string.
    public String getAccountInfo(){
        return String.format("Account Number: %s%nAccount Owner: %s%nAccount Balance: $%.2f%n",getAccountNumber(),getOwnerName(),getBalance());
    }

}
