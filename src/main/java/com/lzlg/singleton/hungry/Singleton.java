package com.lzlg.singleton.hungry;

/**
 * 单例模式：饿汉式
 * 1.线程安全
 * 2.浪费内存
 */
public class Singleton {
    private Singleton() {
    }

    /**
     * 静态变量
     */
//    private static final Singleton instance = new Singleton();

    private static final Singleton instance;

    /**
     * 静态代码块
     */
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
