package accounts.checking;

import accounts.CheckingAccount;

public class GoldCheckingAccount extends CheckingAccount {
    public GoldCheckingAccount(double balance, double interestRate, int rewardPoints){
        super(balance, interestRate, rewardPoints);
    }
    @Override
    public void status() {
        System.out.println("Gold Checking Account");
        System.out.printf("\tBalance: %.2f\n", balance);
        System.out.printf("\tRewards Points: %d\n\n", rewardPoints);
    }
    @Override
    public int calculateRewardPoints(double cost) {
        return (int)(Math.min(cost, 4000)*50);
    }

    @Override
    public int getRewardPoints() {
        return super.getRewardPoints();
    }
}
