package com.lzlg.proxy.dynamic;

/**
 * JDK动态代理：接口实现类，目标代理对象类
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中。。。。。");
    }
}
