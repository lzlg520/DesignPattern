package com.lzlg.state;

/**
 * 状态模式接口
 */
public interface State {
    // 扣除积分 -50
    void deduceMoney();

    // 是否抽中奖品
    boolean raffle();

    // 发放奖品
    void dispensePrize();
}
