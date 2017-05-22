package designpattern.proxy.inceptor;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyObject implements InvocationHandler{
    private Object proxy_obj;
    private String method_name;
    private AopInterface aopInterface;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(this.aopInterface == null)
            throw new NullPointerException("aop is null");
        if(this.method_name == null)
            throw new NullPointerException("method name is null");

        Object o;

        if(method.toString().contains(method_name)){
            aopInterface.before(proxy_obj);
            o = method.invoke(proxy_obj, args);
            aopInterface.after(proxy_obj);
        }else {
            o = method.invoke(proxy_obj, args);
        }
        return o;
    }

    public Object factory(Object object) {
        proxy_obj = object;
        Class<?> cls = object.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    public String getMethod_name() {
        return method_name;
    }

    public void setMethod_name(String method_name) {
        this.method_name = method_name;
    }

    public AopInterface getAopInterface() {
        return aopInterface;
    }

    public void setAopInterface(AopInterface aopInterface) {
        this.aopInterface = aopInterface;
    }
}
