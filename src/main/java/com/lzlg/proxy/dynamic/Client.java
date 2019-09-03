package com.lzlg.proxy.dynamic;

/**
 * JDK动态代理客户端
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        ProxyFactory factory = new ProxyFactory(teacherDao);
        ITeacherDao proxyDao = (ITeacherDao) (factory.getProxyInstance());
        proxyDao.teach();
    }
}
