package com.lzlg.prototype;

import java.io.*;

public class Sheep implements Cloneable, Serializable {
    private String name; // String类在克隆时，不会克隆其引用
    private int age;
    private Friend friend; // 引用对象

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
        this.friend = new Friend(name, age);
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

    public Friend getFriend() {
        return friend;
    }

    // 深拷贝：方法1重写clone方法
    @Override
    protected Object clone() {
        try {
            Sheep cloneSheep = (Sheep) super.clone();
            cloneSheep.friend = (Friend) this.friend.clone();
            return cloneSheep;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 深拷贝：方法2使用序列化方式
    public Sheep deepClone() {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (Sheep) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
