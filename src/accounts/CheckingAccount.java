package accounts;

import accounts.Account;
import com.sun.security.jgss.GSSUtil;

public abstract class CheckingAccount extends Account {

    public int rewardPoints;
    public CheckingAccount(double balance, double interestRate, int rewardPoints){
        super( balance,  interestRate);
        this.rewardPoints = rewardPoints;
        //System.out.println("Checking Account:  ");
    }

    public boolean purchase(double cost){
        if (cost >= balance ){
            System.out.println("Checking Account Balance Insufficient:  \n");
            return false;
        }

        balance -= cost;
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }

    public abstract int calculateRewardPoints(double cost);

    @Override
    public void status() {
        System.out.println("Checking Account");
        System.out.printf("\tBalance: %.2f\n", balance);
        System.out.printf("\tRewards Points: %d\n\n", rewardPoints);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }
}
