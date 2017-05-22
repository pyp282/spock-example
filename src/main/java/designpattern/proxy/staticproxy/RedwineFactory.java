package designpattern.proxy.staticproxy;

public class RedwineFactory implements SellInterface{
    public Object sell() {
        System.out.println(" called red wine factory");
        return new Object();
    }
}
