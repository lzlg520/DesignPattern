package com.lzlg.state;

import java.util.Random;

/**
 * 可以抽奖的状态
 */
public class CanRaffleState implements State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 可抽奖状态，此时积分已经扣除
    @Override
    public void deduceMoney() {
        System.out.println("已经扣除过积分！");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等！");
        Random r = new Random();
        int num = r.nextInt(10);
        if (num == 0) {// 10%的中奖几率
            // 抽中奖品，则修改状态为发放奖品
            activity.setCurrentState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品！");
            // 修改状态为不能抽奖
            activity.setCurrentState(activity.getNoRaffleState());
            return false;
        }

    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品！");
    }
}
