import accounts.Account;
import accounts.CheckingAccount;
import accounts.checking.GoldCheckingAccount;
import accounts.checking.DiamondCheckingAccount;
import accounts.checking.SilverCheckingAccount;
import accounts.SavingsAccount;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static Account account;
    public static CheckingAccount checkingAccount;
        public static SilverCheckingAccount silver;
        public static GoldCheckingAccount gold;
        public static DiamondCheckingAccount diamond;

        public static Scanner scanner = new Scanner(System.in);
    public static SavingsAccount savingsAccount;

    public static void main(String[] args){


        //accountsThroughAccount();
        //System.out.println(list);

        LinkedList<Integer> test = new LinkedList<>();


        //LinkedList<Integer> test = new LinkedList<>();
        //test.add(4);
        int count = 0;
        double intial = System.currentTimeMillis();
        for (int i = 0; i < 1000; i ++ )
        {
            count++;
            test.add(i);
        }
        double final1 = System.currentTimeMillis();


        intial = System.currentTimeMillis();

        System.out.println(final1 -  intial);
        System.out.println(test.get(999));
        final1 = System.currentTimeMillis();
        System.out.println(final1 -  intial);

//        for (int i = (test.size() - 1); i >= 0; i--){
//            System.out.println(test.get(i));
//        }

    }

    public static void accountsThroughAccount(){

        ArrayList<CheckingAccount> accounts = new ArrayList<>();
        accounts.add(new SilverCheckingAccount(450,0.015,957));
        accounts.add(new DiamondCheckingAccount(3200,0.029,1770));
        //accounts.add(new SavingsAccount(7214, .044));
        accounts.add(new GoldCheckingAccount(5578, 0.0285, 785));
        //accounts.add(new CheckingAccount(838,0.026,7853));
        //accounts.add(new SavingsAccount(992,0.019));
        //accounts.add(new Account(340,0.019));

        for (Account i : accounts){
            i.status();
            System.out.println();
        }
    }

    public static void checkingAccountTypes(){
        silver = new SilverCheckingAccount(10000, 0.075, 700);
        gold = new GoldCheckingAccount(10000, 0.075, 700);
        diamond = new DiamondCheckingAccount(10000, 0.085, 700);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());

        silver.purchase(175);
        gold.purchase(175);
        diamond.purchase(175);

        System.out.println(silver.getRewardPoints());
        System.out.println(gold.getRewardPoints());
        System.out.println(diamond.getRewardPoints());
    }

    public static void checkSavingsAccountWithdrawer(){
        checkingAccount = new GoldCheckingAccount(100, 0.075, 700);
        savingsAccount = new SavingsAccount(100,.085);

        checkingAccount.status();
        savingsAccount.status();

        checkingAccount.withdraw(10);
        savingsAccount.withdraw(10);

        checkingAccount.status();
        savingsAccount.status();
    }

    public static void checkRewardsPointIncreases(){
        checkingAccount = new SilverCheckingAccount(100, 0.075, 700);

        checkingAccount.status();
        checkingAccount.withdraw(45.86);
        checkingAccount.status();
        checkingAccount.deposit(10.00);
        checkingAccount.status();
        checkingAccount.withdraw(25.00);
        checkingAccount.status();


        System.out.println(checkingAccount.getRewardPoints());
        if (checkingAccount.purchase(18.63)){
            System.out.println("Purchase Successful!!");
        }
        else{
            System.out.println("Purchase Failed!!");
        }
        System.out.println(checkingAccount.getRewardPoints());
    }
}
