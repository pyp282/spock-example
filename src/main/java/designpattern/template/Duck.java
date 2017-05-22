package designpattern.template;

public class Duck implements Comparable{
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


    public int compareTo(Object obj) {
        Duck otherDuck = (Duck) obj;
        if(this.weight > otherDuck.weight){
            return 1;
        }else if(this.weight == otherDuck.weight){
            return 0;
        }else {
            return -1;
        }
    }
}
