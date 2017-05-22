package designpattern.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        SellInterface sellInterface = new RedwineProxy();
        sellInterface.sell();
    }

}
