import java.io.*;
import java.util.ArrayList;

public class InventorySearchApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        System.out.println("Our story carries: ");
        for (Product product : inventory){
            System.out.printf("Id : %d | %s | $%.2f%n",
                    product.getId(), product.getName(), product.getPrice());
        }
}

    private static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(104, "Hammer", 19.49));
        inventory.add(new Product(105, "Wireless Mouse", 24.99));
        inventory.add(new Product(106, "Mechanical Keyboard", 79.50));
        inventory.add(new Product(107, "USB-C Cable", 9.99));
        inventory.add(new Product(108, "27-inch Monitor", 189.00));
        inventory.add(new Product(109, "Laptop Stand", 34.75));

        return inventory;
    }
    }
