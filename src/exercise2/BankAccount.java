package exercise2;

public class BankAccount {
    //Properties
    private int accountNumber;
    private String ownerName;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }


    public BankAccount(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void withdraw(double amount) {

    }

    public void deposit(double amount) {

    }

    public String getAccountInfo(){
        return "";
    }

}
