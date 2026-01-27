public class method {

public static int deposit(int balance, int amount) {
        balance = amount;
        System.out.println("Deposited: " + amount);
        return balance;
    }

    public static int deposit(int balance, int amount, String message) {
        balance = amount;
        System.out.println(message + ": " + amount);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Withdrawal cancelled.");
            return balance;
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            return balance;
        }
    }

    public static void checkBalance(int balance) {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        int balance = 1000;

        checkBalance(balance);
        balance = deposit(balance, 200);
        checkBalance(balance);
        balance = deposit(balance, 500, "Paycheck Deposit");
        checkBalance(balance);
        balance = withdraw(balance, 300);
        checkBalance(balance);
        balance = withdraw(balance, 2000);
        checkBalance(balance);

        int fakeBalance = balance;
        withdraw(fakeBalance, 100);
        System.out.println("\nAfter calling withdraw(fakeBalance, 100) without saving return:");
        checkBalance(balance);
    }
}









    
}
