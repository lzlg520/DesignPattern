package com.lzlg.prototype;

/**
 * 如何实现深克隆
 * 1.实现Cloneable接口，重写clone方法
 * 2.实现对象的序列化接口Serializable，并使用对象流创建对象
 * 原型模式：使用克隆的时候不能很好的将引用对象复制重新创建一份
 */
public class Test {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("喜羊羊", 16);
        Sheep cloneSheep = sheep.deepClone();
        System.out.println("原来的羊：" + sheep + " hashCode is " + sheep.getFriend().hashCode());
        System.out.println("克隆的羊：" + cloneSheep + " hashCode is " + cloneSheep.getFriend().hashCode());
    }
}