package com.lzlg.prototype;

import java.io.Serializable;

public class Friend implements Cloneable, Serializable {
    private String name;
    private int age;

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
