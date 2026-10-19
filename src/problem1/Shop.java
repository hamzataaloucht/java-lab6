package problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<>();


        Scanner scan = new Scanner(System.in);
        String keepShopping;

        do {
            Item item;
            String itemName;
            double itemPrice;
            int quantity;

            System.out.print("Enter the name of the item: ");
            itemName = scan.nextLine();

            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();

            scan.nextLine();

            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);

            double total = 0.0;
            for (Item cartItem : cart) {
                System.out.println(cartItem);
                total += cartItem.getPrice() * cartItem.getQuantity();
            }
            System.out.printf("Total: %.2f%n", total);

            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        } while (keepShopping.equals("y"));

        scan.close();
    }
}
