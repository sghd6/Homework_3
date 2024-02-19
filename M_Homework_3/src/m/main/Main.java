package m.main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StockManagerSingleton instance
        StockManagerSingleton stockManager = StockManagerSingleton.getInstance();

        // Initialize stock from CSV
        if (!stockManager.initializeStock()) {
            System.out.println("Failed to initialize stock from CSV file.");
            return;
        }

        // Example operations on the stock
        performStockOperations(stockManager);

        // Save the updated stock back to CSV
        if (!stockManager.saveStock()) {
            System.out.println("Failed to save updated stock back to CSV file.");
        }
    }

    private static void performStockOperations(StockManagerSingleton stockManager) {
        // Add a new media product
        MediaProduct newProduct = new VinylRecordProduct("New Album", 19.99, 2021, Genre.ROCK);
        if (stockManager.addItem(newProduct)) {
            System.out.println("New product added successfully.");
        }

        // Update the price of an existing product
        if (stockManager.updateItemPrice(newProduct, 21.99)) {
            System.out.println("Product price updated successfully.");
        }

        // Remove a product
        if (stockManager.removeItem(newProduct)) {
            System.out.println("Product removed successfully.");
        }

        // Get and print products below a certain price
        ArrayList<MediaProduct> affordableProducts = stockManager.getMediaProductBelowPrice(15);
        stockManager.printListOfMediaProduct(affordableProducts);
    }
}

