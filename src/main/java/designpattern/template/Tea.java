package designpattern.template;

public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("stepping into tea");
    }

    public void addCondiments() {
        System.out.println("adding lemon");
    }
}
