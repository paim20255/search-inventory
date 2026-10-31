import java.io.*;
import java.util.ArrayList;

public class InventorySearchApp {
    public static void main(String[] args) {
        //String inputFileName = "src/main/resources/inventory.csv";
        ArrayList<Product> inventory = getInventory();

        System.out.println("Our story carries: ");
        for (Product product : inventory){
            System.out.printf("Id : %d | %s | $%.2f%n");
        }




}

    private static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        return null;
    }
    }
