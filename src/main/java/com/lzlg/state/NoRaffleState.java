package com.lzlg.state;

/**
 * 状态模式：不能抽奖状态
 */
public class NoRaffleState implements State {

    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 不能抽奖状态可以扣除积分，积分扣除后变为可抽奖状态
    @Override
    public void deduceMoney() {
        System.out.println("扣除积分50，您可以抽奖了！");
        // 设置当前状态为可抽奖状态
        activity.setCurrentState(activity.getCanRaffleState());
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣除积分才可抽奖哦！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品！");
    }
}
