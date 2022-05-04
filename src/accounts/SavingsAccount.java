package accounts;

import accounts.Account;

public class SavingsAccount extends Account {
    public SavingsAccount(double balance, double interestRate){
        super(balance, interestRate);
        //System.out.println("Savings Account:  ");
    }

    @Override
    public void status() {
        System.out.println("Savings Account");
        System.out.printf("\tBalance: %.2f\n\n", balance);
    }

    @Override
    public boolean withdraw(double amount){
        double fee = 0.025 * amount;
        amount += fee;

        return super.withdraw(amount);
    }
}
