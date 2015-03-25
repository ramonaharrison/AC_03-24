package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * NameTracker.java
 */

import java.util.ArrayList;
import java.util.Scanner;

public class NameTracker {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me some names:");
        for (int i = 0; i < 5; i++) {
            names.add(sc.next());
        }
        System.out.println("Your " + names.size() + " names are saved. They are:");
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
        System.out.println("What name would you like to check for?");
        String name = sc.next();
        if (names.contains(name)) {
            System.out.println("That name is in the list!");
        } else {
            System.out.println("That name isn't in the list.");
        }
    }
}
