package designpattern.template;


public abstract class CaffeineBeverage {
    final void prepareRecipe() {

    }

    public void boilWater() {
        System.out.println("water is boiling");
    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("pouring water into cup");
    }

    public abstract void addCondiments();
}
