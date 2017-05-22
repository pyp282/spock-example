package designpattern.proxy.inceptor;


public class AopInterfaceImpl implements AopInterface {
    public void before(Object object) {
        System.out.println("AopInterfaceImpl.before()");
    }

    public void after(Object object) {
        System.out.println("AopInterfaceImpl.after()");
    }
}
