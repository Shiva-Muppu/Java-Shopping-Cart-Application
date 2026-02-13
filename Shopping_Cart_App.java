
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping_Cart_App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> foods = new ArrayList<>();
        List<Double> prices = new ArrayList<>();
        double total = 0.0;

        System.out.println("Welcome to the Shopping Cart!");
        System.out.println("Type 'q' anytime to finish.\n");

        while (true) {
            System.out.print("Enter the food item to buy (q to quit): ");
            String food = scanner.nextLine().trim();

            if (food.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Enter the price of " + food + ": ");
            try {
                double price = Double.parseDouble(scanner.nextLine().trim());
                foods.add(food);
                prices.add(price);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price. Please enter a numeric value.");
            }
        }

        System.out.println("\n----- YOUR CART -----");
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i) + " - $" + prices.get(i));
            total += prices.get(i);
        }

        System.out.printf("Total Amount: $%.2f%n", total);
        System.out.println("Thank you for shopping with us!");

        scanner.close();
    }
}
