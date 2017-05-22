package designpattern.facade;

public class Client {

    public static void main(String[] args) {
        SecureFacade secureFacade = new SecureFacade();
        secureFacade.activate();
        System.out.println("=================");
        secureFacade.deActivate();
    }

}
