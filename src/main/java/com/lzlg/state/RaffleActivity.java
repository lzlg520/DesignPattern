package com.lzlg.state;

/**
 * 状态模式：抽奖活动
 */
public class RaffleActivity {
    // 记录当前状态
    State currentState;
    // 奖品数量
    int count;


    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    /**
     * 初始化，将活动状态初始化为noRaffleState状态
     * 奖品数量初始化
     *
     * @param count
     */
    public RaffleActivity(int count) {
        this.currentState = noRaffleState;
        this.count = count;
    }

    /**
     * 扣除积分
     */
    public void deduceMoney() {
        currentState.deduceMoney();
    }

    /**
     * 抽奖
     */
    public void raffle() {
        // 判断是否抽中
        if (currentState.raffle()) {
            // 抽中奖品，领取奖品
            currentState.dispensePrize();
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getCount() {
        int currentCount = count;
        count--;
        return currentCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
