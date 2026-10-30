import java.io.*;
import java.util.ArrayList;

public class InventorySearchApp {
    public static void main(String[] args) {
        String inputFileName = "src/main/resources/inventory.csv";

        try {
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            line = bufferedReader.readLine();
            while (line != null) {
                Product product = parseProduct(line);

                System.out.printf("%d, %s, %f\n", product.getId(), product.getName(), product.getPrice());

                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Sorry mate, that file doesn't exist: " + inputFileName);

        } catch (IOException e) {
            System.out.println("Not sure what's up, some kinda I/O problem");
        }


        ArrayList<Product> products = InventorySearchApp.getInventory();

    }

    private static Product parseProduct(String line) {
        return null;

    }

    private static ArrayList<Product> getInventory() {
        return null;
    }
}
