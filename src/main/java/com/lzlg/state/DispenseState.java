package com.lzlg.state;

/**
 * 发放奖品状态
 */
public class DispenseState implements State {
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("不能扣除积分！");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖！");
        return false;
    }

    @Override
    public void dispensePrize() {
        // 判断奖品数量是否充足
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖了！");
            activity.setCurrentState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品已经发送完了！");
            // 抽奖活动结束
            activity.setCurrentState(activity.getDispenseOutState());
            System.out.println("抽奖活动结束！");
            System.exit(0);
        }
    }
}
