package accounts;

public abstract class Account {
    protected double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public boolean withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds");
            return false;
        }
        balance -= amount;
        return true;
    }

    public void status(){
        System.out.printf("BALANCE: %.2f\n", balance);
    }

    public boolean deposit(double amount){
        if (amount <= 0){
            System.out.println("Can't deposit negative money");
            return false;
        }

        System.out.printf("Deposited: %.2f\n", amount);
        balance += amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
