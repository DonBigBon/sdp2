package as2sdp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Coffee coffee = createCoffeeOrder(scanner);

        System.out.println("Description of your order: " + coffee.getDescription() + ", Cost: $" + coffee.cost());

        scanner.close();
    }

    private static Coffee createCoffeeOrder(Scanner scanner) {
        System.out.println("Choose your coffee type:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Americano");

        int coffeeChoice = scanner.nextInt();
        Coffee baseCoffee;

        switch (coffeeChoice) {
            case 1:
                baseCoffee = new Espresso();
                break;
            case 2:
                baseCoffee = new Latte();
                break;
            case 3:
                baseCoffee = new Americano();
                break;
            default:
                throw new IllegalArgumentException("Invalid coffee choice");
        }

        System.out.println("Do you want to add condiments? (yes/no)");
        String addCondiments = scanner.next().toLowerCase();

        if (addCondiments.equals("yes")) {
            baseCoffee = addCondiments(scanner, baseCoffee);
        }

        return baseCoffee;
    }

    private static Coffee addCondiments(Scanner scanner, Coffee coffee) {
        while (true) {
            System.out.println("Choose condiment to add:");
            System.out.println("1. Milk");
            System.out.println("2. Sugar");
            System.out.println("3. Vanilla");
            System.out.println("4. Finish");

            int condimentChoice = scanner.nextInt();

            switch (condimentChoice) {
                case 1:
                    coffee = new Milk(coffee);
                    break;
                case 2:
                    coffee = new Sugar(coffee);
                    break;
                case 3:
                    coffee = new Vanilla(coffee);
                    break;
                case 4:
                    return coffee;
                default:
                    throw new IllegalArgumentException("Invalid condiment choice");
            }
        }
    }
}