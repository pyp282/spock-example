package designpattern.proxy.staticproxy;

public class RedwineProxy implements SellInterface {
    private RedwineFactory redwineFactory;
    private static int sell_count = 0;

    public RedwineProxy() {
        this.redwineFactory = new RedwineFactory();
    }

    public Object sell() {
        preSell();
        Object redWine = redwineFactory.sell();
        sell_count++;
        proSell();
        return redWine;
    }

    protected void preSell() {
        System.out.println("red wine is ready to sold");
    }

    protected void proSell() {
        System.out.println("red wine number: " + sell_count);
    }
}
