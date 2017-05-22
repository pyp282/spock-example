package designpattern.proxy.inceptor;

public class SubInterfaceImpl implements SubInterface{
    public void add(String value1, String value2) {
        System.out.println("ImpObject add(String value1,String value2)");
    }

    public void acc(String value1) {
        System.out.println("ImpObject acc(String value1)");
    }
}
