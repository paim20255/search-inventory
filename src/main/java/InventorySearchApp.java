import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class InventorySearchApp {
    public static void main(String[] args) {
        String inputFileName = "src/main/resources/inventory.csv";

        try {
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);



        } catch (FileNotFoundException e) {
            System.out.println("Sorry mate, that file doesn't exist: " + inputFileName);

        }


        ArrayList<Product> products = InventorySearchApp.getInventory();

    }

    private static ArrayList<Product> getInventory() {
        return null;
    }
}
