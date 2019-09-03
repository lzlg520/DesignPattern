package com.lzlg.proxy.state;

/**
 * 静态代理客户端
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        ITeacherDao teacherDao = new TeacherDao();
        // 创建代理对象
        ProxyFactory factory = new ProxyFactory(teacherDao);
        factory.teach();
    }
}
