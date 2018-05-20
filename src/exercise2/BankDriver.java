package exercise2;

import javax.swing.JOptionPane;

public class BankDriver {
    public static void main(String[] args) {

        //Input variables
        int accountNumber = 0;
        String ownerName;
        double balance;

        //Try to get a valid account number
        boolean validAccNum = false;
        do {
            try {
                accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter your account number"));
                validAccNum = true;
            } catch (Exception e) {
                //Account number was invalid, display dialog and try again.
                JOptionPane.showMessageDialog(null, "Invalid Account Number!");
            }
        }
        while (!validAccNum);

        //Get account owner name
        ownerName = JOptionPane.showInputDialog("Enter account owner's name");

        //Try to get a valid balance
        balance = getInputDouble("Enter account balance","Invalid Balance!");

        //Intialize new bank account with input values.
        BankAccount newAccount = new BankAccount(accountNumber, ownerName, balance);
        //Display the account menu.
        displayAccountMenu(newAccount);

    }

    //Creates a option dialog showing the account information and menu options to deposit, withdraw or exit.
    public static void displayAccountMenu(BankAccount account) {
        Object[] options = {"Deposit", "Withdraw", "Exit"};
        int selection = JOptionPane.showOptionDialog(null, account.getAccountInfo(),
                "Account Menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
        //Deposit option selected
        if (selection == JOptionPane.YES_OPTION) {
            account.deposit(getInputDouble("Enter amount to deposit into account", "Invalid deposit amount!"));
            displayAccountMenu(account);
        } else if (selection == JOptionPane.NO_OPTION) {//Withdraw option selected
            account.withdraw(getInputDouble("Enter amount to withdraw from account", "Invalid withdrawal amount!"));
            displayAccountMenu(account);
        }
    }

    //Helper method to parse and return a double from user input
    public static Double getInputDouble(String inputMessage, String exceptionMessage) {
        double inputDouble;
        do {
            try {
                inputDouble = Double.parseDouble(JOptionPane.showInputDialog(inputMessage));
                return inputDouble;
            } catch (Exception e) {
                //Input was invalid, display exception.
                JOptionPane.showMessageDialog(null, exceptionMessage);
            }
        }
        while (true);
    }
}
