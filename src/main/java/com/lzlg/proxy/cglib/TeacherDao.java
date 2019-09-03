package com.lzlg.proxy.cglib;

/**
 * cglib动态代理：目标对象类，无需实现任何接口
 * 由于要生成目标对象的子类，故不能调用static/final方法
 * 类不能是final类
 */
public class TeacherDao {
    public void teach() {
        System.out.println("老师正在授课中。。。。。");
    }
}
