package com.lzlg.proxy.state;

/**
 * 静态代理：代理工厂
 */
public class ProxyFactory implements ITeacherDao {

    private ITeacherDao target;

    public ProxyFactory(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("静态代理中。。。。。");
        target.teach();
        System.out.println("静态代理结束。。。。");
    }
}
