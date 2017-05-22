package designpattern.proxy.dynamic;

public class BusinessBarImpl implements BusinessBar {
    public String bar(String message) {
        System.out.println("BusinessBarImpl.foo()");
        return message;
    }
}
