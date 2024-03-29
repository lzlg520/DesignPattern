package com.lzlg.state;

/**
 * 奖品发放完毕状态
 * 整个抽奖活动结束
 */
public class DispenseOutState implements State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品发送完了，请下次再参加！");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加！");
    }
}
