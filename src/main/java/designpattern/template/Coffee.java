package designpattern.template;

public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("dripping coffee through filter");
    }

    public void addCondiments() {
        System.out.println("adding sugar and milk");
    }
}
