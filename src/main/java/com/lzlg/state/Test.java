package com.lzlg.state;

public class Test {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 15; i++) {
            System.out.printf("------第%d次抽奖------\n", (i + 1));
            activity.deduceMoney();

            activity.raffle();
        }
    }
}
