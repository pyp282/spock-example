package designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BusinessImplProxy implements InvocationHandler {
    private Object obj;

    public BusinessImplProxy(Object obj) {
        this.obj = obj;
    }

    public BusinessImplProxy() {
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        doBefore();
        object = method.invoke(obj,args);
        doAfter();
        return object;
    }

    public void doBefore() {
        System.out.println("do something before business logic");
    }

    public void doAfter() {
        System.out.println("do something after business logic");
    }

    public static Object factory(Object obj) {
        Class<?> clz = obj.getClass();
        return Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), new BusinessImplProxy(obj));
    }
}
