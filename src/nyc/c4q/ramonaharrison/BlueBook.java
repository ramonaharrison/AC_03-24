package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * BlueBook.java
 * This class asks the user which car they have and prints its price.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BlueBook {

    public static void main(String[] args) {
        // 1. Create a Scanner for user input.
        Scanner scanner = new Scanner(System.in);

        ArrayList<Car> cars = createCarList();

        while(true) {

            // 4. Prompt the user for the car's make, model, and year, and store the inputs in variables.
            System.out.println("\nPlease enter a make:");
            String make = scanner.next();
            System.out.println("Please enter a model:");
            String model = scanner.next();
            System.out.println("Please enter a year:");
            int year = scanner.nextInt();

            // 5. Iterate over your ArrayList of cars and check for a Car instance that has the same...
            //    ...make
            //    ...model
            //    ...year
            boolean found = false;
            for (int i = 0; i < cars.size(); i++) {
                if (make.equalsIgnoreCase(cars.get(i).getMake()) && model.equalsIgnoreCase(cars.get(i).getModel()) && (year == cars.get(i).getYear())) {
                    System.out.printf("This car costs $%.2f.\n", cars.get(i).getPrice());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("That car wasn't in the list, but we'll add it. Please enter a price:");
                double price = scanner.nextInt();
                Car newCar = new Car(make, model, year, price);
                cars.add(newCar);
            }
        }

        // 6. Print the price of that car.
    }

    public static ArrayList<Car> createCarList() {
        // 2. Create an ArrayList that holds type Car.
        ArrayList<Car> cars = new ArrayList<Car>();

        // 3. Create a few new Car objects and add them to the ArrayList.
        Car honda = new Car("Honda", "Accord", 2003, 4000);
        Car toyota = new Car("Toyota", "Corolla", 1999, 2000);
        Car volvo = new Car("Volvo", "V70", 1995, 900);
        Car ford = new Car("Ford", "Focus", 2010, 10000);

        cars.add(honda);
        cars.add(toyota);
        cars.add(volvo);
        cars.add(ford);

        return cars;
    }
}