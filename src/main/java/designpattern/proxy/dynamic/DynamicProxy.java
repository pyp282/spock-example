package designpattern.proxy.dynamic;

public class DynamicProxy {
    public static void main(String[] args) {
        BusinessFooImpl bfoo = new BusinessFooImpl();
        BusinessFoo bf = (BusinessFoo) BusinessImplProxy.factory(bfoo);
        bf.foo();
        System.out.println();

        BusinessBarImpl bbar = new BusinessBarImpl();
        BusinessBar bb = (BusinessBar) BusinessImplProxy.factory(bbar);
        String message = bb.bar("Hello,World");
        System.out.println(message);

    }
}
