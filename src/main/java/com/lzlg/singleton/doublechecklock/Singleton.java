package com.lzlg.singleton.doublechecklock;

/**
 * 单例模式：饱汉式
 * 双重锁检查
 * 1.线程安全
 * 2.效率较高
 */
public class Singleton {
    /**
     * 注意必须有volatile关键字，为了防止指令重排序
     */
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
