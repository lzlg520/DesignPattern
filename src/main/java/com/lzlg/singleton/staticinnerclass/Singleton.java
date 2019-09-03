package com.lzlg.singleton.staticinnerclass;

/**
 * 单例模式：饱汉式
 * 使用静态内部类实现
 * 1.线程安全
 * 2.静态内部类不会随着主类进行加载，只有在需要的时候才类加载保证了线程安全
 */
public class Singleton {
    private Singleton() {
    }

    private static class Instance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Instance.INSTANCE;
    }
}
