package designpattern.proxy.inceptor;

public class Client {
    public static void main(String[] args) {
        ProxyObject po = new ProxyObject();
        po.setAopInterface(new AopInterfaceImpl());
        po.setMethod_name("acc");

        SubInterface si = (SubInterface) po.factory(new SubInterfaceImpl());
        si.add("tt", "dd");

        si.acc("tt");
    }


}
