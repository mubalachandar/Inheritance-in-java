abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}


class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}


class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if(amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            
        } else {
            System.out.println("Exceeded overdraft limit or invalid withdrawal amount.");
        }
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(2000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(1000);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
    }
}