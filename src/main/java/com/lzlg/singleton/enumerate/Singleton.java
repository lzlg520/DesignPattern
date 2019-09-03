package com.lzlg.singleton.enumerate;

/**
 * 单例类：使用枚举实现
 * 1.线程安全
 * 2.JDK1.5之后推荐使用
 * 3.同时能避免反序列化造成多个对象的创建
 */
public enum Singleton {
    INSTANCE;

    public void say() {
        System.out.println("Hello World!");
    }
}
