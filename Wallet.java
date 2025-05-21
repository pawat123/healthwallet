
public class Wallet {
    private double balance;

    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added $" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void spendFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Spent $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
