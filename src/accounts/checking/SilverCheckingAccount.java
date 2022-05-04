package accounts.checking;

import accounts.CheckingAccount;

public class SilverCheckingAccount extends CheckingAccount {
    public SilverCheckingAccount(double balance, double interestRate, int rewardPoints){
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public void status() {
        System.out.println("Silver Checking Account");
        System.out.printf("\tBalance: %.2f\n", balance);
        System.out.printf("\tRewards Points: %d\n\n", rewardPoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        return (int)(cost*25);
    }

    @Override
    public int getRewardPoints() {
        return super.getRewardPoints();
    }
}
