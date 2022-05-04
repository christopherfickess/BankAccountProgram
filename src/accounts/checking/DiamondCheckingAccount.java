package accounts.checking;

import accounts.CheckingAccount;

public class DiamondCheckingAccount extends CheckingAccount {
    public DiamondCheckingAccount(double balance, double interestRate, int rewardPoints){
        super(balance, interestRate, rewardPoints);
    }
    @Override
    public void status() {
        System.out.println("Diamond Checking Account");
        System.out.printf("\tBalance: %.2f\n", balance);
        System.out.printf("\tRewards Points: %d\n\n", rewardPoints);
    }
    @Override
    public int calculateRewardPoints(double cost) {
        int rewards = 0;

        if(cost > 500){
            rewards += (cost - 500) * 80;
            cost = 500;
        }
        if(cost > 100){
            rewards += (cost - 100) * 65;
            cost = 100;
        }

        rewards += cost * 40;
        return rewards;
    }

    @Override
    public int getRewardPoints() {
        return super.getRewardPoints();
    }
}
