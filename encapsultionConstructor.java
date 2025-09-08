class Account {
    private double balance;

    // Encapsulation using constructor
    Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class EncapsulationConstructor {
    public static void main(String[] args) {
        Account acc = new Account(5000);
        acc.deposit(2000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
