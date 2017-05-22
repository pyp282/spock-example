package designpattern.template;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 4),
                new Duck("Donald", 12),

        };

        System.out.println("Before sorting: ");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("After sorting");
        display(ducks);
    }
}
